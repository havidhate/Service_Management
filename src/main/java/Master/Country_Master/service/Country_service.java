package Master.Country_Master.service;

import Master.Country_Model;

import java.util.List;

public interface Country_service {
	
	public List<Country_Model> getCountryModels();
	public Country_Model addCountryModel(Country_Model countryModel);
	
}
