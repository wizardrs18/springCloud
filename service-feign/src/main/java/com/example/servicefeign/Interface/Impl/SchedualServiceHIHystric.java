package com.example.servicefeign.Interface.Impl;

import com.example.servicefeign.Interface.SchedualServiceHI;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class SchedualServiceHIHystric implements SchedualServiceHI {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name){
        return name+",  sorry,error";
    };
}
