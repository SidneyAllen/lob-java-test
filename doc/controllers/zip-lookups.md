# Zip Lookups

Find a list of cities, states and associated information about a US ZIP code.

```java
ZipLookupsController zipLookupsController = client.getZipLookupsController();
```

## Class Name

`ZipLookupsController`


# Zip Lookup

Returns information about a ZIP code

```java
CompletableFuture<Zip> zipLookupAsync(
    final String zipCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `zipCode` | `String` | Form, Required | A 5-digit ZIP code.<br>**Constraints**: *Pattern*: `^\d{5}$` |

## Response Type

[`Zip`](/doc/models/zip.md)

## Example Usage

```java
String zipCode = "94107";

zipLookupsController.zipLookupAsync(zipCode).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "us_zip_c7cb63d68f8d6",
  "cities": [
    {
      "city": "SAN FRANCISCO",
      "state": "CA",
      "county": "SAN FRANCISCO",
      "county_fips": "06075",
      "preferred": true
    }
  ],
  "zip_code_type": "standard",
  "object": "us_zip_lookup",
  "zip_code": "94107"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

