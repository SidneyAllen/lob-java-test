
# Postcard Editable

## Structure

`PostcardEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS`<br>*Default: `MailTypeEnum.USPS_FIRST_CLASS`* | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | `Object` | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | Object getSendDate() | setSendDate(Object sendDate) |
| `Size` | [`PostcardSizeEnum`](/doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6`<br>*Default: `PostcardSizeEnum.ENUM_4X6`* | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `To` | `Object` | Required | Must either be an address ID or an inline object with correct address parameters. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine (if it is a US address), and returned back with an ID. Depending on your [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions), US addresses may also be run through [National Change of Address (NCOA)](https://lob.com/docs#ncoa). Non-US addresses will be standardized into uppercase only. If a US address used does not meet your account’s [US Mail strictness setting](https://dashboard.lob.com/#/settings/account), the request will fail. [Lob Guide: Verification of Mailing Addresses](https://www.lob.com/guides#mailing_addresses) | Object getTo() | setTo(Object to) |
| `From` | `Object` | Optional | *Required* if `to` address is international. Must either be an address ID or an inline object with correct address parameters. Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | Object getFrom() | setFrom(Object from) |
| `Front` | `Object` | Required | The artwork to use as the front of your postcard.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the specified `size`.<br><br>See [here](#section/HTML-Examples) for HTML examples. | Object getFront() | setFront(Object front) |
| `Back` | `Object` | Required | The artwork to use as the back of your postcard.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the specified `size`.<br>- Be sure to leave room for address and postage information by following the templates provided here:<br>  - [4x6 template](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/4x6_postcard.pdf)<br>  - [6x9 template](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x9_postcard.pdf)<br>  - [6x11 template](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x11_postcard.pdf)<br><br>See [here](#section/HTML-Examples) for HTML examples. | Object getBack() | setBack(Object back) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |

## Example (as JSON)

```json
{
  "description": null,
  "metadata": null,
  "mail_type": null,
  "merge_variables": null,
  "send_date": null,
  "size": null,
  "to": {
    "key1": "val1",
    "key2": "val2"
  },
  "from": null,
  "front": {
    "key1": "val1",
    "key2": "val2"
  },
  "back": {
    "key1": "val1",
    "key2": "val2"
  },
  "billing_group_id": null
}
```

