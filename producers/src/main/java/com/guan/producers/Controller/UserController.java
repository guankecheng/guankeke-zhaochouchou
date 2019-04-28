package com.guan.producers.Controller;

import com.guan.producers.dao.UserRepository;
import com.guan.producers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Long id){
        User user = this.userRepository.findById(id).orElse(null);
        return user;
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public User findById1(@PathVariable Long id){
        User user = this.userRepository.findById(id).orElse(null);
        return user;
    }


}
