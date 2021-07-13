package Master.district_master.service;

import java.util.List;

import Master.district_master.entity.DistrictModel;

public interface Service {

    public List<DistrictModel> getDistrictModels();
    public DistrictModel addDistrictModel(DistrictModel model);

}
