## Discentes Endpoints

This API provides the following endpoints for managing Discentes (students):

### 1. Get All Discentes

Retrieves a list of all Discentes.

- **URL:** `/discentes`
- **Method:** `GET`
- **Response:** 
[
  {
    "matricula": 123456,
    "nomeDiscente": "John Doe"
  },
  {
    "matricula": 987654,
    "nomeDiscente": "Jane Smith"
  }
]


### 2. Get Discente by ID

Retrieves a specific Discente by their ID.

- **URL:** `/discentes/{id}`
- **Method:** `GET`
- **Parameters:** `id` (integer) - The ID of the Discente
- **Response:** 
{
  "matricula": 123456,
  "nomeDiscente": "John Doe"
}


### 3. Create Discente

Creates a new Discente.

- **URL:** `/discentes`
- **Method:** `POST`
- **Request Body:** 
{
  "matricula": 123456,
  "nomeDiscente": "John Doe"
}

- **Response:** 
{
  "matricula": 123456,
  "nomeDiscente": "John Doe"
}


### 4. Update Discente

Updates an existing Discente.

- **URL:** `/discentes/{id}`
- **Method:** `PUT`
- **Parameters:** `id` (integer) - The ID of the Discente
- **Request Body:** 
{
  "matricula": 123456,
  "nomeDiscente": "Updated Name"
}

- **Response:** 
{
  "matricula": 123456,
  "nomeDiscente": "Updated Name"
}


### 5. Delete Discente

Deletes an existing Discente.

- **URL:** `/discentes/{id}`
- **Method:** `DELETE`
- **Parameters:** `id` (integer) - The ID of the Discente
- **Response:** HTTP status code indicating the success of the operation

## Docentes Endpoints

This API provides the following endpoints for managing Docentes (teachers):

### 1. Get All Docentes

Retrieves a list of all Docentes.

- **URL:** `/docentes`
- **Method:** `GET`
- **Response:** 
[
  {
    "siape": 987654,
    "nomeDocente": "Jane Smith",
    "ecoordenador": true
  },
  {
    "siape": 123456,
    "nomeDocente": "John Walker",
    "ecoordenador": false
  },
]

### 2. Get Docente by ID

Retrieves a specific Docente by their ID.

- **URL:** `/docentes/{id}`
- **Method:** `GET`
- **Parameters:** `id` (integer) - The ID of the Docente
- **Response:** 
{
  "siape": 987654,
  "nomeDocente": "Jane Smith",
  "ecoordenador": true
}

### 3. Create Docente

Creates a new Docente.

- **URL:** `/docentes`
- **Method:** `POST`
- **Request Body:** 
{
  "siape": 987654,
  "nomeDocente": "Jane Smith",
  "ecoordenador": true
}
- **Response:** 
{
  "siape": 987654,
  "nomeDocente": "Jane Smith",
  "ecoordenador": true
}

### 4. Update Docente

Updates an existing Docente.

- **URL:** `/docentes/{id}`
- **Method:** `PUT`
- **Parameters:** `id` (integer) - The ID of the Docente
- **Request Body:** 
{
  "siape": 987654,
  "nomeDocente": "Jane Smith",
  "ecoordenador": true
}
- **Response:** 
{
  "siape": 987654,
  "nomeDocente": "Jane Smith",
  "ecoordenador": true
}

### 5. Delete Docente

Deletes an existing Docente.

- **URL:** `/docentes/{id}`
- **Method:** `DELETE`
- **Parameters:** `id` (integer) - The ID of the Docente
- **Response:** HTTP status code indicating the success of the operation

Please note that for the `GET` endpoints, you can also include query parameters to filter or sort the results.