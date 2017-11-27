package com.chenxi.dao;

import java.util.List;

public interface BaseDao<T> {
    List<T> findAll();
    T findByStr(String str);
    T findById(int id);
}
