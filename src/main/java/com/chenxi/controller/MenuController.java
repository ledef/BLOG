package com.chenxi.controller;

import com.chenxi.empty.Menu;
import com.chenxi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/menu")
    public List<Menu> bgMenu(){
        List<Menu> menus=menuService.findAll();
        System.out.println("ssssss");
        return null;
    }

}
