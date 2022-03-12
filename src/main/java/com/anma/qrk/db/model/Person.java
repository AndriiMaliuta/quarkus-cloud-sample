package com.anma.qrk.db.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "persons")

public class Person {

    @Id
    @Column(name = "person_id")
    private long id;
    private String name;
    @Column(name = "full_name") private String fullName;
    private String email;
    private String gender;
    private String status;
    private int age;
    private int cars;
    @Column(name="country_code") private String countryCode;
    @Column(name = "has_children") private boolean hasChildren;
    private boolean engaged;
    private LocalDateTime createdAt = LocalDateTime.now();
//    @OneToMany
//    private List<Cat> cats;
    @Column(name = "country_id") private long countryId;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public boolean isEngaged() {
        return engaged;
    }

    public void setEngaged(boolean engaged) {
        this.engaged = engaged;
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
}
