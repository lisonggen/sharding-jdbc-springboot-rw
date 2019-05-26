package com.lisg.rw.controller;

import com.lisg.rw.entity.User;
import com.lisg.rw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sharding-jdbc-rw
 * @description: UserController
 * @author: Reagan Li
 * @create: 2019-05-25 22:26
 **/
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("save")
    public void save(){
        User user = new User();
        user.setId(100L);
        user.setName("dalaoyang");
        user.setCity("beijing");
        userRepository.save(user);
    }

    @GetMapping("getAll")
    public Object getAll(){
        return userRepository.findAll();
    }
}
