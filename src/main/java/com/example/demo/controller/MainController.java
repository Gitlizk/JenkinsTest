package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lizk
 * @company 誉典
 * @create 2020-10-27 17:32
 */

@RestController
public class MainController {

    @ResponseBody
    @RequestMapping("/index")
    public String welcome(String args){
        return "WelCome, I'm " + args;
    }
}
