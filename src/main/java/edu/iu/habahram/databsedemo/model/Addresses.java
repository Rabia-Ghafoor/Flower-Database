package edu.iu.habahram.databsedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema = "address", name = "flowers")

public class Addresses {
    @Id
    @GeneratedValue
    private int id;
    private String lastName;
    private String firstName;
    private float cost;
    private int zipCode;
    private String city;
    private String state;
    private String country;
    private String street;

    public Addresses() {
    }



    public Addresses(int id, String lastName, String firstName, String city, String state, String country, String street, int zipCode) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.street = street;
        this.zipCode = zipCode;

    }

    public String getLastName(){
        return lastName;

    }

    public void setName(String name) {


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // getter and setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }



}


