# Card Orders

The card orders endpoint allows you to easily create card orders for existing cards.
The API provides endpoints for creating card orders and listing card orders for a given card.

```java
CardOrdersController cardOrdersController = client.getCardOrdersController();
```

## Class Name

`CardOrdersController`

## Methods

* [Get Card Orders](/doc/controllers/card-orders.md#get-card-orders)
* [Create Card Order](/doc/controllers/card-orders.md#create-card-order)


# Get Card Orders

Retrieves the card orders associated with the given card id.

```java
CompletableFuture<CardsOrdersResponse> getCardOrdersAsync(
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | The ID of the card to which the card orders belong.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |

## Response Type

[`CardsOrdersResponse`](/doc/models/cards-orders-response.md)

## Example Usage

```java
String cardId = "card_id4";

cardOrdersController.getCardOrdersAsync(cardId).thenAccept(result -> {
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
      "id": "co_e0f8a0562a06bea7f",
      "card_id": "card_6afffd19045076c",
      "status": "available",
      "inventory": 9500,
      "quantity_ordered": 10000,
      "unit_price": 0.75,
      "cancelled_reason": "No longer needed",
      "availability_date": "2021-10-12T21:41:48.326Z",
      "expected_availability_date": "2021-11-04T21:03:18.871Z",
      "date_created": "2021-10-07T21:03:18.871Z",
      "date_modified": "2021-10-16T01:00:30.144Z",
      "object": "card_order"
    }
  ],
  "object": "list",
  "next_url": null,
  "previous_url": null,
  "count": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Card Order

Creates a new card order given information

```java
CompletableFuture<CardOrder> createCardOrderAsync(
    final String cardId,
    final int quantity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | The ID of the card to which the card orders belong.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |
| `quantity` | `int` | Form, Required | **Constraints**: `>= 0`, `<= 10000000` |

## Response Type

[`CardOrder`](/doc/models/card-order.md)

## Example Usage

```java
String cardId = "card_id4";
int quantity = 68;

cardOrdersController.createCardOrderAsync(cardId, quantity).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "co_e0f8a0562a06bea7f",
  "card_id": "card_6afffd19045076c",
  "status": "available",
  "inventory": 9500,
  "quantity_ordered": 10000,
  "unit_price": 0.75,
  "cancelled_reason": "No longer needed",
  "availability_date": "2021-10-12T21:41:48.326Z",
  "expected_availability_date": "2021-11-04T21:03:18.871Z",
  "date_created": "2021-10-07T21:03:18.871Z",
  "date_modified": "2021-10-16T01:00:30.144Z",
  "object": "card_order"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

