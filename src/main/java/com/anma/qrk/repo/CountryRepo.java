package com.anma.qrk.repo;

import com.anma.qrk.db.model.Country;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CountryRepo implements PanacheRepository<Country> {

    public Country findCountryById(Integer id) {
        return find("country_id = ?1", id).firstResult();
    }
}
