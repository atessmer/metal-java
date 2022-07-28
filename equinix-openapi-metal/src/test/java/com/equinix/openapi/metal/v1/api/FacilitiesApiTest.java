/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.FacilityList;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FacilitiesApi
 */
@Disabled
public class FacilitiesApiTest {

    private final FacilitiesApi api = new FacilitiesApi();

    /**
     * Retrieve all facilities
     *
     * Provides a listing of available datacenters where you can provision Packet devices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findFacilitiesTest() throws ApiException {
        List<String> include = null;
        List<String> exclude = null;
        FacilityList response = api.findFacilities(include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all facilities visible by the organization
     *
     * Returns a listing of available datacenters for the given organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findFacilitiesByOrganizationTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        FacilityList response = api.findFacilitiesByOrganization(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve all facilities visible by the project
     *
     * Returns a listing of available datacenters for the given project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findFacilitiesByProjectTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        FacilityList response = api.findFacilitiesByProject(id, include, exclude);
        // TODO: test validations
    }

}