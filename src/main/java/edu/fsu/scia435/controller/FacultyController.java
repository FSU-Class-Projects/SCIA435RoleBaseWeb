package edu.fsu.scia435.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacultyController {

    @GetMapping(value = "/faculty")
    public String index(){
        return "faculty";
    }
}
