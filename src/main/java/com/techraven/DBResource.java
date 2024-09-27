package com.techraven;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Produces;
import java.util.List;


@Path("/db")
@Produces(MediaType.APPLICATION_JSON)
public class DBResource {
    @GET
    public List<Data> getDatabase() {
         List<Data> allData = Data.listAll();
         return allData;
    }
}