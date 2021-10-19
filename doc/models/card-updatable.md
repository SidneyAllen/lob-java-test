
# Card Updatable

## Structure

`CardUpdatable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the card.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `AutoReorder` | `Boolean` | Optional | Allows for auto reordering | Boolean getAutoReorder() | setAutoReorder(Boolean autoReorder) |
| `ReorderQuantity` | `Double` | Optional | The quantity of items to be reordered (only required when auto_reorder is true).<br>**Constraints**: `>= 10000`, `<= 10000000` | Double getReorderQuantity() | setReorderQuantity(Double reorderQuantity) |

## Example (as JSON)

```json
{
  "description": null,
  "auto_reorder": null,
  "reorder_quantity": null
}
```

