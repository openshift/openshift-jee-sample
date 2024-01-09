package org.wildfly.sample;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello!";
    }
}
