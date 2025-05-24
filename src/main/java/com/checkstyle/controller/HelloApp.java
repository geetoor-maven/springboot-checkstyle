package com.checkstyle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloApp adalah kelas controller yang digunakan untuk menguji aplikasi.
 */
@RestController
public class HelloApp {


    @GetMapping(path = "/hello-app")
    public String helloApp() {
        return "check style app";
    }

}