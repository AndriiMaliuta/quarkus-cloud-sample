package com.anma.qrk.db.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "cities")
public class City {

    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "city_id")
    private long id;
    private String name;
    @Column(name = "country_code")
    private String code;
    private String continent;
    @Column(name = "created_at") private LocalDateTime createdAt;
    @Column(name = "country_id") private long countryId;
    private long population;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
