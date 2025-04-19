package com.checkstyle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello app is class for test app
 */
@RestController
public class HelloApp{

    @GetMapping(
            path = "/hello-app"
    )
    public String helloApp() {
        return "check style app";
    }
}
