package Master.district_master.controller;

import java.util.List;

import Master.district_master.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Master.district_master.entity.DistrictModel;

//Controller Class
@RestController
public class DistrictController {
    @Autowired
    private Service service;

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to Home Page!!!";
    }

    @GetMapping("/districtusers")
    public List<DistrictModel> getListModels() {
        return this.service.getDistrictModels();
    }

    @PostMapping("/districtusers/add")
    public DistrictModel addDistrictModel(@RequestBody DistrictModel model) {
        return this.service.addDistrictModel(model);
    }
}
