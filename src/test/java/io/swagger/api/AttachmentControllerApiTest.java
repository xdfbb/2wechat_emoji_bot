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

import io.swagger.model.Attachment;
import io.swagger.model.AttachmentDTO;
import io.swagger.model.AttachmentParam;
import io.swagger.model.CustomizedPageOfAttachmentDTO;
import java.io.File;
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
 * API tests for AttachmentControllerApi 
 */
public class AttachmentControllerApiTest {


    private AttachmentControllerApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8090", AttachmentControllerApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Deletes attachments permanently in batch by id array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermanentlyInBatchUsingDELETETest() {
        //List<Attachment> response = api.deletePermanentlyInBatchUsingDELETE();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Deletes attachment permanently by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermanentlyUsingDELETETest() {
        Integer id = null;
        //AttachmentDTO response = api.deletePermanentlyUsingDELETE(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Gets attachment detail by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByUsingGETTest() {
        Integer id = null;
        //AttachmentDTO response = api.getByUsingGET(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all of media types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMediaTypesUsingGETTest() {
        //List<String> response = api.listMediaTypesUsingGET();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Lists all of types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTypesUsingGETTest() {
        //List<String> response = api.listTypesUsingGET();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * pageBy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pageByUsingGETTest() {
        String attachmentType = null;
        String keyword = null;
        String mediaType = null;
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        //CustomizedPageOfAttachmentDTO response = api.pageByUsingGET(attachmentType, keyword, mediaType, page, size, sort);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Updates a attachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateByUsingPUTTest() {
        Integer attachmentId = null;
        AttachmentParam body = null;
        //AttachmentDTO response = api.updateByUsingPUT(attachmentId, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Uploads single file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadAttachmentUsingPOSTTest() {
        org.apache.cxf.jaxrs.ext.multipart.Attachment file = null;
        //AttachmentDTO response = api.uploadAttachmentUsingPOST(file);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Uploads multi files (Invalid in Swagger UI)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadAttachmentsUsingPOSTTest() {
        List<File> files = null;
        //List<AttachmentDTO> response = api.uploadAttachmentsUsingPOST(files);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
