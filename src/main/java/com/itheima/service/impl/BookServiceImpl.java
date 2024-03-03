package com.itheima.service.impl;

import com.itheima.dao.*;

import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public List<viduo> list4(int id) {
        return bookDao.findUserById(id);
    }

    @Override
    public List<report> list2() {
        return bookDao.list2();
    }
    @Override
    public List<Dept> list() {
        return bookDao.list();
    }
    @Override
    public List<publicize> list5(int id) {
        return bookDao.findUserById2(id);
    }



}
