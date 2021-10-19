/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.lob.api.ApiHelper;
import com.lob.api.AuthManager;
import com.lob.api.Configuration;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.Headers;
import com.lob.api.http.client.HttpCallback;
import com.lob.api.http.client.HttpClient;
import com.lob.api.http.client.HttpContext;
import com.lob.api.http.request.HttpRequest;
import com.lob.api.http.response.HttpResponse;
import com.lob.api.http.response.HttpStringResponse;
import com.lob.api.models.CardOrder;
import com.lob.api.models.CardsOrdersResponse;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CardOrdersController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public CardOrdersController(Configuration config, HttpClient httpClient,
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
    public CardOrdersController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieves the card orders associated with the given card id.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @return    Returns the CardsOrdersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CardsOrdersResponse getCardOrders(
            final String cardId) throws ApiException, IOException {
        HttpRequest request = buildGetCardOrdersRequest(cardId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetCardOrdersResponse(context);
    }

    /**
     * Retrieves the card orders associated with the given card id.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @return    Returns the CardsOrdersResponse response from the API call
     */
    public CompletableFuture<CardsOrdersResponse> getCardOrdersAsync(
            final String cardId) {
        return makeHttpCallAsync(() -> buildGetCardOrdersRequest(cardId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetCardOrdersResponse(context));
    }

    /**
     * Builds the HttpRequest object for getCardOrders.
     */
    private HttpRequest buildGetCardOrdersRequest(
            final String cardId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/cards/{card_id}/orders");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("card_id",
                new SimpleEntry<Object, Boolean>(cardId, true));
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
     * Processes the response for getCardOrders.
     * @return An object of type CardsOrdersResponse
     */
    private CardsOrdersResponse handleGetCardOrdersResponse(
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
        CardsOrdersResponse result = ApiHelper.deserialize(responseBody,
                CardsOrdersResponse.class);

        return result;
    }

    /**
     * Creates a new card order given information.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  quantity  Required parameter: Example:
     * @return    Returns the CardOrder response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CardOrder createCardOrder(
            final String cardId,
            final int quantity) throws ApiException, IOException {
        HttpRequest request = buildCreateCardOrderRequest(cardId, quantity);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateCardOrderResponse(context);
    }

    /**
     * Creates a new card order given information.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  quantity  Required parameter: Example:
     * @return    Returns the CardOrder response from the API call
     */
    public CompletableFuture<CardOrder> createCardOrderAsync(
            final String cardId,
            final int quantity) {
        return makeHttpCallAsync(() -> buildCreateCardOrderRequest(cardId, quantity),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateCardOrderResponse(context));
    }

    /**
     * Builds the HttpRequest object for createCardOrder.
     */
    private HttpRequest buildCreateCardOrderRequest(
            final String cardId,
            final int quantity) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/cards/{card_id}/orders");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("card_id",
                new SimpleEntry<Object, Boolean>(cardId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("quantity", quantity);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createCardOrder.
     * @return An object of type CardOrder
     */
    private CardOrder handleCreateCardOrderResponse(
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
        CardOrder result = ApiHelper.deserialize(responseBody,
                CardOrder.class);

        return result;
    }

}