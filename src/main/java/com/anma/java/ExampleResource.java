package com.anma.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ExampleResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/cats")
    @Produces(MediaType.APPLICATION_JSON)
    public String cats() {
        return "{\"cats\": \"cats\"}";
    }
}