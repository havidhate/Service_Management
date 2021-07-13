package district_master.controller;

import district_master.entity.Model;
import district_master.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller // This means that this class is a Controller
@RequestMapping(path="/serviceManagement/district_master") // This means URL's start with /demo (after Application path)
public class district_controller {
    @Autowired // This means to get the bean called userRepository
    private ModelRepository modelRepository;

    @PostMapping(value="saveModel")
    public ResponseEntity<?> saveModel(@RequestBody Model model) {
        modelRepository.save(model);
        return new ResponseEntity<>("model saved", HttpStatus.OK);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Model> getAllModels() {
        // This returns a JSON or XML with the users
        return modelRepository.findAll();
    }

    @GetMapping(path="/all/{id}")
    public @ResponseBody Iterable<Model> getModelById(@PathVariable("id") List<Integer> id) {
        return  modelRepository.findAllById(id);
    }
}
