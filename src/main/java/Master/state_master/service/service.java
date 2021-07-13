package Master.state_master.service;

import java.util.List;

import Master.state_master.entity.Model;

public interface service {
	
	public List<Model> getModels();
	public Model addModel(Model model);
	
}
