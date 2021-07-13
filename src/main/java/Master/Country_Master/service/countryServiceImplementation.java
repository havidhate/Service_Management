package Master.state_master.ThirdTest.service;

import java.util.List;

import Master.state_master.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Master.state_master.service.service;

@Service
public class countryServiceImplementation implements service {
	
	@Autowired
	public Master.state_master.ThirdTest.Dao.Country_Dao countryDao;
	
	public countryServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Master.state_master.ThirdTest.enitity.Country_Model> getModels() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}

	@Override
	public Model addModel(Model model) {
		return null;
	}

	@Override
	public Master.state_master.ThirdTest.entity.Country_Model addModel(Master.state_master.ThirdTest.enitity.Country_Model countryModel) {
		// TODO Auto-generated method stub
		countryDao.save(countryModel);
		return countryModel;
	}

}
