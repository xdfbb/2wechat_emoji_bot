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

import io.swagger.model.CategoryDTO;
import io.swagger.model.CategoryParam;
import io.swagger.model.CategoryVO;
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
 * API tests for CategoryControllerApi 
 */
public class CategoryControllerApiTest {


    private CategoryControllerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8090", CategoryControllerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Creates category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createByUsingPOSTTest() {
        CategoryParam body = null;
        //CategoryDTO response = api.createByUsingPOST(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Deletes category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermanentlyUsingDELETE1Test() {
        Integer categoryId = null;
        //api.deletePermanentlyUsingDELETE1(categoryId);
        
        // TODO: test validations
        
        
    }
    /**
     * Gets category detail
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByUsingGET1Test() {
        Integer categoryId = null;
        //CategoryDTO response = api.getByUsingGET1(categoryId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all categories
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllUsingGETTest() {
        List<String> sort = null;
        Boolean more = null;
        //List<CategoryDTO> response = api.listAllUsingGET(sort, more);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * List all categories as tree
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAsTreeUsingGETTest() {
        List<String> sort = null;
        //List<CategoryVO> response = api.listAsTreeUsingGET(sort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Updates category in batch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBatchByUsingPUTTest() {
        List<CategoryParam> body = null;
        //List<CategoryDTO> response = api.updateBatchByUsingPUT(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Updates category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateByUsingPUT1Test() {
        Integer categoryId = null;
        CategoryParam body = null;
        //CategoryDTO response = api.updateByUsingPUT1(categoryId, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
