package com.chenxi.service;

import com.chenxi.dao.MenuDao;
import com.chenxi.empty.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxi
 * 菜单service
 */
@Service
public class MenuService implements MenuDao {
    @Autowired
    private MenuDao menuDao;

    public List<Menu> findAll() {
        return menuDao.findAll();
    }

    public Menu findByStr(String str) {
        return menuDao.findByStr(str);
    }

    public Menu findById(int id) {
        return menuDao.findById(id);
    }
}
