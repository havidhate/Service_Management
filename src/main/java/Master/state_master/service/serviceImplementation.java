package Master.state_master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Master.state_master.Dao.Dao;
import Master.state_master.entity.State_Model;

@Service
public class serviceImplementation implements service {
	
	@Autowired
	public Dao dao;
	
	public serviceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<State_Model> getModels() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public State_Model addModel(State_Model stateModel) {
		// TODO Auto-generated method stub
		dao.save(stateModel);
		return stateModel;
	}

}
