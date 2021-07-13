package Master.district_master.DistrictController;

import java.util.List;

import Master.district_master.DistrictService.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Master.district_master.DistrictEntity.DistrictModel;

//Controller Class
@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to Home Page!!!";
    }

    @GetMapping("/districtusers")
    public List<DistrictModel> getListModels() {
        return this.districtService.getDistrictModels();
    }

    @PostMapping("/districtusers/add")
    public DistrictModel addDistrictModel(@RequestBody DistrictModel model) {
        return this.districtService.addDistrictModel(model);
    }
}
