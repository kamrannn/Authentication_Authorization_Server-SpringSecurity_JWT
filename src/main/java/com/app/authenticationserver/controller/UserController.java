package com.app.authenticationserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return new ResponseEntity<>("User API is accessible by admin, and user both", HttpStatus.OK);
    }
}
