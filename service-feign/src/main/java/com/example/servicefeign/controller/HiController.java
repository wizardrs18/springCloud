package com.example.servicefeign.controller;

import com.example.servicefeign.Interface.SchedualServiceHI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHI schedualServiceHI;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiController(@RequestParam String name){
        return schedualServiceHI.sayHiFromClientOne(name);
    }
}
