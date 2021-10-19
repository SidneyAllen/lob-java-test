# US Autocompletions

Given partial address information, this endpoint returns up to 10 address suggestions.

## Autocompletion Test Env

Your test API key does not autocomplete US addresses and is used to simulate behavior. With your test API key, requests with specific values for `address_prefix` return predetermined values. When `address_prefix` is set to:

- `0 suggestions` - Returns no suggestions - `[PRIMARY NUMBER] s[uggestion]` - Returns a maximum of ten predefined suggested addresses.
  `[PRIMARY NUMBER]` does not have to be a valid primary number when sending a test request.
  Each additional letter in `suggestion` reduces the number of suggestions by one (e.g.
  `1 su` returns 9 suggested addresses). `[PRIMARY NUMBER]` does not affect the number of
  suggestions returned.

City and state filters work as expected and filter the list of predetermined suggested addresses.
See the `test` request & response examples under [Autocomplete Examples](#operation/autocompletion) within the "Autocomplete a partial address" section in US Autocompletions.

```java
USAutocompletionsController uSAutocompletionsController = client.getUSAutocompletionsController();
```

## Class Name

`USAutocompletionsController`


# Autocompletion

Given an address prefix consisting of a partial primary line, as well as optional input of city, state, and zip code, this functionality returns up to 10 full US address suggestions. Not all of them will turn out to be valid addresses; they'll need to be [verified](#operation/us_verification).

```java
CompletableFuture<UsAutocompletions> autocompletionAsync(
    final String addressPrefix,
    final String city,
    final String state,
    final String zipCode,
    final Boolean geoIpSort)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addressPrefix` | `String` | Form, Required | Only accepts numbers and street names in an alphanumeric format. |
| `city` | `String` | Form, Optional | An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. |
| `state` | `String` | Form, Optional | An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. |
| `zipCode` | `String` | Form, Optional | An optional ZIP Code input used to filter suggestions. Matches partial entries. |
| `geoIpSort` | `Boolean` | Form, Optional | If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. |

## Response Type

[`UsAutocompletions`](/doc/models/us-autocompletions.md)

## Example Usage

```java
String addressPrefix = "address_prefix8";

uSAutocompletionsController.autocompletionAsync(addressPrefix, null, null, null, null).thenAccept(result -> {
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

