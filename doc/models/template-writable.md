
# Template Writable

## Structure

`TemplateWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Html` | `String` | Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/create_postcard) - `front` and `back`<br>- [Self Mailers](#operation/create_self_mailer) - `inside` and `outside`<br>- [Letters](#operation/create_letter) - `file`<br>- [Checks](#operation/create_check) - `check_bottom` and `attachment`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` | String getHtml() | setHtml(String html) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `Engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY`<br>*Default: `EngineEnum.LEGACY`* | EngineEnum getEngine() | setEngine(EngineEnum engine) |

## Example (as JSON)

```json
{
  "description": null,
  "html": "html0",
  "metadata": null,
  "engine": null
}
```

