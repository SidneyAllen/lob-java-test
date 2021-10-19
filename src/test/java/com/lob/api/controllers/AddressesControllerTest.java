/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.lob.api.ApiHelper;
import com.lob.api.DateTimeHelper;
import com.lob.api.LobClient;
import com.lob.api.exceptions.ApiException;
import com.lob.api.models.AllAddresses;
import com.lob.api.models.DynamicResponse;
import com.lob.api.testing.TestHelper;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddressesControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static LobClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AddressesController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAddressesController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a list of your addresses. The addresses are returned sorted by creation date, with
     * the most recently created addresses appearing first.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListAddresses() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        Object beforeAfter = null;
        Object include = null;
        LocalDateTime dateCreated = null;

        // Set callback and perform API call
        AllAddresses result = null;
        try {
            result = controller.listAddresses(limit, beforeAfter, include, dateCreated);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"data\":[{\"id\":\"adr_e68217bd744d65c8\",\"description\":\"Harry - Office\",\"n"
                + "ame\":\"HARRY ZHANG\",\"company\":\"LOB\",\"phone\":\"5555555555\",\"email\":\"h"
                + "arry@lob.com\",\"address_line1\":\"210 KING ST STE 6100\",\"address_line2\":null"
                + ",\"address_city\":\"SAN FRANCISCO\",\"address_state\":\"CA\",\"address_zip\":\"9"
                + "4107-1741\",\"address_country\":\"UNITED STATES\",\"metadata\":{},\"date_created"
                + "\":\"2019-08-12T00:16:00.361Z\",\"date_modified\":\"2019-08-12T00:16:00.361Z\","
                + "\"object\":\"address\"},{\"id\":\"adr_asdi2y3riuasasoi\",\"description\":\"Harry"
                + " - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\",\"phone\":\"5555555555"
                + "\",\"email\":\"harry@lob.com\",\"metadata\":{},\"address_line1\":\"370 WATER ST"
                + "\",\"address_line2\":\"\",\"address_city\":\"SUMMERSIDE\",\"address_state\":\"PR"
                + "INCE EDWARD ISLAND\",\"address_zip\":\"C1N 1C4\",\"address_country\":\"CANADA\","
                + "\"date_created\":\"2019-09-20T00:14:00.361Z\",\"date_modified\":\"2019-09-20T00:"
                + "14:00.361Z\",\"object\":\"address\"}],\"object\":\"list\",\"next_url\":\"https:/"
                + "/api.lob.com/v1/addresses?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wOC0wN1QyMTo1"
                + "OTo0Ni43NjRaIiwiaWRPZmZzZXQiOiJhZHJfODMwYmYwZWFiZGFhYTQwOSJ9\",\"previous_url\":"
                + "null,\"count\":2}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a new address given information.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateAddress() throws Exception {
        // Parameters for the API call
        Object body = ApiHelper.deserialize(
                "{\"description\":\"Harry - Office\",\"name\":\"Harry Zhang\",\"company\":\"Lob\","
                + "\"email\":\"harry@lob.com\",\"phone\":\"5555555555\",\"address_line1\":\"210 Kin"
                + "g St\",\"address_line2\":\"# 6100\",\"address_city\":\"San Francisco\",\"address"
                + "_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US\"}");

        // Set callback and perform API call
        DynamicResponse result = null;
        try {
            result = controller.createAddress(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("ratelimit-limit", TestHelper.nullString);
        headers.put("ratelimit-remaining", TestHelper.nullString);
        headers.put("ratelimit-reset", TestHelper.nullString);
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"id\":\"adr_d3489cd64c791ab5\",\"description\":\"Harry - Office\",\"name\":\"HAR"
                + "RY ZHANG\",\"company\":\"LOB\",\"phone\":\"5555555555\",\"email\":\"harry@lob.co"
                + "m\",\"address_line1\":\"210 KING ST STE 6100\",\"address_city\":\"SAN FRANCISCO"
                + "\",\"address_state\":\"CA\",\"address_zip\":\"94107\",\"address_country\":\"US"
                + "\",\"metadata\":{},\"date_created\":\"2017-09-05T17:47:53.767Z\",\"date_modified"
                + "\":\"2017-09-05T17:47:53.767Z\",\"object\":\"address\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
