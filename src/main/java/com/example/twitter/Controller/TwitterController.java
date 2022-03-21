package com.example.twitter.Controller;

import com.example.twitter.Repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

import com.example.twitter.Model.User;
import com.example.twitter.Repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/twitter")
public class TwitterController{


    @Autowired
    private TwitterRepository repository;


    @PostMapping("/placedOrderNow")
    public String placeOrder(@RequestBody User user) {
        repository.save(user);
        return "Se guardo correctamente";
    }


    @GetMapping("/getUserByName/{name}")
    public List<User> getUserbyName(@PathVariable String name) {
        return repository.findByName(name);
    }

    @GetMapping("/getUserByUsername/{username}")
    public List<User> getUserbyUsername(@PathVariable String username) {
        return repository.findByUsername(username);
    }
    // @GetMapping("/getUserByAddress/{city}")
    // public List<User> getUserbyAddress(@PathVariable String city) {
    //     return repository.findByCity(city);
    // }
    //@GetMapping("/getUserByFollowers/{iduser}")
    // public List<User> getUserbyFollower(@PathVariable String iduser) {
     //   return repository.findByFollow(iduser);
    //}

    /* @GetMapping("/getUserByFollower/{iduser}")
     public List<User>getUserbyFollower(@PathVariable int iduser) {
         return repository.abc(iduser);
     }*/

    @GetMapping
    public List<User> getUsers(){
        return repository.findAll();
    }
}

