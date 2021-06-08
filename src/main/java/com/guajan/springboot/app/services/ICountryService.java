package com.guajan.springboot.app.services;

import java.util.List;

import com.guajan.springboot.app.entities.Country;

public interface ICountryService {
    
    List<Country> findAll();
    
    void save(Country country);
}
