
# Address Fields Intl

## Structure

`AddressFieldsIntl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Optional | Optional postal code.<br>**Constraints**: *Maximum Length*: `40` | String getAddressZip() | setAddressZip(String addressZip) |

## Example (as JSON)

```json
{
  "address_line1": "address_line16",
  "address_line2": null,
  "address_city": null,
  "address_state": null,
  "address_zip": null
}
```

