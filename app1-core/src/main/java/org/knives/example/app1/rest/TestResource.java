package org.knives.example.app1.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("test")
public class TestResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Test resouce is working";
    }
}
