package edu.iu.habahram.finalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(schema = "flowers", name="guitars")
public final class Customer {
    @Id

    private  String username;
    private  String password;
    private  String email;

    public Customer() {
    }

    public Customer(String username,
                    String password,
                    String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getUsername(), customer.getUsername()) && Objects.equals(getPassword(), customer.getPassword()) && Objects.equals(getEmail(), customer.getEmail());
    }

}

