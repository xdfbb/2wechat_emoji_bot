package io.swagger.api;

import io.swagger.model.MenuDTO;
import io.swagger.model.MenuParam;
import io.swagger.model.MenuVO;

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
public interface MenuControllerApi  {

    /**
     * createBatchBy
     *
     */
    @POST
    @Path("/api/admin/menus/batch")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "createBatchBy", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuDTO.class)))),
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
    public List<MenuDTO> createBatchByUsingPOST(List<MenuParam> body);

    /**
     * Creates a menu
     *
     */
    @POST
    @Path("/api/admin/menus")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Creates a menu", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MenuDTO.class))),
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
    public MenuDTO createByUsingPOST3(MenuParam body);

    /**
     * deleteBatchBy
     *
     */
    @DELETE
    @Path("/api/admin/menus/batch")
    @Produces({ "*/*" })
    @Operation(summary = "deleteBatchBy", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuDTO.class)))),
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
    public List<MenuDTO> deleteBatchByUsingDELETE();

    /**
     * Deletes a menu
     *
     */
    @DELETE
    @Path("/api/admin/menus/{menuId}")
    @Produces({ "*/*" })
    @Operation(summary = "Deletes a menu", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MenuDTO.class))),
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
    public MenuDTO deleteByUsingDELETE2(@PathParam("menuId") Integer menuId);

    /**
     * Gets menu detail by id
     *
     */
    @GET
    @Path("/api/admin/menus/{menuId}")
    @Produces({ "*/*" })
    @Operation(summary = "Gets menu detail by id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MenuDTO.class))),
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
    public MenuDTO getByUsingGET3(@PathParam("menuId") Integer menuId);

    /**
     * Lists all menus
     *
     */
    @GET
    @Path("/api/admin/menus")
    @Produces({ "*/*" })
    @Operation(summary = "Lists all menus", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuDTO.class)))),
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
    public List<MenuDTO> listAllUsingGET1(@QueryParam("sort")List<String> sort);

    /**
     * Lists menus as tree
     *
     */
    @GET
    @Path("/api/admin/menus/tree_view")
    @Produces({ "*/*" })
    @Operation(summary = "Lists menus as tree", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuVO.class)))),
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
    public List<MenuVO> listAsTreeUsingGET1(@QueryParam("sort")List<String> sort);

    /**
     * Lists menus as tree by team
     *
     */
    @GET
    @Path("/api/admin/menus/team/tree_view")
    @Produces({ "*/*" })
    @Operation(summary = "Lists menus as tree by team", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuVO.class)))),
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
    public List<MenuVO> listDefaultsAsTreeByTeamUsingGET(@QueryParam("team")String team, @QueryParam("sort")List<String> sort);

    /**
     * Lists all menu teams
     *
     */
    @GET
    @Path("/api/admin/menus/teams")
    @Produces({ "*/*" })
    @Operation(summary = "Lists all menu teams", tags={  })
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
    public List<String> teamsUsingGET1();

    /**
     * updateBatchBy
     *
     */
    @PUT
    @Path("/api/admin/menus/batch")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "updateBatchBy", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = MenuDTO.class)))),
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
    public List<MenuDTO> updateBatchByUsingPUT1(List<MenuParam> body);

    /**
     * Updates a menu
     *
     */
    @PUT
    @Path("/api/admin/menus/{menuId}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates a menu", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MenuDTO.class))),
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
    public MenuDTO updateByUsingPUT4(@PathParam("menuId") Integer menuId, MenuParam body);
}
