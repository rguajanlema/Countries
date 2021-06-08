package com.guajan.springboot.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guajan.springboot.app.entities.Country;


public interface CountryRepository extends JpaRepository<Country,Integer>{
    
}
