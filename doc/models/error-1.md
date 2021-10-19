
# Error 1

## Structure

`Error1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | A human-readable message with more details about the error | String getMessage() | setMessage(String message) |
| `StatusCode` | [`FailureStatusCodeEnum`](/doc/models/failure-status-code-enum.md) | Required | A conventional HTTP status code:<br><br>* `401` - Authorization error with your API key or account<br>* `403` - Forbidden error with your API key or account<br>* `404` - The requested item does not exist<br>* `413` - Payload too large<br>* `422` - The query or body parameters did not pass validation<br>* `429` - Too many requests have been sent with an API key in a given amount of time<br>* `500` - An internal server error occurred, please contact support@lob.com | FailureStatusCodeEnum getStatusCode() | setStatusCode(FailureStatusCodeEnum statusCode) |
| `Code` | `Object` | Required | - | Object getCode() | setCode(Object code) |

## Example (as JSON)

```json
{
  "message": "Rate limit exceeded. Please wait 5 seconds and try your request again.",
  "status_code": null,
  "code": null
}
```

