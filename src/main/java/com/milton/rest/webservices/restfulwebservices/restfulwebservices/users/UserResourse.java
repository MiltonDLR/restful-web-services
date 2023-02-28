package com.milton.rest.webservices.restfulwebservices.restfulwebservices.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResourse {

    private UserDaoService service;

    public UserResourse(UserDaoService service) {
        this.service = service;
    }

    //GET /users
    @GetMapping("/users")
    public List<User> retroveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retroveUser(@PathVariable int id){
        return service.findOne(id);

    }
}
