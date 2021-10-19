# Template Versions

These API endpoints allow you to create, retrieve, update and delete versions of reusable HTML templates for use with the Print & Mail API.

```java
TemplateVersionsController templateVersionsController = client.getTemplateVersionsController();
```

## Class Name

`TemplateVersionsController`

## Methods

* [Get Template Version](/doc/controllers/template-versions.md#get-template-version)
* [Update Template Version](/doc/controllers/template-versions.md#update-template-version)
* [Delete Template Version](/doc/controllers/template-versions.md#delete-template-version)
* [List Template Versions](/doc/controllers/template-versions.md#list-template-versions)
* [Create Template Version](/doc/controllers/template-versions.md#create-template-version)


# Get Template Version

Retrieves the template version with the given template and version ids.

```java
CompletableFuture<TemplateVersion> getTemplateVersionAsync(
    final String tmplId,
    final String vrsnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |

## Response Type

[`TemplateVersion`](/doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";

templateVersionsController.getTemplateVersionAsync(tmplId, vrsnId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Update Template Version

Updates the template version with the given template and version ids.

```java
CompletableFuture<TemplateVersion> updateTemplateVersionAsync(
    final String tmplId,
    final String vrsnId,
    final String description,
    final EngineEnum engine)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Form, Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` |

## Response Type

[`TemplateVersion`](/doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";
EngineEnum engine = EngineEnum.LEGACY;

templateVersionsController.updateTemplateVersionAsync(tmplId, vrsnId, null, engine).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Delete Template Version

Permanently deletes a template version. A template's `published_version` can not be deleted.

```java
CompletableFuture<TemplateVersionDeletion> deleteTemplateVersionAsync(
    final String tmplId,
    final String vrsnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |

## Response Type

[`TemplateVersionDeletion`](/doc/models/template-version-deletion.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";

templateVersionsController.deleteTemplateVersionAsync(tmplId, vrsnId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "value": {
    "id": "vrsn_123456789",
    "deleted": true
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Template Versions

Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first.

```java
CompletableFuture<AllTemplateVersions> listTemplateVersionsAsync(
    final String tmplId,
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template associated with the retrieved versions<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |

## Response Type

[`AllTemplateVersions`](/doc/models/all-template-versions.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
Integer limit = 10;

templateVersionsController.listTemplateVersionsAsync(tmplId, limit, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "vrsn_4d6ff5d868bf630",
      "description": "Second Version",
      "html": "Second HTML for ",
      "date_created": "2017-11-09T05:09:03.665Z",
      "date_modified": "2018-05-22T22:01:10.479Z",
      "object": "version"
    },
    {
      "id": "vrsn_2a17159c1911919",
      "description": "Test Template",
      "html": "HTML for ",
      "date_created": "2017-11-09T05:08:40.004Z",
      "date_modified": "2018-05-22T22:01:11.309Z",
      "object": "version"
    }
  ],
  "object": "list",
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Template Version

Creates a new template version attached to the specified template.

```java
CompletableFuture<TemplateVersion> createTemplateVersionAsync(
    final String tmplId,
    final String html,
    final String description,
    final EngineEnum engine)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template the new version will be attached to<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `html` | `String` | Form, Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/create_postcard) - `front` and `back`<br>- [Self Mailers](#operation/create_self_mailer) - `inside` and `outside`<br>- [Letters](#operation/create_letter) - `file`<br>- [Checks](#operation/create_check) - `check_bottom` and `attachment`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Form, Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` |

## Response Type

[`TemplateVersion`](/doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String html = "html0";
EngineEnum engine = EngineEnum.LEGACY;

templateVersionsController.createTemplateVersionAsync(tmplId, html, null, engine).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

