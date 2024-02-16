package com.example.EventManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @GetMapping("/event")
    public String hello(){

        return "hi all welcome to the my events ";
    }

}
