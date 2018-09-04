package com.dxc.RestSampleJersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("name")
    @Produces(MediaType.TEXT_PLAIN)
    public String getName() {
        return "Amitabh";
    }
    
    @GET
    @Path("roll")
    @Produces(MediaType.TEXT_PLAIN)
    public String getRoll() {
        return "IS013";
    }
    @GET
    @Path("marks")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMarks() {
        return "85";
    }
    
}
