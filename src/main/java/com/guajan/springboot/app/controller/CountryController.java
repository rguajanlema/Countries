package com.guajan.springboot.app.controller;

import com.guajan.springboot.app.entities.Country;
import com.guajan.springboot.app.repositories.CountryRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CountryController {
    
	
	 @Autowired 
	 private CountryRepository countryRepository;
	    
    @GetMapping("/")
    public String showPage(Model model){

        model.addAttribute("data", countryRepository.findAll());
        
        return "index";
    }

    @PostMapping("/save")
    public String save(Country country){
        countryRepository.save(country);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCountry(Integer id){
        countryRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    //@ResponseBody
    public Country findOne(Integer id){
    	Country resp = countryRepository.getOne(id);
    	if(resp==null)
    		return new Country();
        return resp;
    }
}
