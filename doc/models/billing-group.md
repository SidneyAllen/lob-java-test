
# Billing Group

## Structure

`BillingGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the billing group.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Optional | Name of the billing group.<br>**Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |
| `Id` | `String` | Optional | Unique identifier prefixed with `bg_`.<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "description": null,
  "name": null,
  "id": null,
  "date_created": null,
  "date_modified": null,
  "object": null
}
```

