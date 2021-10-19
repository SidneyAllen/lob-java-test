
# No Extra Service

## Structure

`NoExtraService`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TrackingEvents` | [`List<TrackingEventNormal>`](/doc/models/tracking-event-normal.md) | Optional | An array of tracking events ordered by ascending `time`. | List<TrackingEventNormal> getTrackingEvents() | setTrackingEvents(List<TrackingEventNormal> trackingEvents) |
| `Cards` | [`List<Card>`](/doc/models/card.md) | Optional | An array of cards associated with a specific letter | List<Card> getCards() | setCards(List<Card> cards) |
| `ReturnAddress` | `Object` | Optional | Specifies the address the return envelope will be sent back to. This is an optional argument that is available if an account is signed up for the return envelope tracking beta, and has `return_envelope`, and `perforated_page` fields populated in the API request. | Object getReturnAddress() | setReturnAddress(Object returnAddress) |
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
| `To` | `Object` | Required | - | Object getTo() | setTo(Object to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"`<br>*Default: `"USPS"`* | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](/doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `From` | `Object` | Required | - | Object getFrom() | setFrom(Object from) |
| `Id` | `String` | Required | Unique identifier prefixed with `ltr_`.<br>**Constraints**: *Pattern*: `^ltr_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `TemplateId` | `Object` | Optional | - | Object getTemplateId() | setTemplateId(Object templateId) |
| `TemplateVersionId` | `String` | Optional | - | String getTemplateVersionId() | setTemplateVersionId(String templateVersionId) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "color": null,
  "to": null,
  "carrier": "USPS",
  "from": null,
  "id": null
}
```

