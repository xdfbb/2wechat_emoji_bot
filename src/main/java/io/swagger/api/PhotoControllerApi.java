package io.swagger.api;

import io.swagger.model.CustomizedPageOfPhotoDTO;
import io.swagger.model.PhotoDTO;
import io.swagger.model.PhotoParam;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
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
public interface PhotoControllerApi  {

    /**
     * Batch creation photos
     *
     */
    @POST
    @Path("/api/admin/photos/batch")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Batch creation photos", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = PhotoDTO.class)))),
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
    public List<PhotoDTO> createBatchByUsingPOST1(List<PhotoParam> body);

    /**
     * Creates a photo
     *
     */
    @POST
    @Path("/api/admin/photos")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Creates a photo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PhotoDTO.class))),
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
    public PhotoDTO createByUsingPOST5(PhotoParam body);

    /**
     * Deletes photos permanently in batch by id array
     *
     */
    @DELETE
    @Path("/api/admin/photos/batch")
    @Produces({ "*/*" })
    @Operation(summary = "Deletes photos permanently in batch by id array", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = PhotoDTO.class)))),
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
    public List<PhotoDTO> deletePermanentlyInBatchUsingDELETE1();

    /**
     * Deletes photo by id
     *
     */
    @DELETE
    @Path("/api/admin/photos/{photoId}")
    @Operation(summary = "Deletes photo by id", tags={  })
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
    public void deletePermanentlyUsingDELETE4(@PathParam("photoId") Integer photoId);

    /**
     * Gets photo detail by id
     *
     */
    @GET
    @Path("/api/admin/photos/{photoId}")
    @Produces({ "*/*" })
    @Operation(summary = "Gets photo detail by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PhotoDTO.class))),
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
    public PhotoDTO getByUsingGET5(@PathParam("photoId") Integer photoId);

    /**
     * Likes a photo
     *
     */
    @PUT
    @Path("/api/admin/photos/{photoId}/likes")
    @Operation(summary = "Likes a photo", tags={  })
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
    public void likesUsingPUT(@PathParam("photoId") Integer photoId);

    /**
     * Lists latest photos
     *
     */
    @GET
    @Path("/api/admin/photos/latest")
    @Produces({ "*/*" })
    @Operation(summary = "Lists latest photos", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = PhotoDTO.class)))),
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
    public List<PhotoDTO> listPhotosUsingGET(@QueryParam("sort")List<String> sort);

    /**
     * Lists all of photo teams
     *
     */
    @GET
    @Path("/api/admin/photos/teams")
    @Produces({ "*/*" })
    @Operation(summary = "Lists all of photo teams", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = String.class)))),
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
    public List<String> listTeamsUsingGET();

    /**
     * Lists photos
     *
     */
    @GET
    @Path("/api/admin/photos")
    @Produces({ "*/*" })
    @Operation(summary = "Lists photos", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = CustomizedPageOfPhotoDTO.class))),
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
    public CustomizedPageOfPhotoDTO pageByUsingGET4(@QueryParam("keyword")String keyword, @QueryParam("page")Integer page, @QueryParam("size")Integer size, @QueryParam("sort")List<String> sort, @QueryParam("team")String team);

    /**
     * Updates photo in batch
     *
     */
    @PUT
    @Path("/api/admin/photos/batch")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates photo in batch", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = PhotoDTO.class)))),
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
    public List<PhotoDTO> updateBatchByUsingPUT2(List<PhotoParam> body);

    /**
     * Updates a photo
     *
     */
    @PUT
    @Path("/api/admin/photos/{photoId}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates a photo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = PhotoDTO.class))),
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
    public PhotoDTO updateByUsingPUT6(@PathParam("photoId") Integer photoId, PhotoParam body);
}
