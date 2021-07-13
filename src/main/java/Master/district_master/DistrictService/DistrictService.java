package Master.district_master.DistrictService;

import java.util.List;

import Master.district_master.DistrictEntity.DistrictModel;

public interface DistrictService {

    public List<DistrictModel> getDistrictModels();
    public DistrictModel addDistrictModel(DistrictModel model);

}
