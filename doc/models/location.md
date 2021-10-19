
# Location

## Structure

`Location`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `double` | Required | A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be input with `longitude` to pinpoint locations on a map.<br>**Constraints**: `>= -90`, `<= 90` | double getLatitude() | setLatitude(double latitude) |
| `Longitude` | `double` | Required | A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be input with `latitude` to pinpoint locations on a map.<br>**Constraints**: `>= -180`, `<= 180` | double getLongitude() | setLongitude(double longitude) |

## Example (as JSON)

```json
{
  "latitude": 65.76,
  "longitude": 188.04
}
```

