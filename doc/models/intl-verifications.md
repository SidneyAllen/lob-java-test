
# Intl Verifications

## Structure

`IntlVerifications`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addresses` | `List<Object>` | Required | - | List<Object> getAddresses() | setAddresses(List<Object> addresses) |
| `Errors` | `boolean` | Required | Indicates whether any errors occurred during the verification process. | boolean getErrors() | setErrors(boolean errors) |

## Example (as JSON)

```json
{
  "addresses": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "errors": false
}
```

