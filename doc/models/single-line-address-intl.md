
# Single Line Address Intl

## Structure

`SingleLineAddressIntl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address` | `String` | Required | The entire address in one string (e.g., "370 Water St C1N 1C4").<br>**Constraints**: *Maximum Length*: `500` | String getAddress() | setAddress(String address) |
| `Country` | [`CountryExtendedEnum`](/doc/models/country-extended-enum.md) | Required | Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported. | CountryExtendedEnum getCountry() | setCountry(CountryExtendedEnum country) |

## Example (as JSON)

```json
{
  "address": "address6",
  "country": "HK"
}
```

