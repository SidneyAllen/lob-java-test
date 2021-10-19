
# Address Fields Us

## Structure

`AddressFieldsUs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Required | **Constraints**: *Maximum Length*: `64` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `64` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Required | 2 letter state short-name code<br>**Constraints**: *Pattern*: `^[a-zA-Z]{2}$` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Required | Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.<br>**Constraints**: *Pattern*: `^\d{5}(-\d{4})?$` | String getAddressZip() | setAddressZip(String addressZip) |

## Example (as JSON)

```json
{
  "address_line1": "address_line16",
  "address_line2": null,
  "address_city": "address_city0",
  "address_state": "address_state2",
  "address_zip": "address_zip8"
}
```

