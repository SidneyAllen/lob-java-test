
# Check Input To

## Structure

`CheckInputTo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `To` | `Object` | Optional | Must either be an address ID or an inline object with correct address parameters. Checks cannot be sent internationally (`address_country` must be `US`). The total string of the sum of `address_line1` and `address_line2` must be no longer than 50 characters combined. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine, and returned back with an ID. Depending on your [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions), addresses may also be run through [National Change of Address (NCOA)](https://lob.com/docs#ncoa). If an address used does not meet your account’s [US Mail Strictness Setting](https://dashboard.lob.com/#/settings/account), the request will fail. [More about verification of mailing addresses](https://www.lob.com/guides#mailing_addresses) | Object getTo() | setTo(Object to) |

## Example (as JSON)

```json
{
  "to": null
}
```

