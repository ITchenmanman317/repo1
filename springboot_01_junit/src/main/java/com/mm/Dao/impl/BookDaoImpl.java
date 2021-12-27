package com.mm.Dao.impl;

import com.mm.Dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("我深爱着小卢");
    }
}
