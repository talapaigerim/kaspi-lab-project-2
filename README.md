# Kaspi Lab – Project 2

## Description
This project is a moderation system built with Spring Boot and Kafka.

The system consists of two microservices:
- *service-1* – receives requests and publishes events to Kafka
- *service-2* – consumes events from Kafka and processes moderation logic

Redis is used for caching, Kafka for asynchronous communication.

---

## Technologies
- Java 17
- Spring Boot
- Apache Kafka
- Redis
- Docker & Docker Compose
- k6 (load testing)

---

## Project Structure
service-1/   # REST API + Kafka producer
service-2/   # Kafka consumer + business logic
---

## How to Run
1. Start infrastructure:
```bash
docker-compose up -d
2.	Run service-1 and service-2 from IDE (IntelliJ IDEA)

