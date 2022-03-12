package com.anma.qrk.rest;

import com.anma.qrk.db.model.Country;
import com.anma.qrk.repo.CountryRepo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/country")
public class CountryResource {

    @Inject
    CountryRepo countryRepo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Country> listCountries() {
        return countryRepo.listAll();
    }
}
