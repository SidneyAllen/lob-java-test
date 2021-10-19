
# Us Autocompletions Writable

## Structure

`UsAutocompletionsWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressPrefix` | `String` | Required | Only accepts numbers and street names in an alphanumeric format. | String getAddressPrefix() | setAddressPrefix(String addressPrefix) |
| `City` | `String` | Optional | An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. | String getCity() | setCity(String city) |
| `State` | `String` | Optional | An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. | String getState() | setState(String state) |
| `ZipCode` | `String` | Optional | An optional ZIP Code input used to filter suggestions. Matches partial entries. | String getZipCode() | setZipCode(String zipCode) |
| `GeoIpSort` | `Boolean` | Optional | If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. | Boolean getGeoIpSort() | setGeoIpSort(Boolean geoIpSort) |

## Example (as JSON)

```json
{
  "address_prefix": "address_prefix8",
  "city": null,
  "state": null,
  "zip_code": null,
  "geo_ip_sort": null
}
```

