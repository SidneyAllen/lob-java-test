
# Us Autocompletions

## Structure

`UsAutocompletions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `us_auto_`.<br>**Constraints**: *Pattern*: `^us_auto_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Suggestions` | [`List<Suggestions>`](/doc/models/suggestions.md) | Optional | An array of objects representing suggested addresses.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `10` | List<Suggestions> getSuggestions() | setSuggestions(List<Suggestions> suggestions) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": null,
  "suggestions": null,
  "object": null
}
```

