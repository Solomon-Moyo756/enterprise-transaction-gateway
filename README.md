# Enterprise Transaction Gateway

## Overview

Enterprise Transaction Gateway (ETG) is a learning-focused transaction processing platform that simulates how modern banks, payment processors, telecom providers, and fintech organizations process and route transactions.

The platform provides a single entry point for transaction submission, validates requests, routes transactions to the appropriate provider, processes events asynchronously, tracks transaction status, maintains audit trails, and exposes operational metrics.

This project is designed as a portfolio piece to demonstrate enterprise backend engineering concepts, patterns, and technologies while remaining achievable for a small development team.

---

## Objectives

The primary objectives of this project are:

- Learn enterprise integration patterns
- Build an event-driven system
- Implement asynchronous processing using RabbitMQ
- Design and build REST APIs
- Implement configurable provider routing
- Apply security best practices
- Introduce monitoring and observability
- Gain experience with Docker and CI/CD
- Create an interview-ready portfolio project

---

## Business Problem

Organizations often integrate with multiple service providers for financial transactions.

Rather than exposing separate APIs for each provider, clients interact with a single platform that:

- Accepts transactions
- Validates requests
- Determines routing rules
- Processes transactions
- Tracks transaction status
- Stores audit records
- Provides operational visibility

Enterprise Transaction Gateway simulates this real-world integration model.

---

## Supported Transactions

### Airtime Purchase

Purchase airtime through a mobile network provider.

Examples:

- MTN Airtime
- Vodacom Airtime

### Bill Payment

Pay utility providers.

Examples:

- Electricity
- Water

### Internal Transfer

Transfer funds between accounts.

Examples:

- Savings → Current
- Current → Savings

---

## High Level Architecture

```text
                Client
                   |
                   v
            Transaction API
                   |
                   v
          Transaction Service
                   |
        ----------------------
        |                    |
        v                    v
   Validation          Routing Engine
                             |
                             v
                        RabbitMQ
                             |
                             v
                    Provider Adapter
                             |
                             v
                      Mock Provider
                             |
                             v
                     Status Update
                             |
        --------------------------------
        |                              |
        v                              v
   Audit Logging                Monitoring
```

---

## Key Features

### Transaction Processing

- Create transactions
- Validate requests
- Persist data
- Track lifecycle

### Routing Engine

- Configuration-driven routing
- Provider selection
- Extensible design

### Event-Driven Architecture

- RabbitMQ messaging
- Async processing
- Retry capability
- Dead-letter queues

### Provider Simulation

- Airtime provider
- Bill payment provider
- Internal transfer provider

### Audit Trail

- Transaction history
- Event tracking
- Activity logging

### Security

- JWT authentication
- Role-based access control
- Endpoint protection

### Observability

- Structured logging
- Correlation IDs
- Prometheus metrics
- Grafana dashboards

---

## Technology Stack

### Backend

- Java 21
- Spring Boot

### Database

- PostgreSQL
- Flyway

### Messaging

- RabbitMQ

### Security

- Spring Security
- JWT

### Monitoring

- Micrometer
- Prometheus
- Grafana

### Testing

- JUnit 5
- Mockito
- AssertJ
- Testcontainers

### DevOps

- Docker
- Docker Compose
- GitHub Actions

---

## Architectural Principles

### Hexagonal Architecture

The application is structured to separate business logic from infrastructure concerns.

```text
API
↓
Application
↓
Domain
↓
Infrastructure
```

### Event-Driven Processing

Transactions are processed asynchronously through messaging rather than synchronous provider calls.

### Separation of Concerns

Responsibilities are clearly divided across:

- APIs
- Services
- Routing
- Persistence
- Messaging
- Monitoring

### Testability

Business logic can be tested independently of infrastructure components.

---

## Transaction Lifecycle

```text
Client Request
        ↓
Validation
        ↓
Create Transaction
        ↓
Store Transaction
        ↓
Generate Reference
        ↓
Determine Route
        ↓
Publish Event
        ↓
RabbitMQ
        ↓
Provider Processing
        ↓
Update Status
        ↓
Audit Logging
        ↓
Metrics Collection
        ↓
Status Retrieval
```

---

## MVP Scope

The MVP includes:

✅ Transaction APIs

✅ PostgreSQL persistence

✅ RabbitMQ integration

✅ Provider routing

✅ Mock provider processing

✅ JWT authentication

✅ Audit logging

✅ Prometheus metrics

✅ Grafana dashboards

✅ Docker Compose

✅ GitHub Actions

✅ Unit and integration testing

---

## Out of Scope

The following are intentionally excluded from MVP:

- Real banking integrations
- Real telecom integrations
- Kubernetes deployments
- Event sourcing
- CQRS
- OAuth providers
- Keycloak
- Service mesh
- Multi-region deployments
- Advanced cloud infrastructure

These may be considered future enhancements.

---

## Running the Project

### Prerequisites

- Java 21
- Docker
- Docker Compose
- Git

### Start Infrastructure

```bash
docker compose up -d
```

### Run Application

```bash
./mvnw spring-boot:run
```

### Run Tests

```bash
./mvnw test
```

---

## Project Structure

```text
src/main/java
├── api
├── application
├── domain
└── infrastructure

src/test/java
├── unit
└── integration
```

---

## Team

This project is designed for:

- 2 Developers
- 1–2 hours per day each
- 8–12 weeks of development

Development follows a shared ownership model where both developers work across the entire stack rather than specializing in isolated areas.

---

## Learning Outcomes

By completing this project, developers should gain practical experience with:

- REST API Development
- Spring Boot
- PostgreSQL
- RabbitMQ
- Security
- Testing
- Monitoring
- Logging
- Docker
- CI/CD
- Enterprise Design Patterns

---

## Future Enhancements

Potential future improvements include:

- Kubernetes Deployment
- OpenTelemetry Tracing
- OAuth2
- Keycloak
- Real Provider Integrations
- Notification Service
- Multi-Provider Failover
- Cloud Deployment
- Advanced Security Controls

---

## License

This project is intended for educational and portfolio purposes.
