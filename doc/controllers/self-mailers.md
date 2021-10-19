# Self Mailers

The self mailer endpoint allows you to easily print and mail self mailers. The API provides endpoints
for creating self mailers, retrieving individual self mailers, canceling self mailers, and retrieving a list of self mailers.

```java
SelfMailersController selfMailersController = client.getSelfMailersController();
```

## Class Name

`SelfMailersController`

## Methods

* [Get Self Mailer](/doc/controllers/self-mailers.md#get-self-mailer)
* [Delete Self Mailer](/doc/controllers/self-mailers.md#delete-self-mailer)
* [List Self Mailers](/doc/controllers/self-mailers.md#list-self-mailers)
* [Create Self Mailer](/doc/controllers/self-mailers.md#create-self-mailer)


# Get Self Mailer

Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer identifier that was returned upon self_mailer creation.

```java
CompletableFuture<SelfMailer> getSelfMailerAsync(
    final String sfmId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sfmId` | `String` | Template, Required | id of the self_mailer<br>**Constraints**: *Pattern*: `^sfm_[a-zA-Z0-9]+$` |

## Response Type

[`SelfMailer`](/doc/models/self-mailer.md)

## Example Usage

```java
String sfmId = "sfm_id8";

selfMailersController.getSelfMailerAsync(sfmId).thenAccept(result -> {
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


# Delete Self Mailer

Completely removes a self mailer from production. This can only be done if the self mailer's `send_date` has not yet passed. If the self mailer is successfully canceled, you will not be charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.

```java
CompletableFuture<SelfMailerDeletion> deleteSelfMailerAsync(
    final String sfmId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sfmId` | `String` | Template, Required | id of the self_mailer<br>**Constraints**: *Pattern*: `^sfm_[a-zA-Z0-9]+$` |

## Response Type

[`SelfMailerDeletion`](/doc/models/self-mailer-deletion.md)

## Example Usage

```java
String sfmId = "sfm_id8";

selfMailersController.deleteSelfMailerAsync(sfmId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "sfm_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Self Mailers

Returns a list of your self_mailers. The self_mailers are returned sorted by creation date, with the most recently created self_mailers appearing first.

```java
CompletableFuture<AllSelfMailers> listSelfMailersAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated,
    final SelfMailerSizeEnum size,
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
| `size` | [`SelfMailerSizeEnum`](/doc/models/self-mailer-size-enum.md) | Query, Optional | THe self mailer sizes to be returned.<br>**Default**: `SelfMailerSizeEnum.ENUM_6X18_BIFOLD` |
| `scheduled` | `Boolean` | Query, Optional | * `true` - only return orders (past or future) where `send_date` is<br>  greater than `date_created`<br>* `false` - only return orders where `send_date` is equal to `date_created` |
| `sendDate` | `Object` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `mailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Query, Optional | A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`AllSelfMailers`](/doc/models/all-self-mailers.md)

## Example Usage

```java
Integer limit = 10;
SelfMailerSizeEnum size = SelfMailerSizeEnum.ENUM_6X18_BIFOLD;
MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

selfMailersController.listSelfMailersAsync(limit, null, null, null, size, null, null, mailType, null).thenAccept(result -> {
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


# Create Self Mailer

Creates a new self_mailer given information

```java
CompletableFuture<SelfMailer> createSelfMailerAsync(
    final SelfMailerEditable body,
    final String idempotencyKeyHeader,
    final String idempotencyKeyParam)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SelfMailerEditable`](/doc/models/self-mailer-editable.md) | Body, Required | - |
| `idempotencyKeyHeader` | `String` | Header, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |
| `idempotencyKeyParam` | `String` | Query, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |

## Response Type

[`SelfMailer`](/doc/models/self-mailer.md)

## Example Usage

```java
SelfMailerEditable body = new SelfMailerEditable();
body.setTo(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setInside(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setOutside(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setDescription("Demo Self Mailer job");
body.setMetadata(new Metadata());
body.setMailType(MailTypeEnum.USPS_STANDARD);
body.setMergeVariables(com.lob.api.ApiHelper.deserialize("{\"name\":\"Harry\"}"));
body.setSendDate(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setSize(SelfMailerSizeEnum.ENUM_12X9_BIFOLD);
body.setFrom(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
String idempotencyKeyHeader = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";
String idempotencyKeyParam = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";

selfMailersController.createSelfMailerAsync(body, idempotencyKeyHeader, idempotencyKeyParam).thenAccept(result -> {
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

