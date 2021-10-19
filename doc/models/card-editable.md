
# Card Editable

## Structure

`CardEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the card.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`SizeEnum`](/doc/models/size-enum.md) | Optional | The size of the card<br>**Default**: `SizeEnum.ENUM_2125X3375`<br>*Default: `SizeEnum.ENUM_2125X3375`* | SizeEnum getSize() | setSize(SizeEnum size) |
| `Front` | `Object` | Required | A PDF template for the front of the card | Object getFront() | setFront(Object front) |
| `Back` | `Object` | Optional | A PDF template for the back of the card | Object getBack() | setBack(Object back) |

## Example (as JSON)

```json
{
  "description": null,
  "size": null,
  "front": {
    "key1": "val1",
    "key2": "val2"
  },
  "back": null
}
```

