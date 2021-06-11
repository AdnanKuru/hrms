package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utulities.DataResult;
import project.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/getByEmail")
    public DataResult<User> getByEmail(@RequestParam String email){
        return this.userService.getByEmail(email);
    }

    @GetMapping("/ifCheckInformation")
    public void ifCheckInformation(@RequestParam String email, @RequestParam String nationalId){
        this.userService.ifCheckInformation(email,nationalId);
    }

}
