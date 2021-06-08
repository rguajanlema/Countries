package com.guajan.springboot.app.services;

import java.util.List;

import com.guajan.springboot.app.entities.Country;
import com.guajan.springboot.app.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService{

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {
        return repository.findAll();
    }

	@Override
	public void save(Country country) {
		repository.save(country);
		
	}
    
}
