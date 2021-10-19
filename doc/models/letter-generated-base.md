
# Letter Generated Base

## Structure

`LetterGeneratedBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
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
  "to": null,
  "carrier": "USPS",
  "from": null,
  "id": null
}
```

