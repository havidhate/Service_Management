package Master.tahsil_master.controller;

import Master.tahsil_master.entity.TahsilModel;
import Master.tahsil_master.repository.TahsilModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping(path="/tahsil_master")
public class TahsilController     {
    @Autowired
    private TahsilModelRepository modelRepository;

    @PostMapping(value="saveModel")
    public ResponseEntity<?> saveModel(@RequestBody TahsilModel model) {
        modelRepository.save(model);
        return new ResponseEntity<>("model saved", HttpStatus.OK);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<TahsilModel> getAllModels() {
        return modelRepository.findAll();
    }

    @GetMapping(path="/all/{id}")
    public @ResponseBody Iterable<TahsilModel> getModelById(@PathVariable("id") List<Integer> id) {
        return  modelRepository.findAllById(id);
    }
}
