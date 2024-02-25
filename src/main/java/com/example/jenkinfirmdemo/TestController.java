package com.example.jenkinfirmdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        return "Jenkin First Demo is successfully Implemented :: Commit :: 1";
    }
}
