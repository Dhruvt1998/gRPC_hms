# Hospital Management System · Distributed Backend

A university project exploring distributed systems through hospital bed management. Each hospital runs as an independent Java node, exchanges information with other hospitals over gRPC, and participates in leader election using the Bully algorithm.

The project connects distributed backend concepts with a practical user interface: the elected leader submits hospital data to an HTTP aggregation service, which supplies the companion [React dashboard](https://github.com/Dhruvt1998/Hospitals_Client).

## Project overview

The system models hospitals that maintain their own bed availability while sharing information across a network. Its central engineering challenge is coordinating independent nodes and making their combined data available to users.

This is an academic prototype. It demonstrates distributed communication and coordination concepts; it is not a deployed clinical system.

## Main capabilities

- Represent a hospital with an ID, name, network address, and bed counts.
- Exchange hospital information and bed availability through gRPC services.
- Support leader election and coordinator announcements using the Bully algorithm.
- Start an initial hospital node or join an existing network through a known peer.
- Inspect hospital records and update available beds through an interactive console.
- Store hospital configuration and network records in JSON files.
- Submit hospital data from the leader to an HTTP aggregation service.

## System architecture

| Component | Responsibility |
| --- | --- |
| Hospital node | Maintain local hospital information and communicate with peers |
| gRPC hospital service | Exchange bed availability and hospital records |
| Bully election service | Exchange election and coordinator messages |
| Leader node | Submit hospital records to the aggregation service |
| HTTP aggregation service | Expose aggregated records and timestamps to the frontend |
| React dashboard | Display hospital capacity and combined totals |

The design uses gRPC for communication between Java nodes and HTTP for integration with the dashboard's data service. The aggregation service is a separate dependency; its implementation is not included in this repository or the frontend repository.

## Technologies

| Technology | Use in this project |
| --- | --- |
| Java | Backend application and concurrent tasks |
| gRPC | Remote calls between hospital nodes |
| Protocol Buffers | Service contracts and message definitions |
| Maven | Dependency management, code generation, and packaging |
| Gson / JSON | Configuration and hospital data persistence |
| Java executors and threads | Server, client, and background work |
| JUnit and Mockito | Test sources for backend components |

## Engineering concepts demonstrated

- **Distributed communication:** explicit service contracts for requests between independent processes.
- **Leader election:** election and coordinator messaging based on the Bully algorithm.
- **Node discovery:** joining a network through an existing hospital and exchanging known records.
- **Concurrency:** running server, client, and console activities independently.
- **Layered design:** separating application setup, services, repositories, transport, and user interaction.
- **System integration:** connecting a gRPC network to an HTTP-based frontend workflow.

These describe the implementation and learning focus. The repository does not establish production reliability or measured performance guarantees.

## Service contracts

The protocol definitions are in `src/main/resources/Hospital.proto` and `Bully.proto`.

| Service | RPC | Purpose |
| --- | --- | --- |
| `HospitalService` | `getAvailableBeds` | Request a hospital's available bed count |
| `HospitalService` | `getHospitalsForRegion` | Exchange hospital information |
| `BullyService` | `StartElection` | Send an election request |
| `BullyService` | `SendCoordinator` | Announce a coordinator |

## Run locally

Use JDK 17 and Maven. Review the build notes below before compiling the current source.

```bash
git clone https://github.com/Dhruvt1998/gRPC_hms.git
cd gRPC_hms
mvn clean package
```

Configure the node in `src/main/resources/config.json`. The file contains one hospital object inside an array:

```json
[
  {
    "test": 1,
    "host": "localhost",
    "port": 9000,
    "id": 5,
    "name": "Mitte",
    "totalBeds": 100,
    "availableBeds": 60
  }
]
```

After a successful build, start the first node:

```bash
java -jar target/hmsMaven-1.0-SNAPSHOT.jar true
```

To join another node, use a separate working copy with a unique hospital ID and available port, then supply an existing peer's address:

```bash
java -jar target/hmsMaven-1.0-SNAPSHOT.jar false localhost 9000
```

Run each node from its own repository root because configuration and data files use relative paths. Always supply the first argument. Use a host reachable by other nodes; `localhost` is appropriate only for communication on the same machine.

## Interactive console

| Command | Action |
| --- | --- |
| `help` | Show available commands |
| `setAB 40` | Update local available beds to 40 |
| `getHI` | Display local hospital details |
| `getAHI` | Display known hospitals |
| `whoIsLeader` | Display the current leader ID |
| `printLogger` | Display the project log |
| `clear` | Clear the terminal |

A simple demonstration is to start two hospital nodes, inspect their known records, change a bed count through the console, and inspect the resulting state. With the aggregation service connected, the dashboard can retrieve the submitted records using Refresh.

## Connecting the frontend

Aggregation settings are defined in `src/main/java/application/setup/AppConfig.java`. The current backend destination is:

```text
POST http://webserver:5000/updateAllHospitals
```

The frontend reads:

```text
GET http://localhost:8080/getAllHospitals
GET http://localhost:8080/getTimestamp
```

Configure these addresses to reach the same aggregation service from their respective environments. Changing the backend's Java constants requires rebuilding. The service must also allow browser requests from the frontend origin.

## Code organization

Paths below are relative to `src/main/java/`.

| Path | Responsibility |
| --- | --- |
| `Main.java` | Application entry point |
| `application/setup/` | Startup and configuration constants |
| `application/model/` | Hospital initialization |
| `application/repository/` | Hospital records and JSON storage |
| `application/service/hospital/` | Hospital service behavior |
| `application/service/bully/` | Election logic |
| `application/controller/` | Aggregation service submission |
| `application/view/` | Interactive console |
| `middleware/` | gRPC clients, server, and generated classes |

## Project status and build notes

The repository contains implementation and test sources for hospital operations, initialization, repository behavior, and election components. Run tests with `mvn test`. Build and runtime behavior have not been verified as part of this documentation update.

The checked-in build configuration needs cleanup:

- Java version properties specify 17, while the compiler plugin specifies Java 8. Align these settings.
- Hospital classes with the same package appear in multiple generated-source directories. Keep one consistent generation output to avoid duplicate definitions.
- Align the Bully protocol package with the generated classes imported by the application.
- Confirm that the Maven test runner discovers the intended JUnit 4 and JUnit 5 tests.

Potential next steps include repeatable multi-node integration tests, failure and recovery scenarios, configurable deployment settings, and automated end-to-end testing with the aggregation service and dashboard.

## Related repository

[Hospital Management System · React Frontend](https://github.com/Dhruvt1998/Hospitals_Client)
