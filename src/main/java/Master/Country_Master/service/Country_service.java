package Master.Country_Master.service;

import Master.Country_Master.entity.Country_Model;;

import java.util.List;

public interface Country_service {
	
	List<Country_Model> getCountryModels();
	Country_Model addCountryModel(Country_Model countryModel);
	
}
