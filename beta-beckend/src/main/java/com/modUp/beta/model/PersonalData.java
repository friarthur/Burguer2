package com.modUp.beta.model;


import jakarta.persistence.*;

@Entity
public class PersonalData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Column(length = 70, nullable = false)
    private String street;
    @Column(length = 70, nullable = false)
    private String neighbothood;
    @Column(length = 5, nullable = false)
    private String number;
    @Column(length = 255, nullable = false)
    private String description;

    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighbothoood() {
        return neighbothood;
    }

    public void setNeighbothoood(String neighbothoood) {
        this.neighbothood = neighbothoood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //to string


    @Override
    public String toString() {
        return "PersonalData{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", neighbothoood='" + neighbothood + '\'' +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
