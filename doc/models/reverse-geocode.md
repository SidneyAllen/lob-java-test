
# Reverse Geocode

## Structure

`ReverseGeocode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `us_reverse_geocode_`.<br>**Constraints**: *Pattern*: `^us_reverse_geocode_[a-zA-Z0-9_]+$` | String getId() | setId(String id) |
| `Addresses` | [`List<Addresses>`](/doc/models/addresses.md) | Optional | list of addresses | List<Addresses> getAddresses() | setAddresses(List<Addresses> addresses) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": null,
  "addresses": null,
  "object": null
}
```

