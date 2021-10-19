
# Template Version

## Structure

`TemplateVersion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Html` | `String` | Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/create_postcard) - `front` and `back`<br>- [Self Mailers](#operation/create_self_mailer) - `inside` and `outside`<br>- [Letters](#operation/create_letter) - `file`<br>- [Checks](#operation/create_check) - `check_bottom` and `attachment`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` | String getHtml() | setHtml(String html) |
| `Engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY`<br>*Default: `EngineEnum.LEGACY`* | EngineEnum getEngine() | setEngine(EngineEnum engine) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required | Value is type of resource. | String getObject() | setObject(String object) |
| `Id` | `String` | Required | Unique identifier prefixed with `vrsn_`.<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `SuggestJsonEditor` | `Boolean` | Optional | Used by frontend, true if the template uses advanced features. | Boolean getSuggestJsonEditor() | setSuggestJsonEditor(Boolean suggestJsonEditor) |

## Example (as JSON)

```json
{
  "description": null,
  "html": "html0",
  "engine": null,
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "deleted": null,
  "object": "object2",
  "id": "id0",
  "suggest_json_editor": null
}
```

