package Master.Country_Master.service;

import java.util.List;

import Master.Country_Master.Dao.Country_Dao;
import Master.Country_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Master.state_master.service.service;

@Service
public class countryServiceImplementation implements Country_service {
	
	@Autowired
	public Country_Dao countryDao;
	
	public countryServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Country_Model> getCountryModels() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}


	@Override
	public Country_Model addCountryModel(Country_Model countryModel) {
		// TODO Auto-generated method stub
		countryDao.save(countryModel);
		return countryModel;
	}

}
