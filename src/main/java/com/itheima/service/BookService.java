package com.itheima.service;

import com.itheima.dao.Dept;
import com.itheima.dao.publicize;
import com.itheima.dao.report;
import com.itheima.dao.viduo;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    List<viduo> list4(int id);
    List<report> list2();
    List<Dept> list();

    List<publicize> list5(int id);
}
