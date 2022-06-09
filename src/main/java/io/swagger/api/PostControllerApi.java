package io.swagger.api;

import io.swagger.model.BasePostDetailDTO;
import io.swagger.model.BasePostMinimalDTO;
import io.swagger.model.CustomizedPageOfBasePostSimpleDTO;
import io.swagger.model.Post;
import io.swagger.model.PostContentParam;
import io.swagger.model.PostDetailVO;
import io.swagger.model.PostParam;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.feature.Features;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Halo API Documentation
 *
 * <p>Documentation for Halo API
 *
 */
@Path("/")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface PostControllerApi  {

    /**
     * Creates a post
     *
     */
    @POST
    @Path("/api/admin/posts")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Creates a post", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PostDetailVO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public PostDetailVO createByUsingPOST7(PostParam body, @QueryParam("autoSave")Boolean autoSave);

    /**
     * Deletes posts permanently in batch by id array
     *
     */
    @DELETE
    @Path("/api/admin/posts")
    @Produces({ "*/*" })
    @Operation(summary = "Deletes posts permanently in batch by id array", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = Post.class)))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public List<Post> deletePermanentlyInBatchUsingDELETE3();

    /**
     * Deletes a photo permanently
     *
     */
    @DELETE
    @Path("/api/admin/posts/{postId}")
    @Operation(summary = "Deletes a photo permanently", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public void deletePermanentlyUsingDELETE6(@PathParam("postId") Integer postId);

    /**
     * Gets a post
     *
     */
    @GET
    @Path("/api/admin/posts/{postId}")
    @Produces({ "*/*" })
    @Operation(summary = "Gets a post", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PostDetailVO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public PostDetailVO getByUsingGET7(@PathParam("postId") Integer postId);

    /**
     * Likes a post
     *
     */
    @PUT
    @Path("/api/admin/posts/{postId}/likes")
    @Operation(summary = "Likes a post", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public void likesUsingPUT1(@PathParam("postId") Integer postId);

    /**
     * Gets a page of post by post status
     *
     */
    @GET
    @Path("/api/admin/posts/status/{status}")
    @Produces({ "*/*" })
    @Operation(summary = "Gets a page of post by post status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = CustomizedPageOfBasePostSimpleDTO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public CustomizedPageOfBasePostSimpleDTO pageByStatusUsingGET(@PathParam("status") String status, @QueryParam("page")Integer page, @QueryParam("size")Integer size, @QueryParam("sort")List<String> sort, @QueryParam("more")Boolean more);

    /**
     * Lists posts
     *
     */
    @GET
    @Path("/api/admin/posts")
    @Produces({ "*/*" })
    @Operation(summary = "Lists posts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = CustomizedPageOfBasePostSimpleDTO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public CustomizedPageOfBasePostSimpleDTO pageByUsingGET6(@QueryParam("categoryId")Integer categoryId, @QueryParam("keyword")String keyword, @QueryParam("page")Integer page, @QueryParam("size")Integer size, @QueryParam("sort")List<String> sort, @QueryParam("status")String status, @QueryParam("statuses")List<String> statuses, @QueryParam("more")Boolean more);

    /**
     * Pages latest post
     *
     */
    @GET
    @Path("/api/admin/posts/latest")
    @Produces({ "*/*" })
    @Operation(summary = "Pages latest post", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = BasePostMinimalDTO.class)))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public List<BasePostMinimalDTO> pageLatestUsingGET2(@QueryParam("top")Integer top);

    /**
     * Gets a post preview link
     *
     */
    @GET
    @Path("/api/admin/posts/preview/{postId}")
    @Produces({ "*/*" })
    @Operation(summary = "Gets a post preview link", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public String previewUsingGET(@PathParam("postId") Integer postId);

    /**
     * Gets a post preview link
     *
     */
    @GET
    @Path("/api/admin/posts/{postId}/preview")
    @Produces({ "*/*" })
    @Operation(summary = "Gets a post preview link", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public String previewUsingGET1(@PathParam("postId") Integer postId);

    /**
     * Updates a post
     *
     */
    @PUT
    @Path("/api/admin/posts/{postId}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates a post", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PostDetailVO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public PostDetailVO updateByUsingPUT8(@PathParam("postId") Integer postId, PostParam body, @QueryParam("autoSave")Boolean autoSave);

    /**
     * Updates draft
     *
     */
    @PUT
    @Path("/api/admin/posts/{postId}/status/draft/content")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates draft", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = BasePostDetailDTO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public BasePostDetailDTO updateDraftByUsingPUT(@PathParam("postId") Integer postId, PostContentParam body);

    /**
     * Updates post status
     *
     */
    @PUT
    @Path("/api/admin/posts/{postId}/status/{status}")
    @Produces({ "*/*" })
    @Operation(summary = "Updates post status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = BasePostMinimalDTO.class))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public BasePostMinimalDTO updateStatusByUsingPUT2(@PathParam("postId") Integer postId, @PathParam("status") String status);

    /**
     * Updates post status in batch
     *
     */
    @PUT
    @Path("/api/admin/posts/status/{status}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates post status in batch", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = Post.class)))),
        @ApiResponse(responseCode = "201", description = "The request has succeeded and a new resource has been created as a result."),
        @ApiResponse(responseCode = "204", description = "There is no content to send for this request, but the headers may be useful."),
        @ApiResponse(responseCode = "400", description = "The server could not understand the request due to invalid syntax."),
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\""),
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content."),
        @ApiResponse(responseCode = "404", description = "The server can not find the requested resource."),
        @ApiResponse(responseCode = "405", description = "The request method is known by the server but has been disabled and cannot be used. "),
        @ApiResponse(responseCode = "500", description = "The server has encountered a situation it doesn't know how to handle."),
        @ApiResponse(responseCode = "501", description = "The request method is not supported by the server and cannot be handled."),
        @ApiResponse(responseCode = "503", description = "The server is not ready to handle the request.") })
    public List<Post> updateStatusInBatchUsingPUT1(@PathParam("status") String status, List<Integer> body);
}
