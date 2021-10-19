
# All Templates

## Structure

`AllTemplates`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<Template>`](/doc/models/template.md) | Optional | list of templates | List<Template> getData() | setData(List<Template> data) |
| `Object` | `String` | Optional | Value is type of resource. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |

## Example (as JSON)

```json
{
  "data": null,
  "object": null,
  "next_url": null,
  "previous_url": null,
  "count": null
}
```

