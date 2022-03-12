package com.anma.qrk.rest;

import com.anma.qrk.db.model.Cat;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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

    @POST
    @Transactional
    public Response createCat(Cat cat) {
        entityManager.persist(cat);
        return Response.status(Response.Status.CREATED).entity(cat).build();
    }

    @PUT
    @Transactional
    public Cat updateCat(Cat cat) {
        entityManager.merge(cat);
        return cat;
    }
}