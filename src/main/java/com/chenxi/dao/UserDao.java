package com.chenxi.dao;

import com.chenxi.empty.User;

/**
 * @author chenxi
 * 用户接口
 */
public interface UserDao extends BaseDao<User>{
    User login(String account,String password);
}
