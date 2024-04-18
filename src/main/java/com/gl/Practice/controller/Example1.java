package com.gl.Practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1 {

    @GetMapping("hello/{name}")
    public String getMessage(@PathVariable String name){
        return "Hello "+name;
    }
}
