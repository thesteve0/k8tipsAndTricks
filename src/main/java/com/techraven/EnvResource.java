package com.techraven;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;


import java.util.Map;

@Path("/envs")
public class EnvResource {

    StringBuilder sb = new StringBuilder("Here are the env variables: \n");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String values() throws JsonProcessingException {
        Map envs = System.getenv();
        ObjectMapper objectMapper = new ObjectMapper();
        String jacksonData = objectMapper.writeValueAsString(envs);
//        System.getenv().forEach((k, v) -> {
//            sb.append("name: " + k + " value:" + v);
//        });
        return jacksonData;
    }
}