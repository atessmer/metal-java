/**
 * Packet API
 * This is the API for Packet. Interact with your devices, user account, and projects.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: help@packet.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.packet.client.api;

import net.packet.client.ApiException;
import net.packet.client.model.BgpSession;
import net.packet.client.model.BgpSessionList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BgpSessionsApi
 */
public class BgpSessionsApiTest {

    private final BgpSessionsApi api = new BgpSessionsApi();

    
    /**
     * Create a BGP session
     *
     * Creates a BGP session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBgpSessionTest() throws ApiException {
        String id = null;
        String addressFamily = null;
        // BgpSession response = api.createBgpSession(id, addressFamily);

        // TODO: test validations
    }
    
    /**
     * Delete the BGP session
     *
     * Deletes the BGP session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBgpSessionTest() throws ApiException {
        String id = null;
        // api.deleteBgpSession(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a BGP session
     *
     * Returns a BGP session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findBgpSessionByIdTest() throws ApiException {
        String id = null;
        String include = null;
        // BgpSession response = api.findBgpSessionById(id, include);

        // TODO: test validations
    }
    
    /**
     * Retrieve all BGP sessions
     *
     * Provides a listing of available BGP sessions for the device.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findBgpSessionsTest() throws ApiException {
        String id = null;
        // BgpSessionList response = api.findBgpSessions(id);

        // TODO: test validations
    }
    
}