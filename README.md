# Kafka Spring Boot Application for International Space Station (ISS) Live Location

## Overview

This repository contains a Kafka Spring Boot application designed to fetch live location data of the International Space Station (ISS) from a public API and publish it to a Kafka topic. Additionally, it includes a consumer application to consume this data. The architecture allows for real-time tracking and processing of ISS location information.

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Setup](#setup)
    - [Prerequisites](#prerequisites)
    - [Configuration](#configuration)
4. [Usage](#usage)
    - [Starting the Application](#starting-the-application)
    - [Consumer Application](#consumer-application)
5. [Contributing](#contributing)
6. [License](#license)

## Introduction

The International Space Station orbits the Earth approximately every 90 minutes, providing a unique opportunity for real-time tracking and monitoring. This Kafka Spring Boot application leverages Kafka messaging system to publish live location data obtained from a public API to facilitate various downstream processing tasks.

## Features

- **Real-time Tracking**: The application fetches live location data of the ISS from a public API and publishes it to a Kafka topic, ensuring real-time tracking capabilities.
- **Kafka Integration**: Utilizes Kafka messaging system for efficient and scalable data distribution.
- **Modular Design**: Built using Spring Boot framework, the application employs a modular design, making it easy to extend and maintain.
- **Consumer Application**: Includes a consumer application to consume the published ISS location data for downstream processing or visualization.

## Setup

### Prerequisites

Before running the application, ensure you have the following prerequisites installed:

- Java Development Kit (JDK) 8 or higher
- Apache Kafka
- Maven (for building the application)

### Configuration

1. Clone this repository to your local machine:

   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:

   ```
   cd iss-location
   ```

3. Configure Kafka:

   Update the `application.properties` file with your Kafka broker details:

   ```
   kafka.bootstrap.servers=<kafka-broker-url>:<port>
   kafka.topic.iss-location=<iss-location-topic>
   ```

## Usage

### Starting the Application

To start the Kafka Spring Boot application:

1. Build the application using Maven:

   ```
   mvn clean install
   ```

2. Run the application:

   ```
   java -jar target/iss-location.jar
   ```

### Consumer Application

To consume the ISS location data:

1. Configure the consumer application to subscribe to the appropriate Kafka topic.
2. Implement the desired logic to process or visualize the ISS location data consumed from Kafka.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize this README further based on your specific project requirements and preferences.
