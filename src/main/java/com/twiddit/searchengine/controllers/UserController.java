package com.twiddit.searchengine.controllers;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.entities.User;
import com.twiddit.searchengine.services.TwidditService;
import com.twiddit.searchengine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping
    private ResponseEntity<List<User>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @PostMapping
    private ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(user));
    }

    @GetMapping("findByText/{text}")
    private ResponseEntity<List<User>> findByText(@PathVariable String text){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

}
