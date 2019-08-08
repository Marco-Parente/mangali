package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/categoria")
public class CategoriaController {
    
    @GET
    @Path("/")
    public String index() {
        return "teste";
    }
}
