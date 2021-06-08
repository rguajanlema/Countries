package com.guajan.springboot.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String capital;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }
    public Country() {
    }
    @Override
    public String toString() {
        return "Country [capital=" + capital + ", id=" + id + ", name=" + name + "]";
    }

    

}
