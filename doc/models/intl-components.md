
# Intl Components

A nested object containing a breakdown of each component of an address.

## Structure

`IntlComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrimaryNumber` | `String` | Optional | The numeric or alphanumeric part of an address preceding the street name. Often the house, building, or PO Box number. | String getPrimaryNumber() | setPrimaryNumber(String primaryNumber) |
| `StreetName` | `String` | Optional | The name of the street. | String getStreetName() | setStreetName(String streetName) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Optional | The [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) two letter code for the state.<br>**Constraints**: *Maximum Length*: `2` | String getState() | setState(String state) |
| `PostalCode` | `String` | Optional | The postal code.<br>**Constraints**: *Maximum Length*: `12` | String getPostalCode() | setPostalCode(String postalCode) |

## Example (as JSON)

```json
{
  "primary_number": null,
  "street_name": null,
  "city": null,
  "state": null,
  "postal_code": null
}
```

