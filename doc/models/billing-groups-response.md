
# Billing Groups Response

## Structure

`BillingGroupsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<BillingGroup>`](/doc/models/billing-group.md) | Optional | list of billing_groups | List<BillingGroup> getData() | setData(List<BillingGroup> data) |
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

