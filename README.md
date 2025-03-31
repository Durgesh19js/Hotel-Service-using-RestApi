# Hotel-Service-using-RestApi
# Hotel Management API

## Introduction

The **Hotel Management API** is a Spring Boot-powered RESTful service designed to facilitate hotel management operations. It enables users to add, modify, delete, and retrieve hotel records effortlessly, making it an effective solution for hotel data handling.

## Key Features

- **Create a Hotel**: Add new hotel entries to the database.
- **View All Hotels**: Retrieve a complete list of available hotels.
- **Fetch Hotel Details by ID**: Get specific hotel details using its unique identifier.
- **Modify Hotel Information**: Update existing hotel records with new details.
- **Remove a Hotel**: Delete a hotel entry from the database.

## Technology Stack

- **Spring Boot** - Backend framework for REST API development.
- **Spring Data JPA** - Facilitates database interactions.
- **Jakarta Persistence API (JPA)** - Provides ORM capabilities.
- **H2/PostgreSQL/MySQL** - Supported database options for persistence.

## Directory Structure

```plaintext
com.api
│── entity
│── controller
│── repository
│── service
│── service.impl
│── main
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven build tool
- Database setup (H2, MySQL, or PostgreSQL)

### Setup and Execution

1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd hotel-management-api
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Start the application:
   ```sh
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080/hotels`

## API Endpoints

### Create a Hotel

```http
POST /hotels/add
Content-Type: application/json

{
  "name": "Ocean View Hotel",
  "rating": 5,
  "about": "A premium beachside hotel",
  "isOpen": true,
  "rent": 200.0
}
```

### Retrieve All Hotels

```http
GET /hotels/all
```

### Fetch Hotel by ID

```http
GET /hotels/{id}
```

### Update a Hotel

```http
POST /hotels/update
Content-Type: application/json

{
  "id": "existing-hotel-id",
  "name": "Updated Hotel Name",
  "rating": 4,
  "about": "Newly renovated rooms with better amenities",
  "isOpen": false,
  "rent": 180.0
}
```

### Remove a Hotel

```http
GET /hotels/delete/{id}
```

## Summary

The **Hotel Management API** is a user-friendly solution designed to streamline hotel data management through RESTful endpoints. Future enhancements may include authentication, booking integration, and additional filtering options.


