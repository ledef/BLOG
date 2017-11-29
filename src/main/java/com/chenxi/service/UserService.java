package com.chenxi.service;

import com.chenxi.dao.UserDao;
import com.chenxi.empty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxi 用户service
 */
@Service
public class UserService implements UserDao{

    @Autowired
    private UserDao mUserDao;

    public User login(String account, String pwd) {
        return mUserDao.login(account,pwd);
    }

    public List<User> findAll() {
        return mUserDao.findAll();
    }

    public User findByStr(String str) {
        return mUserDao.findByStr(str);
    }

    public User findById(int id) {
        return mUserDao.findById(id);
    }
}
