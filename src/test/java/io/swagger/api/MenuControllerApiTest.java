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

import io.swagger.model.MenuDTO;
import io.swagger.model.MenuParam;
import io.swagger.model.MenuVO;
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
 * API tests for MenuControllerApi 
 */
public class MenuControllerApiTest {


    private MenuControllerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8090", MenuControllerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * createBatchBy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBatchByUsingPOSTTest() {
        List<MenuParam> body = null;
        //List<MenuDTO> response = api.createBatchByUsingPOST(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Creates a menu
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createByUsingPOST3Test() {
        MenuParam body = null;
        //MenuDTO response = api.createByUsingPOST3(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * deleteBatchBy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBatchByUsingDELETETest() {
        //List<MenuDTO> response = api.deleteBatchByUsingDELETE();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Deletes a menu
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteByUsingDELETE2Test() {
        Integer menuId = null;
        //MenuDTO response = api.deleteByUsingDELETE2(menuId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Gets menu detail by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByUsingGET3Test() {
        Integer menuId = null;
        //MenuDTO response = api.getByUsingGET3(menuId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all menus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllUsingGET1Test() {
        List<String> sort = null;
        //List<MenuDTO> response = api.listAllUsingGET1(sort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists menus as tree
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAsTreeUsingGET1Test() {
        List<String> sort = null;
        //List<MenuVO> response = api.listAsTreeUsingGET1(sort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists menus as tree by team
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDefaultsAsTreeByTeamUsingGETTest() {
        String team = null;
        List<String> sort = null;
        //List<MenuVO> response = api.listDefaultsAsTreeByTeamUsingGET(team, sort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all menu teams
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsUsingGET1Test() {
        //List<String> response = api.teamsUsingGET1();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * updateBatchBy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBatchByUsingPUT1Test() {
        List<MenuParam> body = null;
        //List<MenuDTO> response = api.updateBatchByUsingPUT1(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Updates a menu
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateByUsingPUT4Test() {
        Integer menuId = null;
        MenuParam body = null;
        //MenuDTO response = api.updateByUsingPUT4(menuId, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
