package org.carlosthe19916;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {

    @GET
    public String helloWorld() {
        return "Hello world";
    }

}
