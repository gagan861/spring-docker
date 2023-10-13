package com.example.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping(path = "/gagan")
    public String myfunction()
    {
        return "hi this is gagan from spring boot";
    }
}
