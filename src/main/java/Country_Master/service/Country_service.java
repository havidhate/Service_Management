package state_master.ThirdTest.service;

import java.util.List;

public interface Country_service {
	
	public List<state_master.ThirdTest.enitity.Country_Model> getModels();
	public state_master.ThirdTest.enitity.Country_Model addModel(state_master.ThirdTest.enitity.Country_Model countryModel);
	
}
