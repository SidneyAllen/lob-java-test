
# All Addresses

## Structure

`AllAddresses`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is type of resource. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `Data` | `List<Object>` | Optional | list of addresses | List<Object> getData() | setData(List<Object> data) |

## Example (as JSON)

```json
{
  "object": null,
  "next_url": null,
  "previous_url": null,
  "count": null,
  "data": null
}
```

