package Master.district_master.service;

import java.util.List;

import Master.district_master.entity.DistrictModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Master.district_master.Dao.Dao;

@Service
public class ServiceImplementation implements Master.district_master.service.Service {
    @Autowired
    public Dao dao;

    public ServiceImplementation() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<DistrictModel> getDistrictModels() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }

    @Override
    public DistrictModel addDistrictModel(DistrictModel model) {
        // TODO Auto-generated method stub
        dao.save(model);
        return model;
    }

}
