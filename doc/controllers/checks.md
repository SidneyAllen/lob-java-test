# Checks

Checks allow you to send payments via physical checks. The API provides endpoints
for creating checks, retrieving individual checks, canceling checks, and retrieving a list of checks.

```java
ChecksController checksController = client.getChecksController();
```

## Class Name

`ChecksController`

## Methods

* [Get Check](/doc/controllers/checks.md#get-check)
* [Cancel Check](/doc/controllers/checks.md#cancel-check)
* [List Checks](/doc/controllers/checks.md#list-checks)
* [Create Check](/doc/controllers/checks.md#create-check)


# Get Check

Retrieves the details of an existing check. You need only supply the unique check identifier that was returned upon check creation.

```java
CompletableFuture<Check> getCheckAsync(
    final String chkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chkId` | `String` | Template, Required | id of the check<br>**Constraints**: *Pattern*: `^chk_[a-zA-Z0-9]+$` |

## Response Type

[`Check`](/doc/models/check.md)

## Example Usage

```java
String chkId = "chk_id8";

checksController.getCheckAsync(chkId).thenAccept(result -> {
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


# Cancel Check

Completely removes a check from production. This can only be done if the check has a `send_date` and the `send_date` has not yet passed. If the check is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.

```java
CompletableFuture<CheckDeletion> cancelCheckAsync(
    final String chkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chkId` | `String` | Template, Required | id of the check<br>**Constraints**: *Pattern*: `^chk_[a-zA-Z0-9]+$` |

## Response Type

[`CheckDeletion`](/doc/models/check-deletion.md)

## Example Usage

```java
String chkId = "chk_id8";

checksController.cancelCheckAsync(chkId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "chk_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Checks

Returns a list of your checks. The checks are returned sorted by creation date, with the most recently created checks appearing first.

```java
CompletableFuture<AllChecks> listChecksAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated,
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
| `scheduled` | `Boolean` | Query, Optional | * `true` - only return orders (past or future) where `send_date` is<br>  greater than `date_created`<br>* `false` - only return orders where `send_date` is equal to `date_created` |
| `sendDate` | `Object` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `mailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Query, Optional | A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`AllChecks`](/doc/models/all-checks.md)

## Example Usage

```java
Integer limit = 10;
MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

checksController.listChecksAsync(limit, null, null, null, null, null, mailType, null).thenAccept(result -> {
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


# Create Check

Creates a new check with the provided properties.

```java
CompletableFuture<Check> createCheckAsync(
    final Object body,
    final String idempotencyKeyHeader,
    final String idempotencyKeyParam)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `Object` | Body, Required | - |
| `idempotencyKeyHeader` | `String` | Header, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |
| `idempotencyKeyParam` | `String` | Query, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |

## Response Type

[`Check`](/doc/models/check.md)

## Example Usage

```java
Object body = com.lob.api.ApiHelper.deserialize("{\"description\":\"Demo Check\",\"to\":{\"description\":\"Harry - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\",\"email\":\"harry@lob.com\",\"phone\":\"5555555555\",\"address_line1\":\"210 King St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US\"},\"from\":{\"name\":\"Leore Avidar\",\"address_line1\":\"210 King St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address_state\":\"CA\",\"address_zip\":\"94107-1741\"},\"bank_account\":\"bank_8cad8df5354d33f\",\"amount\":22.5,\"memo\":\"rent\",\"logo\":\"https://s3-us-west-2.amazonaws.com/public.lob.com/assets/check_logo.png\",\"check_bottom\":\"tmpl_23668b406d5afef\",\"merge_variables\":{\"name\":\"Harry\"},\"metadata\":{\"memo\":\"rafting trip\"},\"attachment\":\"./cool.pdf\",\"send_date\":\"2017-11-01T00:00:00.000Z\",\"mail_type\":\"usps_first_class\",\"check_number\":10001}");
String idempotencyKeyHeader = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";
String idempotencyKeyParam = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";

checksController.createCheckAsync(body, idempotencyKeyHeader, idempotencyKeyParam).thenAccept(result -> {
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

