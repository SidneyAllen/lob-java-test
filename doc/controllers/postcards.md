# Postcards

The postcards endpoint allows you to easily print and mail postcards. The API provides endpoints for creating postcards,
retrieving individual postcards, canceling postcards, and retrieving a list of postcards.

```java
PostcardsController postcardsController = client.getPostcardsController();
```

## Class Name

`PostcardsController`

## Methods

* [Get Postcard](/doc/controllers/postcards.md#get-postcard)
* [Delete Postcard](/doc/controllers/postcards.md#delete-postcard)
* [List Postcards](/doc/controllers/postcards.md#list-postcards)
* [Create Postcard](/doc/controllers/postcards.md#create-postcard)


# Get Postcard

Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.

```java
CompletableFuture<Postcard> getPostcardAsync(
    final String pscId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pscId` | `String` | Template, Required | id of the postcard<br>**Constraints**: *Pattern*: `^psc_[a-zA-Z0-9]+$` |

## Response Type

[`Postcard`](/doc/models/postcard.md)

## Example Usage

```java
String pscId = "psc_id2";

postcardsController.getPostcardAsync(pscId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Delete Postcard

Completely removes a postcard from production. This can only be done if the postcard has a `send_date` and the `send_date` has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.

```java
CompletableFuture<PostcardDeletion> deletePostcardAsync(
    final String pscId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pscId` | `String` | Template, Required | id of the postcard<br>**Constraints**: *Pattern*: `^psc_[a-zA-Z0-9]+$` |

## Response Type

[`PostcardDeletion`](/doc/models/postcard-deletion.md)

## Example Usage

```java
String pscId = "psc_id2";

postcardsController.deletePostcardAsync(pscId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "psc_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Postcards

Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.

```java
CompletableFuture<AllPostcards> listPostcardsAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated,
    final PostcardSizeEnum size,
    final Boolean scheduled,
    final Object sendDate,
    final MailTypeEnum mailType,
    final Object sortBy)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `size` | [`PostcardSizeEnum`](/doc/models/postcard-size-enum.md) | Query, Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` |
| `scheduled` | `Boolean` | Query, Optional | * `true` - only return orders (past or future) where `send_date` is<br>  greater than `date_created`<br>* `false` - only return orders where `send_date` is equal to `date_created` |
| `sendDate` | `Object` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `mailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Query, Optional | A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`AllPostcards`](/doc/models/all-postcards.md)

## Example Usage

```java
Integer limit = 10;
PostcardSizeEnum size = PostcardSizeEnum.ENUM_4X6;
MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

postcardsController.listPostcardsAsync(limit, null, null, null, size, null, null, mailType, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Postcard

Creates a new postcard given information

```java
CompletableFuture<Postcard> createPostcardAsync(
    final PostcardEditable body,
    final String idempotencyKeyHeader,
    final String idempotencyKeyParam)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PostcardEditable`](/doc/models/postcard-editable.md) | Body, Required | - |
| `idempotencyKeyHeader` | `String` | Header, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |
| `idempotencyKeyParam` | `String` | Query, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |

## Response Type

[`Postcard`](/doc/models/postcard.md)

## Example Usage

```java
PostcardEditable body = new PostcardEditable();
body.setTo(com.lob.api.ApiHelper.deserialize("{\"description\":\"Harry - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\",\"email\":\"harry@lob.com\",\"phone\":\"5555555555\",\"address_line1\":\"210 King St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US\"}"));
body.setFront(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setBack(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setDescription("demo");
body.setMetadata(new Metadata());
body.setMailType(MailTypeEnum.USPS_FIRST_CLASS);
body.setMergeVariables(com.lob.api.ApiHelper.deserialize("{\"name\":\"Harry\"}"));
body.setSendDate(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setSize(PostcardSizeEnum.ENUM_6X9);
body.setFrom(com.lob.api.ApiHelper.deserialize("{\"description\":\"Harry - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\",\"email\":\"harry@lob.com\",\"phone\":\"5555555555\",\"address_line1\":\"210 King St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US\"}"));
String idempotencyKeyHeader = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";
String idempotencyKeyParam = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";

postcardsController.createPostcardAsync(body, idempotencyKeyHeader, idempotencyKeyParam).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

