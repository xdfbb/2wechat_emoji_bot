package io.swagger.api;

import io.swagger.model.BaseResponseOfstring;
import io.swagger.model.MultiFactorAuthParam;
import io.swagger.model.MultiFactorAuthVO;
import io.swagger.model.PasswordParam;
import io.swagger.model.UserDTO;
import io.swagger.model.UserParam;

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
public interface UserControllerApi  {

    /**
     * Generate Multi-Factor Auth qr image
     *
     */
    @PUT
    @Path("/api/admin/users/mfa/generate")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Generate Multi-Factor Auth qr image", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MultiFactorAuthVO.class))),
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
    public MultiFactorAuthVO generateMFAQrImageUsingPUT(MultiFactorAuthParam body);

    /**
     * Gets user profile
     *
     */
    @GET
    @Path("/api/admin/users/profiles")
    @Produces({ "*/*" })
    @Operation(summary = "Gets user profile", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UserDTO.class))),
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
    public UserDTO getProfileUsingGET();

    /**
     * Updates user&#x27;s Multi Factor Auth
     *
     */
    @PUT
    @Path("/api/admin/users/mfa/update")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates user's Multi Factor Auth", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = MultiFactorAuthVO.class))),
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
    public MultiFactorAuthVO updateMFAuthUsingPUT(MultiFactorAuthParam body);

    /**
     * Updates user&#x27;s password
     *
     */
    @PUT
    @Path("/api/admin/users/profiles/password")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates user's password", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = BaseResponseOfstring.class))),
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
    public BaseResponseOfstring updatePasswordUsingPUT(PasswordParam body);

    /**
     * Updates user profile
     *
     */
    @PUT
    @Path("/api/admin/users/profiles")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @Operation(summary = "Updates user profile", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = UserDTO.class))),
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
    public UserDTO updateProfileUsingPUT(UserParam body);
}
