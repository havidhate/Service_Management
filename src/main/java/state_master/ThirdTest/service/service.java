package state_master.ThirdTest.service;

import java.util.List;

import state_master.ThirdTest.enitity.Model;

public interface service {
	
	public List<Model> getModels();
	public Model addModel(Model model);
	
}
