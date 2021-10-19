
# Letter Editable

## Structure

`LetterEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | `Object` | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | Object getSendDate() | setSendDate(Object sendDate) |
| `MailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS`<br>*Default: `MailTypeEnum.USPS_FIRST_CLASS`* | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Color` | `boolean` | Required | Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white. | boolean getColor() | setColor(boolean color) |
| `DoubleSided` | `Boolean` | Optional | Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.<br>**Default**: `true`<br>*Default: `true`* | Boolean getDoubleSided() | setDoubleSided(Boolean doubleSided) |
| `AddressPlacement` | [`AddressPlacementEnum`](/doc/models/address-placement-enum.md) | Optional | Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.<br><br>* `top_first_page` - (default) print address information at the top of your provided first page<br>* `insert_blank_page` - insert a blank address page at the beginning of your file (you will be charged for the extra page)<br>* `bottom_first_page_center` - **(deprecation planned within a few months)** print address information at the bottom center of your provided first page<br>* `bottom_first_page` - print address information at the bottom of your provided first page<br>**Default**: `AddressPlacementEnum.TOP_FIRST_PAGE`<br>*Default: `AddressPlacementEnum.TOP_FIRST_PAGE`* | AddressPlacementEnum getAddressPlacement() | setAddressPlacement(AddressPlacementEnum addressPlacement) |
| `ReturnEnvelope` | `Object` | Optional | Indicates if a return envelope is requested for the letter. The value corresponding to this field is by default a boolean. But if the account is signed up for custom return envelopes, the value is of type string and is `no_9_single_window` for a standard return envelope and a custom `return_envelope_id` for non-standard return envelopes.<br><br>To include a return envelope with your letter, set to `true` and specify the `perforated_page`. See [pricing](https://www.lob.com/pricing/print-mail#compare) for extra costs incurred. | Object getReturnEnvelope() | setReturnEnvelope(Object returnEnvelope) |
| `PerforatedPage` | `Integer` | Optional | Required if `return_envelope` is `true`. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to `1`. The blank page added by `address_placement=insert_blank_page` will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our [perforation guide](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf). | Integer getPerforatedPage() | setPerforatedPage(Integer perforatedPage) |
| `CustomEnvelope` | [`CustomEnvelope`](/doc/models/custom-envelope.md) | Optional | A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used.<br><br>Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access. | CustomEnvelope getCustomEnvelope() | setCustomEnvelope(CustomEnvelope customEnvelope) |
| `To` | `Object` | Required | Must either be an address ID or an inline object with correct address parameters. If an object is used, an address will be created, corrected, and standardized for free whenever possible using our US Address Verification engine (if it is a US address), and returned back with an ID. Depending on your [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions), US addresses may also be run through [National Change of Address (NCOA)](https://lob.com/docs#ncoa). Non-US addresses will be standardized into uppercase only. If a US address used does not meet your account’s [US Mail strictness setting](https://dashboard.lob.com/#/settings/account), the request will fail. [Lob Guide: Verification of Mailing Addresses](https://www.lob.com/guides#mailing_addresses) | Object getTo() | setTo(Object to) |
| `From` | `Object` | Required | Must either be an address ID or an inline object with correct address parameters. Must be a US address unless using a `custom_envelope`. All addresses will be standardized into uppercase without being modified by verification. | Object getFrom() | setFrom(Object from) |
| `File` | `Object` | Required | Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- All pages of a supplied PDF file must be sized at 8.5"x11", while supplied HTML will be rendered and trimmed to as many 8.5"x11" pages as necessary.<br>- For design specifications, please see our [PDF](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_template.pdf) and [HTML](#section/HTML-Examples) templates.<br>- If a `custom_envelope` is used, follow [this template](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_custom_envelope.pdf).<br>- For domestic destinations, the file limit is 60 pages single-sided or 120 pages double-sided. For international destinations, the file limit is 6 pages single-sided or 12 pages double-sided. PDFs that surpass the file limit will error, while HTML that renders more pages than the file limit will be trimmed.<br>- Any letters over 6 pages single-sided or 12 pages double-sided will be placed in a [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_flat_template.pdf) instead of the standard double window envelope.<br><br>See [pricing](https://lob.com/pricing/print-mail#compare) for extra costs incurred. | Object getFile() | setFile(Object file) |
| `ExtraService` | [`ExtraService1Enum`](/doc/models/extra-service-1-enum.md) | Optional | Add an extra service to your letter. See [pricing](https://www.lob.com/pricing/print-mail#compare) for extra costs incurred.<br><br>* `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: [#10 envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf) and [flat envelope](https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf) (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.<br>* `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter<br>* `registered` - provides tracking and confirmation for international addresses | ExtraService1Enum getExtraService() | setExtraService(ExtraService1Enum extraService) |
| `Cards` | `List<String>` | Optional | A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1`, *Pattern*: `^card_[a-zA-Z0-9]+$` | List<String> getCards() | setCards(List<String> cards) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See [Billing Group API](https://lob.github.io/lob-openapi/#tag/Billing-Groups) for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |

## Example (as JSON)

```json
{
  "description": null,
  "metadata": null,
  "merge_variables": null,
  "send_date": null,
  "mail_type": null,
  "color": false,
  "double_sided": null,
  "address_placement": null,
  "return_envelope": null,
  "perforated_page": null,
  "custom_envelope": null,
  "to": {
    "key1": "val1",
    "key2": "val2"
  },
  "from": {
    "key1": "val1",
    "key2": "val2"
  },
  "file": {
    "key1": "val1",
    "key2": "val2"
  },
  "extra_service": null,
  "cards": null,
  "billing_group_id": null
}
```

