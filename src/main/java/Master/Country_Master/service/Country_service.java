package Master.state_master.ThirdTest.service;

import java.util.List;

public interface Country_service {
	
	public List<Master.state_master.ThirdTest.enitity.Country_Model> getModels();
	public Master.state_master.ThirdTest.enitity.Country_Model addModel(Master.state_master.ThirdTest.enitity.Country_Model countryModel);
	
}
