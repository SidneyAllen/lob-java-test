/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lob.api.ApiHelper;
import com.lob.api.AuthManager;
import com.lob.api.Configuration;
import com.lob.api.DateTimeHelper;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.Headers;
import com.lob.api.http.client.HttpCallback;
import com.lob.api.http.client.HttpClient;
import com.lob.api.http.client.HttpContext;
import com.lob.api.http.request.HttpRequest;
import com.lob.api.http.response.HttpResponse;
import com.lob.api.http.response.HttpStringResponse;
import com.lob.api.models.AllSelfMailers;
import com.lob.api.models.MailTypeEnum;
import com.lob.api.models.SelfMailer;
import com.lob.api.models.SelfMailerDeletion;
import com.lob.api.models.SelfMailerEditable;
import com.lob.api.models.SelfMailerSizeEnum;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SelfMailersController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public SelfMailersController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public SelfMailersController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer
     * identifier that was returned upon self_mailer creation.
     * @param  sfmId  Required parameter: id of the self_mailer
     * @return    Returns the SelfMailer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SelfMailer getSelfMailer(
            final String sfmId) throws ApiException, IOException {
        HttpRequest request = buildGetSelfMailerRequest(sfmId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetSelfMailerResponse(context);
    }

    /**
     * Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer
     * identifier that was returned upon self_mailer creation.
     * @param  sfmId  Required parameter: id of the self_mailer
     * @return    Returns the SelfMailer response from the API call
     */
    public CompletableFuture<SelfMailer> getSelfMailerAsync(
            final String sfmId) {
        return makeHttpCallAsync(() -> buildGetSelfMailerRequest(sfmId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetSelfMailerResponse(context));
    }

    /**
     * Builds the HttpRequest object for getSelfMailer.
     */
    private HttpRequest buildGetSelfMailerRequest(
            final String sfmId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/self_mailers/{sfm_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("sfm_id",
                new SimpleEntry<Object, Boolean>(sfmId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getSelfMailer.
     * @return An object of type SelfMailer
     */
    private SelfMailer handleGetSelfMailerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SelfMailer result = ApiHelper.deserialize(responseBody,
                SelfMailer.class);

        return result;
    }

    /**
     * Completely removes a self mailer from production. This can only be done if the self mailer's
     * `send_date` has not yet passed. If the self mailer is successfully canceled, you will not be
     * charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate
     * [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.
     * @param  sfmId  Required parameter: id of the self_mailer
     * @return    Returns the SelfMailerDeletion response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SelfMailerDeletion deleteSelfMailer(
            final String sfmId) throws ApiException, IOException {
        HttpRequest request = buildDeleteSelfMailerRequest(sfmId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteSelfMailerResponse(context);
    }

    /**
     * Completely removes a self mailer from production. This can only be done if the self mailer's
     * `send_date` has not yet passed. If the self mailer is successfully canceled, you will not be
     * charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate
     * [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.
     * @param  sfmId  Required parameter: id of the self_mailer
     * @return    Returns the SelfMailerDeletion response from the API call
     */
    public CompletableFuture<SelfMailerDeletion> deleteSelfMailerAsync(
            final String sfmId) {
        return makeHttpCallAsync(() -> buildDeleteSelfMailerRequest(sfmId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeleteSelfMailerResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteSelfMailer.
     */
    private HttpRequest buildDeleteSelfMailerRequest(
            final String sfmId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/self_mailers/{sfm_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("sfm_id",
                new SimpleEntry<Object, Boolean>(sfmId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteSelfMailer.
     * @return An object of type SelfMailerDeletion
     */
    private SelfMailerDeletion handleDeleteSelfMailerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SelfMailerDeletion result = ApiHelper.deserialize(responseBody,
                SelfMailerDeletion.class);

        return result;
    }

    /**
     * Returns a list of your self_mailers. The self_mailers are returned sorted by creation date,
     * with the most recently created self_mailers appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include[]=total_count`.
     * @param  dateCreated  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  size  Optional parameter: THe self mailer sizes to be returned.
     * @param  scheduled  Optional parameter: * `true` - only return orders (past or future) where
     *         `send_date` is greater than `date_created` * `false` - only return orders where
     *         `send_date` is equal to `date_created`
     * @param  sendDate  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  mailType  Optional parameter: A string designating the mail postage type: *
     *         `usps_first_class` - (default) * `usps_standard` - a [cheaper
     *         option](https://lob.com/pricing/print-mail#compare) which is less predictable and
     *         takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for
     *         any postcards sent outside of the United States.
     * @param  sortBy  Optional parameter: Sorts items by ascending or descending dates.
     * @return    Returns the AllSelfMailers response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllSelfMailers listSelfMailers(
            final Integer limit,
            final Object beforeAfter,
            final Object include,
            final LocalDateTime dateCreated,
            final SelfMailerSizeEnum size,
            final Boolean scheduled,
            final Object sendDate,
            final MailTypeEnum mailType,
            final Object sortBy) throws ApiException, IOException {
        HttpRequest request = buildListSelfMailersRequest(limit, beforeAfter, include, dateCreated,
                size, scheduled, sendDate, mailType, sortBy);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListSelfMailersResponse(context);
    }

    /**
     * Returns a list of your self_mailers. The self_mailers are returned sorted by creation date,
     * with the most recently created self_mailers appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include[]=total_count`.
     * @param  dateCreated  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  size  Optional parameter: THe self mailer sizes to be returned.
     * @param  scheduled  Optional parameter: * `true` - only return orders (past or future) where
     *         `send_date` is greater than `date_created` * `false` - only return orders where
     *         `send_date` is equal to `date_created`
     * @param  sendDate  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  mailType  Optional parameter: A string designating the mail postage type: *
     *         `usps_first_class` - (default) * `usps_standard` - a [cheaper
     *         option](https://lob.com/pricing/print-mail#compare) which is less predictable and
     *         takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for
     *         any postcards sent outside of the United States.
     * @param  sortBy  Optional parameter: Sorts items by ascending or descending dates.
     * @return    Returns the AllSelfMailers response from the API call
     */
    public CompletableFuture<AllSelfMailers> listSelfMailersAsync(
            final Integer limit,
            final Object beforeAfter,
            final Object include,
            final LocalDateTime dateCreated,
            final SelfMailerSizeEnum size,
            final Boolean scheduled,
            final Object sendDate,
            final MailTypeEnum mailType,
            final Object sortBy) {
        return makeHttpCallAsync(() -> buildListSelfMailersRequest(limit, beforeAfter, include,
                dateCreated, size, scheduled, sendDate, mailType, sortBy),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleListSelfMailersResponse(context));
    }

    /**
     * Builds the HttpRequest object for listSelfMailers.
     */
    private HttpRequest buildListSelfMailersRequest(
            final Integer limit,
            final Object beforeAfter,
            final Object include,
            final LocalDateTime dateCreated,
            final SelfMailerSizeEnum size,
            final Boolean scheduled,
            final Object sendDate,
            final MailTypeEnum mailType,
            final Object sortBy) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/self_mailers");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("limit",
                (limit != null) ? limit : 10);
        queryParameters.put("before/after", beforeAfter);
        queryParameters.put("include", include);
        queryParameters.put("date_created", DateTimeHelper.toRfc8601DateTime(dateCreated));
        queryParameters.put("size",
                (size != null) ? size.value() : "6x18_bifold");
        queryParameters.put("scheduled", scheduled);
        queryParameters.put("send_date", sendDate);
        queryParameters.put("mail_type",
                (mailType != null) ? mailType.value() : "usps_first_class");
        queryParameters.put("sort_by", sortBy);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listSelfMailers.
     * @return An object of type AllSelfMailers
     */
    private AllSelfMailers handleListSelfMailersResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        AllSelfMailers result = ApiHelper.deserialize(responseBody,
                AllSelfMailers.class);

        return result;
    }

    /**
     * Creates a new self_mailer given information.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKeyHeader  Optional parameter: A string of no longer than 256 characters
     *         that uniquely identifies this resource. For more help integrating idempotency keys,
     *         refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).
     * @param  idempotencyKeyParam  Optional parameter: A string of no longer than 256 characters
     *         that uniquely identifies this resource. For more help integrating idempotency keys,
     *         refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).
     * @return    Returns the SelfMailer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SelfMailer createSelfMailer(
            final SelfMailerEditable body,
            final String idempotencyKeyHeader,
            final String idempotencyKeyParam) throws ApiException, IOException {
        HttpRequest request = buildCreateSelfMailerRequest(body, idempotencyKeyHeader,
                idempotencyKeyParam);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateSelfMailerResponse(context);
    }

    /**
     * Creates a new self_mailer given information.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKeyHeader  Optional parameter: A string of no longer than 256 characters
     *         that uniquely identifies this resource. For more help integrating idempotency keys,
     *         refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).
     * @param  idempotencyKeyParam  Optional parameter: A string of no longer than 256 characters
     *         that uniquely identifies this resource. For more help integrating idempotency keys,
     *         refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).
     * @return    Returns the SelfMailer response from the API call
     */
    public CompletableFuture<SelfMailer> createSelfMailerAsync(
            final SelfMailerEditable body,
            final String idempotencyKeyHeader,
            final String idempotencyKeyParam) {
        return makeHttpCallAsync(() -> buildCreateSelfMailerRequest(body, idempotencyKeyHeader,
                idempotencyKeyParam),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateSelfMailerResponse(context));
    }

    /**
     * Builds the HttpRequest object for createSelfMailer.
     */
    private HttpRequest buildCreateSelfMailerRequest(
            final SelfMailerEditable body,
            final String idempotencyKeyHeader,
            final String idempotencyKeyParam) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/self_mailers");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("idempotency_key_param", idempotencyKeyParam);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Idempotency-Key-Header", idempotencyKeyHeader);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createSelfMailer.
     * @return An object of type SelfMailer
     */
    private SelfMailer handleCreateSelfMailerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SelfMailer result = ApiHelper.deserialize(responseBody,
                SelfMailer.class);

        return result;
    }

}