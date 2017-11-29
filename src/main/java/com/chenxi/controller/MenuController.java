package com.chenxi.controller;

import com.chenxi.empty.Menu;
import com.chenxi.empty.User;
import com.chenxi.service.MenuService;
import com.chenxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author chenxi
 * 菜单controller
 */
@Controller
@RequestMapping("/bgIndex")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @Autowired
    private UserService mUserService;

    @RequestMapping("/menu")
    public List<Menu> bgMenu(){
        List<Menu> menus=menuService.findAll();
        System.out.println("ssssss");
        return null;
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String toIndexJsp(@RequestParam String account, @RequestParam String password, Model model){
        User user=mUserService.login(account,password);
        if(user!=null){
            model.addAttribute("user",user);
            return "background/index";
        }else{
            model.addAttribute("error","账号或者密码错误！");
            return null;
        }
    }

    @RequestMapping("/login")
    public String toLoginJsp(){
        return "background/login";
    }

}
