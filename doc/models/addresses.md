
# Addresses

## Structure

`Addresses`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Components` | [`Components`](/doc/models/components.md) | Optional | A nested object containing a breakdown of each component of a reverse geocoded response. | Components getComponents() | setComponents(Components components) |
| `LocationAnalysis` | [`LocationAnalysis`](/doc/models/location-analysis.md) | Optional | A nested object containing a breakdown of the analysis of a reverse geocoded location. | LocationAnalysis getLocationAnalysis() | setLocationAnalysis(LocationAnalysis locationAnalysis) |

## Example (as JSON)

```json
{
  "components": null,
  "location_analysis": null
}
```

