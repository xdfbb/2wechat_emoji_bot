package io.swagger.api;

import io.swagger.model.CustomizedPageOfLogDTO;
import io.swagger.model.LogDTO;

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
public interface LogControllerApi  {

    /**
     * Clears all logs
     *
     */
    @GET
    @Path("/api/admin/logs/clear")
    @Operation(summary = "Clears all logs", tags={  })
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
    public void clearUsingGET();

    /**
     * Lists logs
     *
     */
    @GET
    @Path("/api/admin/logs")
    @Produces({ "*/*" })
    @Operation(summary = "Lists logs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = CustomizedPageOfLogDTO.class))),
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
    public CustomizedPageOfLogDTO pageByUsingGET3(@QueryParam("page")Integer page, @QueryParam("size")Integer size, @QueryParam("sort")List<String> sort);

    /**
     * Pages latest logs
     *
     */
    @GET
    @Path("/api/admin/logs/latest")
    @Produces({ "*/*" })
    @Operation(summary = "Pages latest logs", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", array = @ArraySchema(schema = @Schema(implementation = LogDTO.class)))),
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
    public List<LogDTO> pageLatestUsingGET1(@QueryParam("top")Integer top);
}
