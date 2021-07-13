package Master.state_master.controller;

import java.util.List;

import Master.state_master.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Master.state_master.entity.Model;

//Controller Class
@RestController
public class Controller {
	
	@Autowired
	private Master.state_master.service.service service;
	
	@GetMapping("/stateHome")
	public String home()
	{
		return "Welcome to Home Page!!!";
	}
	
	@GetMapping("/stateUsers")
	public List<Model> getListModels() {
		return this.service.getModels();
	}
	
	@PostMapping("/stateUsers")
	public Model addModel(@RequestBody Model model) {
		return this.service.addModel(model);
	}
	

}
