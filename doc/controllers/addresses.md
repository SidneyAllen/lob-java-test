# Addresses

To add an address to your address book, you create a new address object. You can retrieve and delete individual
addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

```java
AddressesController addressesController = client.getAddressesController();
```

## Class Name

`AddressesController`

## Methods

* [List Addresses](/doc/controllers/addresses.md#list-addresses)
* [Create Address](/doc/controllers/addresses.md#create-address)
* [Get Address](/doc/controllers/addresses.md#get-address)
* [Delete Address](/doc/controllers/addresses.md#delete-address)


# List Addresses

Returns a list of your addresses. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.

```java
CompletableFuture<AllAddresses> listAddressesAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |

## Response Type

[`AllAddresses`](/doc/models/all-addresses.md)

## Example Usage

```java
Integer limit = 10;

addressesController.listAddressesAsync(limit, null, null, null).thenAccept(result -> {
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
      "id": "adr_e68217bd744d65c8",
      "description": "Harry - Office",
      "name": "HARRY ZHANG",
      "company": "LOB",
      "phone": "5555555555",
      "email": "harry@lob.com",
      "address_line1": "210 KING ST STE 6100",
      "address_line2": null,
      "address_city": "SAN FRANCISCO",
      "address_state": "CA",
      "address_zip": "94107-1741",
      "address_country": "UNITED STATES",
      "metadata": {},
      "date_created": "2019-08-12T00:16:00.361Z",
      "date_modified": "2019-08-12T00:16:00.361Z",
      "object": "address"
    },
    {
      "id": "adr_asdi2y3riuasasoi",
      "description": "Harry - Office",
      "name": "Harry Zhang",
      "company": "Lob",
      "phone": "5555555555",
      "email": "harry@lob.com",
      "metadata": {},
      "address_line1": "370 WATER ST",
      "address_line2": "",
      "address_city": "SUMMERSIDE",
      "address_state": "PRINCE EDWARD ISLAND",
      "address_zip": "C1N 1C4",
      "address_country": "CANADA",
      "date_created": "2019-09-20T00:14:00.361Z",
      "date_modified": "2019-09-20T00:14:00.361Z",
      "object": "address"
    }
  ],
  "object": "list",
  "next_url": "https://api.lob.com/v1/addresses?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wOC0wN1QyMTo1OTo0Ni43NjRaIiwiaWRPZmZzZXQiOiJhZHJfODMwYmYwZWFiZGFhYTQwOSJ9",
  "previous_url": null,
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Address

Creates a new address given information

```java
CompletableFuture<DynamicResponse> createAddressAsync(
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `Object` | Body, Required | - |

## Response Type

`DynamicResponse`

## Example Usage

```java
Object body = com.lob.api.ApiHelper.deserialize("{\"description\":\"Harry - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\",\"email\":\"harry@lob.com\",\"phone\":\"5555555555\",\"address_line1\":\"210 King St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US\"}");

addressesController.createAddressAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": "adr_d3489cd64c791ab5",
  "description": "Harry - Office",
  "name": "HARRY ZHANG",
  "company": "LOB",
  "phone": "5555555555",
  "email": "harry@lob.com",
  "address_line1": "210 KING ST STE 6100",
  "address_city": "SAN FRANCISCO",
  "address_state": "CA",
  "address_zip": "94107",
  "address_country": "US",
  "metadata": {},
  "date_created": "2017-09-05T17:47:53.767Z",
  "date_modified": "2017-09-05T17:47:53.767Z",
  "object": "address"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Get Address

Retrieves the details of an existing address. You need only supply the unique identifier that was returned upon address creation.

```java
CompletableFuture<DynamicResponse> getAddressAsync(
    final String adrId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `adrId` | `String` | Template, Required | id of the address<br>**Constraints**: *Pattern*: `^adr_[a-zA-Z0-9]+$` |

## Response Type

`DynamicResponse`

## Example Usage

```java
String adrId = "adr_id6";

addressesController.getAddressAsync(adrId).thenAccept(result -> {
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


# Delete Address

Deletes the details of an existing address. You need only supply the unique identifier that was returned upon address creation.

```java
CompletableFuture<AddressDeletion> deleteAddressAsync(
    final String adrId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `adrId` | `String` | Template, Required | id of the address<br>**Constraints**: *Pattern*: `^adr_[a-zA-Z0-9]+$` |

## Response Type

[`AddressDeletion`](/doc/models/address-deletion.md)

## Example Usage

```java
String adrId = "adr_id6";

addressesController.deleteAddressAsync(adrId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "adr_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

