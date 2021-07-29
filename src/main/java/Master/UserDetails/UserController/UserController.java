package Master.UserDetails.UserController;

import Master.UserDetails.UserEntity.UserEntity;
import Master.UserDetails.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/loginUser")
    public List<UserEntity> getDetails() {
        return this.userService.getDetails();
    }


    @PostMapping("/registerUser")
    public UserEntity postDetails(@RequestBody UserEntity userEntity)
    {
        return this.userService.postDetails(userEntity);
    }


}



