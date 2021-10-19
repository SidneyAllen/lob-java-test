
# Zip

## Structure

`Zip`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ZipCode` | `String` | Required | A 5-digit ZIP code.<br>**Constraints**: *Pattern*: `^\d{5}$` | String getZipCode() | setZipCode(String zipCode) |
| `Id` | `String` | Required | Unique identifier prefixed with `us_zip_`.<br>**Constraints**: *Pattern*: `^us_zip_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Cities` | [`List<ZipLookupCity>`](/doc/models/zip-lookup-city.md) | Required | An array of city objects containing valid cities for the `zip_code`. Multiple cities will be returned if more than one city is associated with the input ZIP code. | List<ZipLookupCity> getCities() | setCities(List<ZipLookupCity> cities) |
| `ZipCodeType` | [`ZipCodeTypeEnum`](/doc/models/zip-code-type-enum.md) | Required | A description of the ZIP code type. For more detailed information about<br>each ZIP code type, see [US Verification Details](#tag/US-Verification-Types). | ZipCodeTypeEnum getZipCodeType() | setZipCodeType(ZipCodeTypeEnum zipCodeType) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "zip_code": "94107",
  "id": null,
  "cities": {
    "city": null,
    "state": null,
    "county": null,
    "county_fips": null,
    "preferred": true
  },
  "zip_code_type": null,
  "object": null
}
```

