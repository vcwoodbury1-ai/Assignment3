package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello, my name is Campbell Woodbury!!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/movie")
    public String getFavoriteMovie() {
        return "My favorite movie is Harry Potter";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/music")
    public String getFavoriteMusic() {
        return "My favorite music is folk music";
    }

}






