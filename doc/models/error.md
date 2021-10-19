
# Error

Lob uses RESTful HTTP response codes to indicate success or failure of an API request. In general, 2xx indicates success, 4xx indicate an input error, and 5xx indicates an error on Lob's end.

## Structure

`Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | [`Error1`](/doc/models/error-1.md) | Required | - | Error1 getError() | setError(Error1 error) |

## Example (as JSON)

```json
{
  "error": {
    "message": "Rate limit exceeded. Please wait 5 seconds and try your request again.",
    "status_code": null,
    "code": null
  }
}
```

