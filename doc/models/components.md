
# Components

A nested object containing a breakdown of each component of a reverse geocoded response.

## Structure

`Components`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ZipCode` | `String` | Required | The 5-digit ZIP code<br>**Constraints**: *Pattern*: `^\d{5}$` | String getZipCode() | setZipCode(String zipCode) |
| `ZipCodePlus4` | `Object` | Required | - | Object getZipCodePlus4() | setZipCodePlus4(Object zipCodePlus4) |

## Example (as JSON)

```json
{
  "zip_code": "zip_code4",
  "zip_code_plus_4": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

