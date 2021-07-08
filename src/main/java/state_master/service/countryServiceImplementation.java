package state_master.ThirdTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countryServiceImplementation implements service {
	
	@Autowired
	public state_master.ThirdTest.Dao.Country_Dao countryDao;
	
	public countryServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<state_master.ThirdTest.enitity.Country_Model> getModels() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}

	@Override
	public state_master.ThirdTest.enitity.Country_Model addModel(state_master.ThirdTest.enitity.Country_Model countryModel) {
		// TODO Auto-generated method stub
		countryDao.save(countryModel);
		return countryModel;
	}

}
