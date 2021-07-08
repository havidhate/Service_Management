package state_master.ThirdTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import state_master.ThirdTest.enitity.Model;
import state_master.ThirdTest.service.service;

//Controller Class
@RestController
public class Controller {
	
	@Autowired
	private service service;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Home Page!!!";
	}
	
	@GetMapping("/users")
	public List<Model> getListModels() {
		
		return this.service.getModels();
		
	}
	
	@PostMapping("/users")
	public Model addModel(@RequestBody Model model) {
		return this.service.addModel(model);
	}
	

}
