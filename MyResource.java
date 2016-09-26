package com.koushikchaganti.pincode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.koushikchaganti.pincode.service.ZipcodeService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("pincode")
@Produces(value={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/{zipcode}")
    public Response getZipcodeService(@PathParam("zipcode") int pincode) {
        ZipcodeService zip = new ZipcodeService();
       
        return Response.status(Status.ACCEPTED).entity(zip.getZipcode(pincode)).build();
   }
    
      
}
