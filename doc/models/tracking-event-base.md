
# Tracking Event Base

As mail pieces travel through the mail stream, USPS scans their unique barcodes, and Lob processes these mail scans to generate tracking events.

## Structure

`TrackingEventBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `evnt_`.<br>**Constraints**: *Pattern*: `^evnt_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Time` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date USPS registered the event. | LocalDateTime getTime() | setTime(LocalDateTime time) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": "id0",
  "time": null,
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "object2"
}
```

