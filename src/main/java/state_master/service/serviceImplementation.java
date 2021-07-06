package state_master.ThirdTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import state_master.ThirdTest.Dao.Dao;
import state_master.ThirdTest.enitity.Model;

@Service
public class serviceImplementation implements service {
	
	@Autowired
	public Dao dao;
	
	public serviceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Model> getModels() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Model addModel(Model model) {
		// TODO Auto-generated method stub
		dao.save(model);
		return model;
	}

}
