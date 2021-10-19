
# Template

## Structure

`Template`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Id` | `String` | Required | Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Versions` | [`List<TemplateVersion>`](/doc/models/template-version.md) | Required | An array of all non-deleted [version objects](#tag/Template-Versions) associated with the template. | List<TemplateVersion> getVersions() | setVersions(List<TemplateVersion> versions) |
| `PublishedVersion` | `Object` | Required | - | Object getPublishedVersion() | setPublishedVersion(Object publishedVersion) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example (as JSON)

```json
{
  "description": null,
  "id": "id0",
  "versions": [
    {
      "description": null,
      "html": "html5",
      "engine": null,
      "date_created": "2016-03-13T12:52:32.123Z",
      "date_modified": "2016-03-13T12:52:32.123Z",
      "deleted": null,
      "object": "object3",
      "id": "id5",
      "suggest_json_editor": null
    }
  ],
  "published_version": {
    "key1": "val1",
    "key2": "val2"
  },
  "object": null,
  "metadata": null,
  "date_created": null,
  "date_modified": null,
  "deleted": null
}
```

