# Cypso Labs Task Management API

This Spring Boot application provides a RESTful API for managing a list of tasks. Each task includes a title, description, and status.

## Postman Collection

To test the API endpoints, import the provided Postman collection: [CypsoLab Task application.postman_collection.json](path/to/your/postman_collection.json).
This includes requests for creating, retrieving, updating, and deleting tasks. It can be imported directly into Postman for testing  API endpoints.
## API Endpoints

### Create a new task

- **URL:** `/tasks`
- **Method:** `POST`
- **Description:** Creates a new task with a specified title, description, and status. Returns the created task object.

### Retrieve all tasks

- **URL:** `/tasks`
- **Method:** `GET`
- **Description:** Retrieves a list of all tasks stored in the database. Each task object includes an ID, title, description, and status.

### Retrieve a task by ID

- **URL:** `/tasks/{id}`
- **Method:** `GET`
- **Description:** Retrieves a specific task by its unique ID. Returns the task object if found, otherwise returns a 404 Not Found error.

### Update a task

- **URL:** `/tasks/{id}`
- **Method:** `PUT`
- **Description:** Updates an existing task identified by its ID. Requires a request body with updated values for title, description, and status. Returns the updated task object.

### Delete a task

- **URL:** `/tasks/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a specific task identified by its ID. Returns a 204 No Content response if successful, indicating the task has been deleted.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
