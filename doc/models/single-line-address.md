
# Single Line Address

## Structure

`SingleLineAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address` | `String` | Required | The entire address in one string (e.g., "210 King Street 94107"). _Does not support a recipient and will error when other payload parameters are provided._<br>**Constraints**: *Maximum Length*: `500` | String getAddress() | setAddress(String address) |

## Example (as JSON)

```json
{
  "address": "address6"
}
```

