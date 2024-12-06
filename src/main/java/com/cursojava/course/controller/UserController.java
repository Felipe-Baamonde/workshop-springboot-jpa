package com.cursojava.course.controller;

import com.cursojava.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public ResponseEntity<User> buscarTodos(){
        User user = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }

}
