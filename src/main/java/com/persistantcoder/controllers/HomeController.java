package com.persistantcoder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Evans K F C on May ,2020
 **/

@Controller
public class HomeController {

@GetMapping("/home")
    public String goHome(){
    System.out.println("In Home Controller");

    return "index";
}


}
