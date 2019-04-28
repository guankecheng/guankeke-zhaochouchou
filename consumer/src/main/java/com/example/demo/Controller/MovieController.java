package com.example.demo.Controller;


import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8080/" + id, User.class);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findById1(){
        return this.restTemplate.getForObject("http://localhost:8080/1" , User.class);
    }
}
