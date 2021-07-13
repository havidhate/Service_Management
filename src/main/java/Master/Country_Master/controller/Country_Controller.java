package Master.state_master.ThirdTest.controller;

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
	private Master.state_master.ThirdTest.service.Country_service Country_service;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Home Page!!!";
	}
	
	@GetMapping("/users")
	public List<Master.state_master.ThirdTest.enitity.Country_Model> getListModels() {
		
		return this.Country_service.getModels();
		
	}
	
	@PostMapping("/users")
	public Master.state_master.ThirdTest.enitity.Country_Model addModel(@RequestBody Master.state_master.ThirdTest.enitity.Country_Model countryModel) {
		return this.Country_service.addModel(countryModel);
	}
	

}
