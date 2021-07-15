package Master.Country_Master.controller;


import Master.Country_Master.entity.Country_Model;
import Master.Country_Master.service.Country_service;

import Master.Country_Master.service.Country_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controller Class
@RestController
public class Country_Controller {
	
	@Autowired
	private Country_service Country_service;
	
	@GetMapping("/countryHome")
	public String home()
	{
		return "Welcome to Home Page!!!";
	}
	
	@GetMapping("/countryUsers")
	public List<Country_Model> getListModels() {
		
		return this.Country_service.getCountryModels();
		
	}
	
	@PostMapping("/countryUsers")
	public Country_Model addModel(@RequestBody Country_Model countryModel) {
		return this.Country_service.addCountryModel(countryModel);
	}

}
