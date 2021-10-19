
# Cards Orders Response

## Structure

`CardsOrdersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is type of resource. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `Data` | [`List<CardOrder>`](/doc/models/card-order.md) | Optional | List of card orders | List<CardOrder> getData() | setData(List<CardOrder> data) |

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

