package Master.state_master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Master.state_master.entity.State_Model;

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
	public List<State_Model> getListModels() {
		return this.service.getModels();
	}
	
	@PostMapping("/stateUsers")
	public State_Model addModel(@RequestBody State_Model stateModel) {
		return this.service.addModel(stateModel);
	}
	

}
