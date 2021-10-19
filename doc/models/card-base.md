
# Card Base

## Structure

`CardBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the card.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`SizeEnum`](/doc/models/size-enum.md) | Optional | The size of the card<br>**Default**: `SizeEnum.ENUM_2125X3375`<br>*Default: `SizeEnum.ENUM_2125X3375`* | SizeEnum getSize() | setSize(SizeEnum size) |

## Example (as JSON)

```json
{
  "description": null,
  "size": null
}
```

