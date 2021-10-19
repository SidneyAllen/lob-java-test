
# Getting Started with Lob

## Introduction

The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to sindicate any API errors. <p> Looking for our [previous documentation](https://lob.github.io/legacy-docs/)?

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=import3)

## Installation

The following section explains how to use the LobLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *LobLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify LobLib in `Group Id`, lob-lib in `Artifact Id` and 1.3.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Lob-Java&workspaceName=Lob&projectName=LobLib&rootNamespace=com.lob.api&groupId=LobLib&artifactId=lob-lib&version=1.3.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project LobLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
LobClient client = new LobClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .build();
```

## Authorization

This API uses `Basic Authentication`.

## List of APIs

* [Addresses](/doc/controllers/addresses.md)
* [Bank Accounts](/doc/controllers/bank-accounts.md)
* [Billing Groups](/doc/controllers/billing-groups.md)
* [Card Orders](/doc/controllers/card-orders.md)
* [Cards](/doc/controllers/cards.md)
* [Checks](/doc/controllers/checks.md)
* [Intl Verifications](/doc/controllers/intl-verifications.md)
* [Letters](/doc/controllers/letters.md)
* [Postcards](/doc/controllers/postcards.md)
* [Reverse Geocode Lookups](/doc/controllers/reverse-geocode-lookups.md)
* [Self Mailers](/doc/controllers/self-mailers.md)
* [Template Versions](/doc/controllers/template-versions.md)
* [Templates](/doc/controllers/templates.md)
* [US Autocompletions](/doc/controllers/us-autocompletions.md)
* [US Verifications](/doc/controllers/us-verifications.md)
* [Zip Lookups](/doc/controllers/zip-lookups.md)

## Classes Documentation

* [Utility Classes](/doc/utility-classes.md)
* [HttpRequest](/doc/http-request.md)
* [HttpResponse](/doc/http-response.md)
* [HttpStringResponse](/doc/http-string-response.md)
* [HttpContext](/doc/http-context.md)
* [HttpBodyRequest](/doc/http-body-request.md)
* [HttpCallback Interface](/doc/http-callback-interface.md)
* [Headers](/doc/headers.md)
* [ApiException](/doc/api-exception.md)
* [Configuration Interface](/doc/configuration-interface.md)
* [HttpClientConfiguration](/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](/doc/http-client-configuration-builder.md)

