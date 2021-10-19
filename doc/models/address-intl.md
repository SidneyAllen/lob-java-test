
# Address Intl

## Structure

`AddressIntl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required | Value is type of resource. | String getObject() | setObject(String object) |
| `Id` | `String` | Required | Unique identifier prefixed with `adr_`.<br>**Constraints**: *Pattern*: `^adr_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address.<br>**Constraints**: *Maximum Length*: `40` | String getName() | setName(String name) |
| `Company` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address. This field can be used for any secondary recipient information which is not part of the actual mailing address (Company Name, Department, Attention Line, etc).<br>**Constraints**: *Maximum Length*: `40` | String getCompany() | setCompany(String company) |
| `Phone` | `String` | Optional | Must be no longer than 40 characters.<br>**Constraints**: *Maximum Length*: `40` | String getPhone() | setPhone(String phone) |
| `Email` | `String` | Optional | Must be no longer than 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getEmail() | setEmail(String email) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `AddressLine1` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Optional | Will be returned as a full string<br>**Constraints**: *Maximum Length*: `200` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Optional | Optional postal code.<br>**Constraints**: *Maximum Length*: `40` | String getAddressZip() | setAddressZip(String addressZip) |
| `AddressCountry` | [`AddressCountry1Enum`](/doc/models/address-country-1-enum.md) | Required | Full name of country<br>**Constraints**: *Maximum Length*: `200` | AddressCountry1Enum getAddressCountry() | setAddressCountry(AddressCountry1Enum addressCountry) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "deleted": null,
  "object": "object2",
  "id": "id0",
  "description": null,
  "name": "name0",
  "company": "company0",
  "phone": null,
  "email": null,
  "metadata": null,
  "address_line1": "address_line16",
  "address_line2": null,
  "address_city": null,
  "address_state": null,
  "address_zip": null,
  "address_country": "BURKINA FASO"
}
```

