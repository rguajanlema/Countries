package com.guajan.springboot.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guajan.springboot.app.entities.Country;
import com.guajan.springboot.app.repositories.CountryRepository;



@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(CountriesApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		
		countryRepository.save(new Country("Earth","World")); 
		countryRepository.save(new Country("China","Peking")); 
		countryRepository.save(new Country("Germany","Berlin")); 
		countryRepository.save(new Country("USA","Washington DC")); 
		countryRepository.save(new Country("Russia","Moscow")); 
		countryRepository.save(new Country("Namibia","Windhoek"));
	}
}
