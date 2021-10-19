# Billing Groups

The Billing Groups API allows you to create and view labels that can be attached to certain consumption-based
usages of Letters, Checks, Postcards and Self-Mailers to customize your bill. Please check each
resource API section to learn more about how to access the Billing Groups API.

```java
BillingGroupsController billingGroupsController = client.getBillingGroupsController();
```

## Class Name

`BillingGroupsController`

## Methods

* [Get Billing Group](/doc/controllers/billing-groups.md#get-billing-group)
* [Update Billing Group](/doc/controllers/billing-groups.md#update-billing-group)
* [List Billing Groups](/doc/controllers/billing-groups.md#list-billing-groups)
* [Create Billing Group](/doc/controllers/billing-groups.md#create-billing-group)


# Get Billing Group

Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.

```java
CompletableFuture<BillingGroup> getBillingGroupAsync(
    final String bgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bgId` | `String` | Template, Required | id of the billing_group<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` |

## Response Type

[`BillingGroup`](/doc/models/billing-group.md)

## Example Usage

```java
String bgId = "bg_id8";

billingGroupsController.getBillingGroupAsync(bgId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Update Billing Group

Updates all editable attributes of the billing_group with the given id.

```java
CompletableFuture<BillingGroup> updateBillingGroupAsync(
    final String bgId,
    final String description,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bgId` | `String` | Template, Required | id of the billing_group<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | Description of the billing group.<br>**Constraints**: *Maximum Length*: `255` |
| `name` | `String` | Form, Optional | Name of the billing group.<br>**Constraints**: *Maximum Length*: `255` |

## Response Type

[`BillingGroup`](/doc/models/billing-group.md)

## Example Usage

```java
String bgId = "bg_id8";

billingGroupsController.updateBillingGroupAsync(bgId, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Billing Groups

Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.

```java
CompletableFuture<BillingGroupsResponse> listBillingGroupsAsync(
    final Integer limit,
    final Integer offset,
    final Object include,
    final LocalDateTime dateCreated,
    final LocalDateTime dateModified,
    final Object sortBy)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `dateModified` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is ›, `lt` is ‹, `gte` is ≥, and `lte` is ≤. |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`BillingGroupsResponse`](/doc/models/billing-groups-response.md)

## Example Usage

```java
Integer limit = 10;
Integer offset = 0;

billingGroupsController.listBillingGroupsAsync(limit, offset, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "bg_d5a5a89da9106f8",
      "description": "Test billing_group",
      "metadata": {},
      "date_created": "2019-07-27T23:49:01.511Z",
      "date_modified": "2019-07-27T23:49:01.511Z",
      "object": "billing_group"
    },
    {
      "id": "bg_59b2150ae120887",
      "description": "Test billing_group",
      "metadata": {},
      "date_created": "2019-03-29T10:22:34.642Z",
      "date_modified": "2019-03-29T10:22:34.642Z",
      "object": "billing_group"
    }
  ],
  "object": "list",
  "next_url": null,
  "prev_url": null,
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Billing Group

Creates a new billing_group with the provided properties.

```java
CompletableFuture<BillingGroup> createBillingGroupAsync(
    final BillingGroupEditable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BillingGroupEditable`](/doc/models/billing-group-editable.md) | Body, Required | - |

## Response Type

[`BillingGroup`](/doc/models/billing-group.md)

## Example Usage

```java
BillingGroupEditable body = new BillingGroupEditable();
body.setName("Marketing Dept");
body.setDescription("Usage group used for the Marketing Dept resource sends");

billingGroupsController.createBillingGroupAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

