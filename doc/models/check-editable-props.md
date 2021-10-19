
# Check Editable Props

## Structure

`CheckEditableProps`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | `Object` | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | Object getSendDate() | setSendDate(Object sendDate) |
| `MailType` | [`MailType2Enum`](/doc/models/mail-type-2-enum.md) | Optional | Checks must be sent `usps_first_class`<br>**Default**: `MailType2Enum.USPS_FIRST_CLASS`<br>*Default: `MailType2Enum.USPS_FIRST_CLASS`* | MailType2Enum getMailType() | setMailType(MailType2Enum mailType) |
| `Memo` | `String` | Optional | Text to include on the memo line of the check.<br>**Constraints**: *Maximum Length*: `40` | String getMemo() | setMemo(String memo) |
| `CheckNumber` | `Integer` | Optional | An integer that designates the check number.<br>If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`.<br>A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.<br>**Constraints**: `>= 1`, `<= 500000000` | Integer getCheckNumber() | setCheckNumber(Integer checkNumber) |
| `Message` | `String` | Optional | Max of 400 characters to be included at the bottom of the check page.<br>**Constraints**: *Maximum Length*: `400` | String getMessage() | setMessage(String message) |
| `To` | `Object` | Required | Must either be an address ID or an inline object with correct address parameters. Checks cannot be sent internationally (`address_country` must be `US`). The total string of the sum of `address_line1` and `address_line2` must be no longer than 50 characters combined. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine, and returned back with an ID. Depending on your [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions), addresses may also be run through [National Change of Address (NCOA)](https://lob.com/docs#ncoa). If an address used does not meet your account’s [US Mail Strictness Setting](https://dashboard.lob.com/#/settings/account), the request will fail. [More about verification of mailing addresses](https://www.lob.com/guides#mailing_addresses) | Object getTo() | setTo(Object to) |
| `From` | `Object` | Required | Must either be an address ID or an inline object with correct address parameters. Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | Object getFrom() | setFrom(Object from) |
| `BankAccount` | `String` | Required | **Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` | String getBankAccount() | setBankAccount(String bankAccount) |
| `Amount` | `double` | Required | The payment amount to be sent in US dollars. Amounts will be rounded to two decimal places.<br>**Constraints**: `<= 999999.99` | double getAmount() | setAmount(double amount) |
| `Logo` | `Object` | Optional | Accepts a remote URL or local file upload to an image to print (in grayscale) in the upper-left corner of your check. Image requirements:<br><br>* RGB or CMYK<br><br>* square<br><br>* minimum size: 100px x 100px<br><br>* transparent backgrond<br><br>* `png` or `jpg` | Object getLogo() | setLogo(Object logo) |
| `CheckBottom` | `Object` | Optional | The artwork to use on the bottom of the check page.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 8.5"x11" at 300 DPI, while supplied HTML will be rendered and trimmed to fit on a 8.5"x11" page.<br>- The check bottom will always be printed in black & white.<br>- Must conform to [this template](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/check_bottom_template.pdf).<br><br>Need more help? Consult our [HTML examples](#section/HTML-Examples). | Object getCheckBottom() | setCheckBottom(Object checkBottom) |
| `Attachment` | `Object` | Optional | A document to include with the check.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- All pages of PDF, PNG, and JPGs must be sized at 8.5"x11" at 300 DPI, while supplied HTML will be rendered and trimmed to as many 8.5"x11" pages as necessary.<br>- If a PDF is provided, it must be 6 pages or fewer.<br>- The attachment will be printed double-sided in black & white and will be included in the envelope after the check page.<br>- Please follow these [design guidelines](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/check_attachment_template.pdf).<br><br>See [pricing](https://lob.com/pricing/print-mail#compare) for extra costs incurred. Need more help? Consult our [HTML examples](#section/HTML-Examples). | Object getAttachment() | setAttachment(Object attachment) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |

## Example (as JSON)

```json
{
  "description": null,
  "metadata": null,
  "merge_variables": null,
  "send_date": null,
  "mail_type": null,
  "memo": null,
  "check_number": null,
  "message": null,
  "to": {
    "key1": "val1",
    "key2": "val2"
  },
  "from": {
    "key1": "val1",
    "key2": "val2"
  },
  "bank_account": "bank_account4",
  "amount": 56.78,
  "logo": null,
  "check_bottom": null,
  "attachment": null,
  "billing_group_id": null
}
```

