package Master.state_master.service;

import java.util.List;

import Master.state_master.entity.State_Model;

public interface service {
	
	public List<State_Model> getModels();
	public State_Model addModel(State_Model stateModel);
	
}
