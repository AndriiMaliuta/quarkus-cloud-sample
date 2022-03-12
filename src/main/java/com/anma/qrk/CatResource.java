package com.anma.qrk;

import com.anma.qrk.db.model.Cat;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cats")
public class CatResource {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cat> cats() {
        return entityManager.createNamedQuery("Cat.findAll", Cat.class).getResultList();
    }
}