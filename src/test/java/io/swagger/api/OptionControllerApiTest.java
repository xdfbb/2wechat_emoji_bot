/**
 * Halo API Documentation
 * Documentation for Halo API
 *
 * OpenAPI spec version: 1.5.1
 * Contact: hi@halo.run
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

package io.swagger.api;

import io.swagger.model.CustomizedPageOfOptionSimpleDTO;
import io.swagger.model.OptionDTO;
import io.swagger.model.OptionParam;
import io.swagger.model.OptionSimpleDTO;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Halo API Documentation
 *
 * <p>Documentation for Halo API
 *
 * API tests for OptionControllerApi 
 */
public class OptionControllerApiTest {


    private OptionControllerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8090", OptionControllerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Creates option
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createByUsingPOST4Test() {
        OptionParam body = null;
        //api.createByUsingPOST4(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Deletes option
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermanentlyUsingDELETE3Test() {
        Integer optionId = null;
        //api.deletePermanentlyUsingDELETE3(optionId);
        
        // TODO: test validations
        
        
    }
    /**
     * Gets option detail by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByUsingGET4Test() {
        Integer id = null;
        //OptionSimpleDTO response = api.getByUsingGET4(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists options
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllUsingGET2Test() {
        //List<OptionDTO> response = api.listAllUsingGET2();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all options with list view
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllWithListViewUsingGETTest() {
        String keyword = null;
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        String type = null;
        //CustomizedPageOfOptionSimpleDTO response = api.listAllWithListViewUsingGET(keyword, page, size, sort, type);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all options with map view
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllWithMapViewUsingGETTest() {
        //Object response = api.listAllWithMapViewUsingGET();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists options with map view by keys
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllWithMapViewUsingPOSTTest() {
        List<String> body = null;
        //Object response = api.listAllWithMapViewUsingPOST(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Saves options
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveOptionsUsingPOSTTest() {
        List<OptionParam> body = null;
        //api.saveOptionsUsingPOST(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Saves options by option map
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveOptionsWithMapViewUsingPOSTTest() {
        Object body = null;
        //api.saveOptionsWithMapViewUsingPOST(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Updates option
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateByUsingPUT5Test() {
        Integer optionId = null;
        OptionParam body = null;
        //api.updateByUsingPUT5(optionId, body);
        
        // TODO: test validations
        
        
    }
}