# Intl Verifications

Address verification for non-US addresses

## Intl Verifications Test Env

When verifying international addresses, you'll likely want to test against
a wide array of addresses to ensure you're handling responses correctly.
With your test API key, requests that use specific values for `primary_line`
let you explore the responses to many types of addresses:

<table>
  <tr>
    <th style="white-space: nowrap">DELIVERABILITY OF SAMPLE RESPONSE</th>
    <th style="white-space: nowrap">SET <code>primary_line</code> TO</th>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap">deliverable</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>deliverable_missing_info</code></td>
    <td style="white-space: nowrap">deliverable missing info</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap">undeliverable</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>no_match</code></td>
    <td style="white-space: nowrap">no match</td>
  </tr>
</table>
See the `test` request & response examples under [Intl Verification Examples](#operation/intl_verification) within the
"Verify an international address section" in Intl Verifications.

You can rely on the response from these examples generally matching the response
you'd see in the live environment with an address of that type (excluding the `recipient` field).

The test API key does not perform any verification, automatic correction, or standardization
for addresses. If you wish to try these features out, use our [live demo](https://lob.com/address-verification)
or the free plan (see [our pricing](https://lob.com/pricing/address-verification) for details).

```java
IntlVerificationsController intlVerificationsController = client.getIntlVerificationsController();
```

## Class Name

`IntlVerificationsController`

## Methods

* [Bulk Intl Verifications](/doc/controllers/intl-verifications.md#bulk-intl-verifications)
* [Intl Verification](/doc/controllers/intl-verifications.md#intl-verification)


# Bulk Intl Verifications

Verify a list of international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<IntlVerifications> bulkIntlVerificationsAsync(
    final List<MultipleComponentsIntl> addresses)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addresses` | [`List<MultipleComponentsIntl>`](/doc/models/multiple-components-intl.md) | Form, Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` |

## Response Type

[`IntlVerifications`](/doc/models/intl-verifications.md)

## Example Usage

```java
List<MultipleComponentsIntl> addresses = new LinkedList<>();

MultipleComponentsIntl addresses0 = new MultipleComponentsIntl();
addresses0.setPrimaryLine("primary_line6");
addresses0.setCountry(CountryExtendedEnum.TK);
addresses.add(addresses0);

MultipleComponentsIntl addresses1 = new MultipleComponentsIntl();
addresses1.setPrimaryLine("primary_line7");
addresses1.setCountry(CountryExtendedEnum.TL);
addresses.add(addresses1);


intlVerificationsController.bulkIntlVerificationsAsync(addresses).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "addresses": [
    {
      "id": "intl_ver_c7cb63d68f8d6",
      "recipient": null,
      "primary_line": "370 WATER ST",
      "secondary_line": "",
      "last_line": "SUMMERSIDE PE C1N 1C4",
      "country": "CA",
      "coverage": "SUBBUILDING",
      "deliverability": "deliverable",
      "status": "LV4",
      "components": {
        "primary_number": "370",
        "street_name": "WATER ST",
        "city": "SUMMERSIDE",
        "state": "PE",
        "postal_code": "C1N 1C4"
      },
      "object": "intl_verification"
    }
  ],
  "errors": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Intl Verification

Verify an international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<IntlVerification> intlVerificationAsync(
    final Object body,
    final XLangOutputEnum xLangOutput)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `Object` | Body, Required | - |
| `xLangOutput` | [`XLangOutputEnum`](/doc/models/x-lang-output-enum.md) | Header, Optional | * `native` - Translate response to the native language of the country in the request<br>* `match` - match the response to the language in the request<br><br>Default response is in English. |

## Response Type

[`IntlVerification`](/doc/models/intl-verification.md)

## Example Usage

```java
Object body = com.lob.api.ApiHelper.deserialize("{\"recipient\":\"Harry Zhang\",\"primary_line\":\"370 Water St\",\"secondary_line\":\"\",\"city\":\"Summerside\",\"state\":\"Prince Edward Island\",\"postal code\":\"C1N 1C4\",\"country\":\"CA\"}");

intlVerificationsController.intlVerificationAsync(body, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "intl_ver_c7cb63d68f8d6",
  "recipient": null,
  "primary_line": "370 WATER ST",
  "secondary_line": "",
  "last_line": "SUMMERSIDE PE C1N 1C4",
  "country": "CA",
  "coverage": "SUBBUILDING",
  "deliverability": "deliverable",
  "status": "LV4",
  "components": {
    "primary_number": "370",
    "street_name": "WATER ST",
    "city": "SUMMERSIDE",
    "state": "PE",
    "postal_code": "C1N 1C4"
  },
  "object": "intl_verification"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

