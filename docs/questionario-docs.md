## Forms Endpoints

This API provides the following endpoints for managing Forms:

### 1. Get All Forms

Retrieves a list of all Forms.

- **URL:** `/forms`
- **Method:** `GET`
- **Response:** 
[
  {
    "id": 2,
    "codSemestre": {
      "codSemestre": 1,
      "periodo": "2",
      "alocacoes": []
    }
  }
]


### 2. Get Form by ID

Retrieves a specific Form by their ID.

- **URL:** `/form/{id}`
- **Method:** `GET`
- **Parameters:** `id` (integer) - The ID of the Form
- **Response:** 
{
  "id": 2,
  "codSemestre": {
    "codSemestre": 1,
    "periodo": "2",
    "alocacoes": []
  }
}


### 3. Create Form

Creates a new Form.

- **URL:** `/form`
- **Method:** `POST`
- **Request Body:** 
{
  "codSemestre": 1
}

- **Response:** 
{
  "id": 2,
  "codSemestre": {
    "codSemestre": 1,
    "periodo": null,
    "alocacoes": null
  }
}


### 4. Update Form

Updates an existing Form.

- **URL:** `/form/{id}`
- **Method:** `PUT`
- **Parameters:** `id` (integer) - The ID of the Form
- **Request Body:** 
{
  "codSemestre": 2
}

- **Response:** HTTP status code indicating the success of the operation

### 5. Delete Form

Deletes an existing Form.

- **URL:** `/form/{id}`
- **Method:** `DELETE`
- **Parameters:** `id` (integer) - The ID of the Form
- **Response:** HTTP status code indicating the success of the operation
