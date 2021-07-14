package Master.district_master.controller;

import Master.district_master.entity.DistrictModel;
import Master.district_master.repository.DistrictModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping(path="/district_master")
public class DistrictController     {
    @Autowired
    private DistrictModelRepository modelRepository;

    @PostMapping(value="saveModel")
    public ResponseEntity<?> saveModel(@RequestBody DistrictModel model) {
        modelRepository.save(model);
        return new ResponseEntity<>("model saved", HttpStatus.OK);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<DistrictModel> getAllModels() {
        return modelRepository.findAll();
    }

    @GetMapping(path="/all/{id}")
    public @ResponseBody Iterable<DistrictModel> getModelById(@PathVariable("id") List<Integer> id) {
        return  modelRepository.findAllById(id);
    }
}
