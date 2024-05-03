package edu.iu.habahram.finalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema = "flowers", name = "guitars")
public class Recipients {
    @Id
    @GeneratedValue
    private int id;
    private String lastName;
    private String firstName;
    private String relationship;


    public Recipients(int id, String lastName, String firstName, String relationship) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.relationship = relationship;
    }

    public Recipients() {
    }



    public String getLastName() {
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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }






}



