package state_master.ThirdTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controller Class
@RestController
public class Controller {
	
	@Autowired
	private state_master.ThirdTest.service.Country_service Country_service;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Home Page!!!";
	}
	
	@GetMapping("/users")
	public List<state_master.ThirdTest.enitity.Country_Model> getListModels() {
		
		return this.Country_service.getModels();
		
	}
	
	@PostMapping("/users")
	public state_master.ThirdTest.enitity.Country_Model addModel(@RequestBody state_master.ThirdTest.enitity.Country_Model countryModel) {
		return this.Country_service.addModel(countryModel);
	}
	

}