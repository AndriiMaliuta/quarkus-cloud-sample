package com.anma.qrk.rest;

import com.anma.qrk.db.model.City;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cities")
public class CityResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> getCities() {
        return City.listAll();
    }
}
