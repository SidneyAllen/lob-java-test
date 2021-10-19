# Letters

The letters endpoint allows you to easily print and mail letters. The API provides endpoints for
creating letters, retrieving individual letters, canceling letters, and retrieving a list of letters.

```java
LettersController lettersController = client.getLettersController();
```

## Class Name

`LettersController`

## Methods

* [Get Letter](/doc/controllers/letters.md#get-letter)
* [Cancel Letter](/doc/controllers/letters.md#cancel-letter)
* [List Letters](/doc/controllers/letters.md#list-letters)
* [Create Letter](/doc/controllers/letters.md#create-letter)


# Get Letter

Retrieves the details of an existing letter. You need only supply the unique letter identifier that was returned upon letter creation.

```java
CompletableFuture<DynamicResponse> getLetterAsync(
    final String ltrId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ltrId` | `String` | Template, Required | id of the letter<br>**Constraints**: *Pattern*: `^ltr_[a-zA-Z0-9]+$` |

## Response Type

`DynamicResponse`

## Example Usage

```java
String ltrId = "ltr_id4";

lettersController.getLetterAsync(ltrId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": "ltr_4868c3b754655f90",
  "description": "Demo Letter",
  "metadata": {},
  "to": {
    "id": "adr_d3489cd64c791ab5",
    "description": null,
    "name": "HARRY ZHANG",
    "company": null,
    "phone": null,
    "email": null,
    "address_line1": "210 KING ST STE 6100",
    "address_line2": null,
    "address_city": "SAN FRANCISCO",
    "address_state": "CA",
    "address_zip": "94107-1741",
    "address_country": "UNITED STATES",
    "metadata": {},
    "date_created": "2017-09-05T15:54:53.264Z",
    "date_modified": "2017-09-05T15:54:53.264Z",
    "deleted": true,
    "object": "address"
  },
  "from": {
    "id": "adr_b8fb5acf3a2b55db",
    "description": null,
    "name": "LEORE AVIDAR",
    "company": null,
    "phone": null,
    "email": null,
    "address_line1": "210 KING ST STE 6100",
    "address_line2": null,
    "address_city": "SAN FRANCISCO",
    "address_state": "CA",
    "address_zip": "94107-1741",
    "address_country": "UNITED STATES",
    "metadata": {},
    "date_created": "2017-09-05T15:54:53.264Z",
    "date_modified": "2017-09-05T15:54:53.264Z",
    "deleted": true,
    "object": "address"
  },
  "color": true,
  "double_sided": true,
  "address_placement": "top_first_page",
  "return_envelope": false,
  "perforated_page": null,
  "custom_envelope": null,
  "extra_service": null,
  "mail_type": "usps_first_class",
  "url": "https://lob-assets.com/letters/ltr_4868c3b754655f90.pdf?expires=1540372221&signature=8r94fse8uam7wGWmW5baxXulU88X2CA",
  "carrier": "USPS",
  "tracking_number": null,
  "tracking_events": [],
  "thumbnails": [
    {
      "small": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_small_1.png?expires=1540372221&signature=a5fRBJ22ZA78Vgpg34M9UfmHWTS3eha",
      "medium": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_medium_1.png?expires=1540372221&signature=bAzL8sv935PY09FWSkpDpWKkyvGSWYF",
      "large": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_large_1.png?expires=1540372221&signature=gsKvxXgrm4v4iZD3bOibK7jApNkEMdW"
    }
  ],
  "merge_variables": {
    "name": "Harry"
  },
  "expected_delivery_date": "2017-09-12",
  "date_created": "2017-09-05T15:54:53.346Z",
  "date_modified": "2017-09-05T15:54:53.346Z",
  "send_date": "2017-09-05T15:54:53.346Z",
  "cards": [
    {
      "id": "card_7a6d73c5c8457fc",
      "account_id": "fa9ea650fc7b31a89f92",
      "description": null,
      "url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e.pdf?version=v1&expires=1636910992&signature=mnsDH2DAxdkN9VibdlLMxJC86sME5WYDqkNtmvGwdNsAaUWfbnv0rJhJ1mR8Ol4uxQq61j5wYZ0r3s-lBkQfDA",
      "size": "2.125x3.375",
      "auto_reorder": false,
      "reorder_quantity": null,
      "raw_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "front_original_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "back_original_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "thumbnails": [
        {
          "small": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_small_1.png?version=v1&expires=1636910992&signature=mrv8JDvpZK4I8WUGH0tPdtK-My5oes0Ltj_gL7BDw96SpCTTeZFHkz81SzclyFP9dQRtlsvAsjcuGcTBvCvOCg",
          "medium": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_medium_1.png?version=v1&expires=1636910992&signature=VgL_2Ckm_kxKiWGgWtdNoy9HHOn8dGYSVOn7UqyCbwdbVlUtx28TRN4Bo8Iru3n0keKp9He0YhKT1ILotznMDA",
          "large": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_large_1.png?version=v1&expires=1636910992&signature=FKSzymA13j-CQ0uk20cGHZTzT3vimzNBYrgp-xifLFg4mMdo1BZALR5O0aF_jVhsX614hKP35ONdYl47TQxXAw"
        },
        {
          "small": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_small_2.png?version=v1&expires=1636910992&signature=IWsmPa_ULlv2yyqjX564d_YfHHY_M7i9YxDnw-WXDr2jtOFcArmRZQbnHeE9g_rYxnddJbgosuv8-c2utiu7Cg",
          "medium": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_medium_2.png?version=v1&expires=1636910992&signature=zxK7VKGiTvz5Ywrkaydd0v3GcYf58R7A08J4tNfI7-aiNODDcTF3l0MqY13n9Pyc8RXSdD0XVBY-OpbA1VM-Ag",
          "large": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_large_2.png?version=v1&expires=1636910992&signature=r0OFUhh315ZwN0raMZdIwJd2oCIEYsz0BABaMxIuO1PKTD0ckGWrhcGdzk2dlWQ6vSvp0CUQ5k1RXGqkIIqkDw"
        }
      ],
      "available_quantity": 10000,
      "pending_quantity": 0,
      "countries": null,
      "status": "rendered",
      "mode": "test",
      "orientation": "horizontal",
      "threshold_amount": 0,
      "date_created": "2017-08-05T15:54:53.346Z",
      "date_modified": "2017-08-05T15:54:53.346Z",
      "object": "card"
    }
  ],
  "object": "letter"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Cancel Letter

Completely removes a letter from production. This can only be done if the letter has a `send_date` and the `send_date` has not yet passed. If the letter is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.

```java
CompletableFuture<LetterDeletion> cancelLetterAsync(
    final String ltrId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ltrId` | `String` | Template, Required | id of the letter<br>**Constraints**: *Pattern*: `^ltr_[a-zA-Z0-9]+$` |

## Response Type

[`LetterDeletion`](/doc/models/letter-deletion.md)

## Example Usage

```java
String ltrId = "ltr_id4";

lettersController.cancelLetterAsync(ltrId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "ltr_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Letters

Returns a list of your letters. The letters are returned sorted by creation date, with the most recently created letters appearing first.

```java
CompletableFuture<AllLetters> listLettersAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated,
    final Boolean color,
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
| `color` | `Boolean` | Query, Optional | Set to `true` to return only color letters. Set to `false` to return only black & white letters. |
| `scheduled` | `Boolean` | Query, Optional | * `true` - only return orders (past or future) where `send_date` is<br>  greater than `date_created`<br>* `false` - only return orders where `send_date` is equal to `date_created` |
| `sendDate` | `Object` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `mailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Query, Optional | A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`AllLetters`](/doc/models/all-letters.md)

## Example Usage

```java
Integer limit = 10;
MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

lettersController.listLettersAsync(limit, null, null, null, null, null, null, mailType, null).thenAccept(result -> {
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


# Create Letter

Creates a new letter given information

```java
CompletableFuture<DynamicResponse> createLetterAsync(
    final LetterEditable body,
    final String idempotencyKeyHeader,
    final String idempotencyKeyParam)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LetterEditable`](/doc/models/letter-editable.md) | Body, Required | - |
| `idempotencyKeyHeader` | `String` | Header, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |
| `idempotencyKeyParam` | `String` | Query, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).<br>**Constraints**: *Maximum Length*: `256` |

## Response Type

`DynamicResponse`

## Example Usage

```java
LetterEditable body = new LetterEditable();
body.setColor(false);
body.setTo(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setFrom(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setFile(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
String idempotencyKeyHeader = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";
String idempotencyKeyParam = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";

lettersController.createLetterAsync(body, idempotencyKeyHeader, idempotencyKeyParam).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": "ltr_4868c3b754655f90",
  "description": "Demo Letter",
  "metadata": {},
  "to": {
    "id": "adr_d3489cd64c791ab5",
    "description": null,
    "name": "HARRY ZHANG",
    "company": null,
    "phone": null,
    "email": null,
    "address_line1": "210 KING ST STE 6100",
    "address_line2": null,
    "address_city": "SAN FRANCISCO",
    "address_state": "CA",
    "address_zip": "94107-1741",
    "address_country": "UNITED STATES",
    "metadata": {},
    "date_created": "2017-09-05T15:54:53.264Z",
    "date_modified": "2017-09-05T15:54:53.264Z",
    "deleted": true,
    "object": "address"
  },
  "from": {
    "id": "adr_b8fb5acf3a2b55db",
    "description": null,
    "name": "LEORE AVIDAR",
    "company": null,
    "phone": null,
    "email": null,
    "address_line1": "210 KING ST STE 6100",
    "address_line2": null,
    "address_city": "SAN FRANCISCO",
    "address_state": "CA",
    "address_zip": "94107-1741",
    "address_country": "UNITED STATES",
    "metadata": {},
    "date_created": "2017-09-05T15:54:53.264Z",
    "date_modified": "2017-09-05T15:54:53.264Z",
    "deleted": true,
    "object": "address"
  },
  "color": true,
  "double_sided": true,
  "address_placement": "top_first_page",
  "return_envelope": false,
  "perforated_page": null,
  "custom_envelope": null,
  "extra_service": null,
  "mail_type": "usps_first_class",
  "url": "https://lob-assets.com/letters/ltr_4868c3b754655f90.pdf?expires=1540372221&signature=8r94fse8uam7wGWmW5baxXulU88X2CA",
  "carrier": "USPS",
  "tracking_number": null,
  "tracking_events": [],
  "thumbnails": [
    {
      "small": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_small_1.png?expires=1540372221&signature=a5fRBJ22ZA78Vgpg34M9UfmHWTS3eha",
      "medium": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_medium_1.png?expires=1540372221&signature=bAzL8sv935PY09FWSkpDpWKkyvGSWYF",
      "large": "https://lob-assets.com/letters/ltr_4868c3b754655f90_thumb_large_1.png?expires=1540372221&signature=gsKvxXgrm4v4iZD3bOibK7jApNkEMdW"
    }
  ],
  "merge_variables": {
    "name": "Harry"
  },
  "expected_delivery_date": "2017-09-12",
  "date_created": "2017-09-05T15:54:53.346Z",
  "date_modified": "2017-09-05T15:54:53.346Z",
  "send_date": "2017-09-05T15:54:53.346Z",
  "cards": [
    {
      "id": "card_7a6d73c5c8457fc",
      "account_id": "fa9ea650fc7b31a89f92",
      "description": null,
      "url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e.pdf?version=v1&expires=1636910992&signature=mnsDH2DAxdkN9VibdlLMxJC86sME5WYDqkNtmvGwdNsAaUWfbnv0rJhJ1mR8Ol4uxQq61j5wYZ0r3s-lBkQfDA",
      "size": "2.125x3.375",
      "auto_reorder": false,
      "reorder_quantity": null,
      "raw_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "front_original_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "back_original_url": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_raw.pdf?version=v1&expires=1636910992&signature=-bZo31FMAp2vmNaZKyXn_Qa4APqwtNinw76FrQ7uyQejFZw6VBQQYfoiQ642iXh0H2K5i2aOo8_BAkt3UJdVDw",
      "thumbnails": [
        {
          "small": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_small_1.png?version=v1&expires=1636910992&signature=mrv8JDvpZK4I8WUGH0tPdtK-My5oes0Ltj_gL7BDw96SpCTTeZFHkz81SzclyFP9dQRtlsvAsjcuGcTBvCvOCg",
          "medium": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_medium_1.png?version=v1&expires=1636910992&signature=VgL_2Ckm_kxKiWGgWtdNoy9HHOn8dGYSVOn7UqyCbwdbVlUtx28TRN4Bo8Iru3n0keKp9He0YhKT1ILotznMDA",
          "large": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_large_1.png?version=v1&expires=1636910992&signature=FKSzymA13j-CQ0uk20cGHZTzT3vimzNBYrgp-xifLFg4mMdo1BZALR5O0aF_jVhsX614hKP35ONdYl47TQxXAw"
        },
        {
          "small": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_small_2.png?version=v1&expires=1636910992&signature=IWsmPa_ULlv2yyqjX564d_YfHHY_M7i9YxDnw-WXDr2jtOFcArmRZQbnHeE9g_rYxnddJbgosuv8-c2utiu7Cg",
          "medium": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_medium_2.png?version=v1&expires=1636910992&signature=zxK7VKGiTvz5Ywrkaydd0v3GcYf58R7A08J4tNfI7-aiNODDcTF3l0MqY13n9Pyc8RXSdD0XVBY-OpbA1VM-Ag",
          "large": "https://lob-assets.com/cards/card_c51ae96f5cebf3e_thumb_large_2.png?version=v1&expires=1636910992&signature=r0OFUhh315ZwN0raMZdIwJd2oCIEYsz0BABaMxIuO1PKTD0ckGWrhcGdzk2dlWQ6vSvp0CUQ5k1RXGqkIIqkDw"
        }
      ],
      "available_quantity": 10000,
      "pending_quantity": 0,
      "countries": null,
      "status": "rendered",
      "mode": "test",
      "orientation": "horizontal",
      "threshold_amount": 0,
      "date_created": "2017-08-05T15:54:53.346Z",
      "date_modified": "2017-08-05T15:54:53.346Z",
      "object": "card"
    }
  ],
  "object": "letter"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

