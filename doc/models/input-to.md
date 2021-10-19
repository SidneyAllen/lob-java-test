
# Input To

## Structure

`InputTo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `To` | `Object` | Optional | Must either be an address ID or an inline object with correct address parameters. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine (if it is a US address), and returned back with an ID. Depending on your [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions), US addresses may also be run through [National Change of Address (NCOA)](https://lob.com/docs#ncoa). Non-US addresses will be standardized into uppercase only. If a US address used does not meet your account’s [US Mail strictness setting](https://dashboard.lob.com/#/settings/account), the request will fail. [Lob Guide: Verification of Mailing Addresses](https://www.lob.com/guides#mailing_addresses) | Object getTo() | setTo(Object to) |

## Example (as JSON)

```json
{
  "to": null
}
```

