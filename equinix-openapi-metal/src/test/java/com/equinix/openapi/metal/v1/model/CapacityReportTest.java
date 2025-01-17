/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import com.equinix.openapi.metal.v1.model.CapacityPerFacility;
import com.equinix.openapi.metal.v1.model.CapacityPerNewFacility;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for CapacityReport
 */
public class CapacityReportTest {
    private final CapacityReport model = new CapacityReport();

    /**
     * Model tests for CapacityReport
     */
    @Test
    public void testCapacityReport() {
        // TODO: test CapacityReport
    }

    /**
     * Test the property 'ams1'
     */
    @Test
    public void ams1Test() {
        // TODO: test ams1
    }

    /**
     * Test the property 'atl1'
     */
    @Test
    public void atl1Test() {
        // TODO: test atl1
    }

    /**
     * Test the property 'dfw1'
     */
    @Test
    public void dfw1Test() {
        // TODO: test dfw1
    }

    /**
     * Test the property 'ewr1'
     */
    @Test
    public void ewr1Test() {
        // TODO: test ewr1
    }

    /**
     * Test the property 'fra1'
     */
    @Test
    public void fra1Test() {
        // TODO: test fra1
    }

    /**
     * Test the property 'iad1'
     */
    @Test
    public void iad1Test() {
        // TODO: test iad1
    }

    /**
     * Test the property 'lax1'
     */
    @Test
    public void lax1Test() {
        // TODO: test lax1
    }

    /**
     * Test the property 'nrt1'
     */
    @Test
    public void nrt1Test() {
        // TODO: test nrt1
    }

    /**
     * Test the property 'ord1'
     */
    @Test
    public void ord1Test() {
        // TODO: test ord1
    }

    /**
     * Test the property 'sea1'
     */
    @Test
    public void sea1Test() {
        // TODO: test sea1
    }

    /**
     * Test the property 'sin1'
     */
    @Test
    public void sin1Test() {
        // TODO: test sin1
    }

    /**
     * Test the property 'sjc1'
     */
    @Test
    public void sjc1Test() {
        // TODO: test sjc1
    }

    /**
     * Test the property 'syd1'
     */
    @Test
    public void syd1Test() {
        // TODO: test syd1
    }

    /**
     * Test the property 'yyz1'
     */
    @Test
    public void yyz1Test() {
        // TODO: test yyz1
    }

}
