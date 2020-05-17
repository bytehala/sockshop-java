package io.bytehala.catalogue.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tags")
public class TagController {

    @GetMapping
    public String test() {
        return "What";
    }

}
