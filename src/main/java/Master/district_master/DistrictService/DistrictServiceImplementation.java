package Master.district_master.DistrictService;

import java.util.List;

import Master.district_master.DistrictEntity.DistrictModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Master.district_master.DistrictDao.DistrictDao;

@Service()
public class DistrictServiceImplementation implements DistrictService {

    @Autowired
    public DistrictDao districtDao;

    public DistrictServiceImplementation() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<DistrictModel> getDistrictModels() {
        // TODO Auto-generated method stub
        return districtDao.findAll();
    }

    @Override
    public DistrictModel addDistrictModel(DistrictModel model) {
        // TODO Auto-generated method stub
        districtDao.save(model);
        return model;
    }

}
