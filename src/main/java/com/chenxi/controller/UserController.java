package com.chenxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenxi 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String welcomeIndex(){
        System.out.println("------------------------");
        return "index";
    }

}
