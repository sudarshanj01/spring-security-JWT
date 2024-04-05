package suadarshan.demo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suadarshan.demo.security.entity.User;
import suadarshan.demo.security.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return service.findAll();
    }
}
