# Reverse Geocode Lookups

Find a list of zip codes associated with a valid US location via latitude and longitude.

```java
ReverseGeocodeLookupsController reverseGeocodeLookupsController = client.getReverseGeocodeLookupsController();
```

## Class Name

`ReverseGeocodeLookupsController`


# Reverse Geocode Lookup

Reverse geocode a valid US location with a live API key.

```java
CompletableFuture<ReverseGeocode> reverseGeocodeLookupAsync(
    final double latitude,
    final double longitude,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `latitude` | `double` | Form, Required | A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be input with `longitude` to pinpoint locations on a map.<br>**Constraints**: `>= -90`, `<= 90` |
| `longitude` | `double` | Form, Required | A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be input with `latitude` to pinpoint locations on a map.<br>**Constraints**: `>= -180`, `<= 180` |
| `size` | `Integer` | Query, Optional | Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations.<br>**Default**: `5`<br>**Constraints**: `>= 1`, `<= 50` |

## Response Type

[`ReverseGeocode`](/doc/models/reverse-geocode.md)

## Example Usage

```java
double latitude = 65.76;
double longitude = 188.04;
Integer size = 5;

reverseGeocodeLookupsController.reverseGeocodeLookupAsync(latitude, longitude, size).thenAccept(result -> {
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

