
# Postcard

## Structure

`Postcard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS`<br>*Default: `MailTypeEnum.USPS_FIRST_CLASS`* | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | `Object` | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | Object getSendDate() | setSendDate(Object sendDate) |
| `Size` | [`PostcardSizeEnum`](/doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6`<br>*Default: `PostcardSizeEnum.ENUM_4X6`* | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `To` | `Object` | Required | - | Object getTo() | setTo(Object to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"`<br>*Default: `"USPS"`* | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](/doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `From` | [`AddressUs`](/doc/models/address-us.md) | Optional | - | AddressUs getFrom() | setFrom(AddressUs from) |
| `Id` | `String` | Required | Unique identifier prefixed with `psc_`.<br>**Constraints**: *Pattern*: `^psc_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `FrontTemplateId` | `Object` | Required | - | Object getFrontTemplateId() | setFrontTemplateId(Object frontTemplateId) |
| `BackTemplateId` | `Object` | Required | - | Object getBackTemplateId() | setBackTemplateId(Object backTemplateId) |
| `FrontTemplateVersionId` | `Object` | Required | - | Object getFrontTemplateVersionId() | setFrontTemplateVersionId(Object frontTemplateVersionId) |
| `BackTemplateVersionId` | `Object` | Required | - | Object getBackTemplateVersionId() | setBackTemplateVersionId(Object backTemplateVersionId) |
| `TrackingEvents` | [`List<TrackingEventNormal>`](/doc/models/tracking-event-normal.md) | Optional | An array of tracking_event objects ordered by ascending `time`. Will not be populated for postcards created in test mode. | List<TrackingEventNormal> getTrackingEvents() | setTrackingEvents(List<TrackingEventNormal> trackingEvents) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |
| `Url` | `Object` | Required | - | Object getUrl() | setUrl(Object url) |

## Example (as JSON)

```json
{
  "to": null,
  "carrier": "USPS",
  "id": null,
  "front_template_id": null,
  "back_template_id": null,
  "front_template_version_id": null,
  "back_template_version_id": null,
  "url": null
}
```

