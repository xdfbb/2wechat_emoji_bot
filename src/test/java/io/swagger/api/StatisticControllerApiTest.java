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

import io.swagger.model.StatisticDTO;
import io.swagger.model.StatisticWithUserDTO;
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
 * API tests for StatisticControllerApi 
 */
public class StatisticControllerApiTest {


    private StatisticControllerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8090", StatisticControllerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Gets blog statistics.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statisticsUsingGETTest() {
        //StatisticDTO response = api.statisticsUsingGET();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Gets blog statistics with user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statisticsWithUserUsingGETTest() {
        //StatisticWithUserDTO response = api.statisticsWithUserUsingGET();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
