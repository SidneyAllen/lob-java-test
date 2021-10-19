# Templates

These API endpoints allow you to create, retrieve, update and delete reusable HTML templates for use with the Print & Mail API.

```java
TemplatesController templatesController = client.getTemplatesController();
```

## Class Name

`TemplatesController`

## Methods

* [Get Template](/doc/controllers/templates.md#get-template)
* [Update Template](/doc/controllers/templates.md#update-template)
* [Delete Template](/doc/controllers/templates.md#delete-template)
* [List Templates](/doc/controllers/templates.md#list-templates)
* [Create Template](/doc/controllers/templates.md#create-template)


# Get Template

Retrieves the details of an existing template. You need only supply the unique template identifier that was returned upon template creation.

```java
CompletableFuture<Template> getTemplateAsync(
    final String tmplId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | id of the template<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |

## Response Type

[`Template`](/doc/models/template.md)

## Example Usage

```java
String tmplId = "tmpl_id8";

templatesController.getTemplateAsync(tmplId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "tmpl_c94e83ca2cd5121",
  "description": "Test Template",
  "versions": [
    {
      "id": "vrsn_362184d96d9b0c9",
      "suggest_json_editor": true,
      "description": "Test Template",
      "engine": "legacy",
      "html": "<html>HTML for {{name}}</html>",
      "date_created": "2017-11-07T22:56:10.962Z",
      "date_modified": "2017-11-07T22:56:10.962Z",
      "object": "version"
    }
  ],
  "published_version": {
    "id": "vrsn_362184d96d9b0c9",
    "suggest_json_editor": false,
    "description": "Test Template",
    "engine": "handlebars",
    "html": "<html>HTML for {{name}}</html>",
    "date_created": "2017-11-07T22:56:10.962Z",
    "date_modified": "2017-11-07T22:56:10.962Z",
    "object": "version"
  },
  "metadata": {},
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "template"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Update Template

Updates the description and/or published version of the template with the given id. To update the template's html, create a new version of the template.

```java
CompletableFuture<Template> updateTemplateAsync(
    final String tmplId,
    final String description,
    final String publishedVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | id of the template<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `publishedVersion` | `String` | Form, Optional | - |

## Response Type

[`Template`](/doc/models/template.md)

## Example Usage

```java
String tmplId = "tmpl_id8";

templatesController.updateTemplateAsync(tmplId, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "tmpl_c94e83ca2cd5121",
  "description": "Test Template",
  "versions": [
    {
      "id": "vrsn_362184d96d9b0c9",
      "suggest_json_editor": true,
      "description": "Test Template",
      "engine": "legacy",
      "html": "<html>HTML for {{name}}</html>",
      "date_created": "2017-11-07T22:56:10.962Z",
      "date_modified": "2017-11-07T22:56:10.962Z",
      "object": "version"
    }
  ],
  "published_version": {
    "id": "vrsn_362184d96d9b0c9",
    "suggest_json_editor": false,
    "description": "Test Template",
    "engine": "handlebars",
    "html": "<html>HTML for {{name}}</html>",
    "date_created": "2017-11-07T22:56:10.962Z",
    "date_modified": "2017-11-07T22:56:10.962Z",
    "object": "version"
  },
  "metadata": {},
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "template"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Delete Template

Permanently deletes a template. Deleting a template also deletes its associated versions. Deleted templates can not be used to create postcard, letter, or check resources.

```java
CompletableFuture<TemplateDeletion> deleteTemplateAsync(
    final String tmplId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | id of the template<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |

## Response Type

[`TemplateDeletion`](/doc/models/template-deletion.md)

## Example Usage

```java
String tmplId = "tmpl_id8";

templatesController.deleteTemplateAsync(tmplId).thenAccept(result -> {
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
    "id": "tmpl_123456789",
    "deleted": true
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Templates

Returns a list of your templates. The templates are returned sorted by creation date, with the most recently created templates appearing first.

```java
CompletableFuture<AllTemplates> listTemplatesAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |

## Response Type

[`AllTemplates`](/doc/models/all-templates.md)

## Example Usage

```java
Integer limit = 10;

templatesController.listTemplatesAsync(limit, null, null, null).thenAccept(result -> {
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
      "id": "tmpl_d5a5a89da9106f8",
      "description": "Test Template",
      "versions": [
        {
          "id": "vrsn_232a02fb8224791",
          "suggest_json_editor": true,
          "description": "Test Template",
          "engine": "legacy",
          "html": "HTML for ",
          "date_created": "2019-07-27T23:49:01.512Z",
          "date_modified": "2019-07-27T23:49:01.512Z",
          "object": "version"
        }
      ],
      "published_version": {
        "id": "vrsn_232a02fb8224791",
        "suggest_json_editor": false,
        "description": "Test Template",
        "engine": "handlebars",
        "html": "HTML for ",
        "date_created": "2019-07-27T23:49:01.512Z",
        "date_modified": "2019-07-27T23:49:01.512Z",
        "object": "version"
      },
      "metadata": {},
      "date_created": "2019-07-27T23:49:01.511Z",
      "date_modified": "2019-07-27T23:49:01.511Z",
      "object": "template"
    },
    {
      "id": "tmpl_59b2150ae120887",
      "description": "Test Template",
      "versions": [
        {
          "id": "vrsn_2a7eb63ccb795b9",
          "description": "Test Template",
          "html": "HTML for ",
          "date_created": "2019-03-29T10:22:34.643Z",
          "date_modified": "2019-03-29T10:22:34.643Z",
          "object": "version"
        }
      ],
      "published_version": {
        "id": "vrsn_2a7eb63ccb795b9",
        "description": "Test Template",
        "html": "HTML for ",
        "date_created": "2019-03-29T10:22:34.643Z",
        "date_modified": "2019-03-29T10:22:34.643Z",
        "object": "version"
      },
      "metadata": {},
      "date_created": "2019-03-29T10:22:34.642Z",
      "date_modified": "2019-03-29T10:22:34.642Z",
      "object": "template"
    }
  ],
  "object": "list",
  "previous_url": null,
  "next_url": "https://api.lob.com/v1/templates?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wMy0yOVQxMDoyMjozNC42NDJaIiwiaWRPZmZzZXQiOiJ0bXBsXzU5YjIxNTBhZTEyMDg4NyJ9",
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Template

Creates a new template for use with the Print & Mail API. In Live mode, you can only have as many non-deleted templates as allotted in your current [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions). If you attempt to create a template past your limit, you will receive a `403` error. There is no limit in Test mode.

```java
CompletableFuture<Template> createTemplateAsync(
    final String html,
    final String description,
    final Metadata metadata,
    final EngineEnum engine)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `html` | `String` | Form, Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/create_postcard) - `front` and `back`<br>- [Self Mailers](#operation/create_self_mailer) - `inside` and `outside`<br>- [Letters](#operation/create_letter) - `file`<br>- [Checks](#operation/create_check) - `check_bottom` and `attachment`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `metadata` | [`Metadata`](/doc/models/metadata.md) | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. |
| `engine` | [`EngineEnum`](/doc/models/engine-enum.md) | Form, Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` |

## Response Type

[`Template`](/doc/models/template.md)

## Example Usage

```java
String html = "html0";
Metadata metadata = new Metadata();
EngineEnum engine = EngineEnum.LEGACY;

templatesController.createTemplateAsync(html, null, metadata, engine).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "tmpl_c94e83ca2cd5121",
  "description": "Test Template",
  "versions": [
    {
      "id": "vrsn_362184d96d9b0c9",
      "suggest_json_editor": true,
      "description": "Test Template",
      "engine": "legacy",
      "html": "<html>HTML for {{name}}</html>",
      "date_created": "2017-11-07T22:56:10.962Z",
      "date_modified": "2017-11-07T22:56:10.962Z",
      "object": "version"
    }
  ],
  "published_version": {
    "id": "vrsn_362184d96d9b0c9",
    "suggest_json_editor": false,
    "description": "Test Template",
    "engine": "handlebars",
    "html": "<html>HTML for {{name}}</html>",
    "date_created": "2017-11-07T22:56:10.962Z",
    "date_modified": "2017-11-07T22:56:10.962Z",
    "object": "version"
  },
  "metadata": {},
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "template"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

