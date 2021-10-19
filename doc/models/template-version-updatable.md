
# Template Version Updatable

## Structure

`TemplateVersionUpdatable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY`<br>*Default: `EngineEnum.LEGACY`* | EngineEnum getEngine() | setEngine(EngineEnum engine) |

## Example (as JSON)

```json
{
  "description": null,
  "engine": null
}
```

