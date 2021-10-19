
# Address Editable Us

## Structure

`AddressEditableUs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Required | **Constraints**: *Maximum Length*: `64` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `64` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Required | 2 letter state short-name code<br>**Constraints**: *Pattern*: `^[a-zA-Z]{2}$` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Required | Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.<br>**Constraints**: *Pattern*: `^\d{5}(-\d{4})?$` | String getAddressZip() | setAddressZip(String addressZip) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address.<br>**Constraints**: *Maximum Length*: `40` | String getName() | setName(String name) |
| `Company` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address. This field can be used for any secondary recipient information which is not part of the actual mailing address (Company Name, Department, Attention Line, etc).<br>**Constraints**: *Maximum Length*: `40` | String getCompany() | setCompany(String company) |
| `Phone` | `String` | Optional | Must be no longer than 40 characters.<br>**Constraints**: *Maximum Length*: `40` | String getPhone() | setPhone(String phone) |
| `Email` | `String` | Optional | Must be no longer than 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getEmail() | setEmail(String email) |
| `AddressCountry` | [`AddressCountry2Enum`](/doc/models/address-country-2-enum.md) | Optional | **Default**: `AddressCountry2Enum.US`<br>*Default: `AddressCountry2Enum.US`* | AddressCountry2Enum getAddressCountry() | setAddressCountry(AddressCountry2Enum addressCountry) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |

## Example (as JSON)

```json
{
  "address_line1": "address_line16",
  "address_line2": null,
  "address_city": "address_city0",
  "address_state": "address_state2",
  "address_zip": "address_zip8",
  "description": null,
  "name": "name0",
  "company": "company0",
  "phone": null,
  "email": null,
  "address_country": null,
  "metadata": null
}
```

