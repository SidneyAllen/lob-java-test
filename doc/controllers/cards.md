# Cards

The cards endpoint allows you to easily create cards that can later be affixed to Letters.
The API provides endpoints for creating cards, retrieving individual cards, creating card orders, and retrieving a list of cards.

```java
CardsController cardsController = client.getCardsController();
```

## Class Name

`CardsController`

## Methods

* [List Cards](/doc/controllers/cards.md#list-cards)
* [Create Card](/doc/controllers/cards.md#create-card)
* [Get Card](/doc/controllers/cards.md#get-card)
* [Update Card](/doc/controllers/cards.md#update-card)
* [Delete Card](/doc/controllers/cards.md#delete-card)


# List Cards

Returns a list of your cards. The cards are returned sorted by creation date, with the most recently created addresses appearing first.

```java
CompletableFuture<CardsResponse> listCardsAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object sortBy)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `sortBy` | `Object` | Query, Optional | Sorts items by ascending or descending dates. |

## Response Type

[`CardsResponse`](/doc/models/cards-response.md)

## Example Usage

```java
Integer limit = 10;

cardsController.listCardsAsync(limit, null, null).thenAccept(result -> {
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
        }
      ],
      "available_quantity": 10000,
      "pending_quantity": 0,
      "countries": null,
      "status": "rendered",
      "mode": "test",
      "orientation": "horizontal",
      "threshold_amount": 0,
      "date_created": "2021-03-24T22:51:42.838Z",
      "date_modified": "2021-03-24T22:51:42.838Z",
      "send_date": "2021-03-24T22:51:42.838Z",
      "object": "card"
    }
  ],
  "object": "list",
  "previous_url": null,
  "next_url": null,
  "count": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Card

Creates a new card given information

```java
CompletableFuture<Card> createCardAsync(
    final CardEditable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CardEditable`](/doc/models/card-editable.md) | Body, Required | - |

## Response Type

[`Card`](/doc/models/card.md)

## Example Usage

```java
CardEditable body = new CardEditable();
body.setFront(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setDescription("Test card");
body.setSize(SizeEnum.ENUM_2125X3375);
body.setBack(com.lob.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

cardsController.createCardAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "card_7a6d73c5c8457fc",
  "account_id": "fa9ea650fc7b31a89f92",
  "description": "Test card",
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
  "date_created": "2021-03-24T22:51:42.838Z",
  "date_modified": "2021-03-24T22:51:42.838Z",
  "send_date": "2021-03-24T22:51:42.838Z",
  "object": "card"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Get Card

Retrieves the details of an existing card. You need only supply the unique customer identifier that was returned upon card creation.

```java
CompletableFuture<Card> getCardAsync(
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | id of the card<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |

## Response Type

[`Card`](/doc/models/card.md)

## Example Usage

```java
String cardId = "card_id4";

cardsController.getCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "card_7a6d73c5c8457fc",
  "account_id": "fa9ea650fc7b31a89f92",
  "description": "Test card",
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
  "date_created": "2021-03-24T22:51:42.838Z",
  "date_modified": "2021-03-24T22:51:42.838Z",
  "send_date": "2021-03-24T22:51:42.838Z",
  "object": "card"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Update Card

Update the details of an existing card. You need only supply the unique identifier that was returned upon card creation.

```java
CompletableFuture<Card> updateCardAsync(
    final String cardId,
    final String description,
    final Boolean autoReorder,
    final Double reorderQuantity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | id of the card<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | Description of the card.<br>**Constraints**: *Maximum Length*: `255` |
| `autoReorder` | `Boolean` | Form, Optional | Allows for auto reordering |
| `reorderQuantity` | `Double` | Form, Optional | The quantity of items to be reordered (only required when auto_reorder is true).<br>**Constraints**: `>= 10000`, `<= 10000000` |

## Response Type

[`Card`](/doc/models/card.md)

## Example Usage

```java
String cardId = "card_id4";

cardsController.updateCardAsync(cardId, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "card_7a6d73c5c8457fc",
  "account_id": "fa9ea650fc7b31a89f92",
  "description": "Test card",
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
  "date_created": "2021-03-24T22:51:42.838Z",
  "date_modified": "2021-03-24T22:51:42.838Z",
  "send_date": "2021-03-24T22:51:42.838Z",
  "object": "card"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Delete Card

Delete an existing card. You need only supply the unique identifier that was returned upon card creation.

```java
CompletableFuture<CardDeletion> deleteCardAsync(
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | id of the card<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |

## Response Type

[`CardDeletion`](/doc/models/card-deletion.md)

## Example Usage

```java
String cardId = "card_id4";

cardsController.deleteCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "card_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

