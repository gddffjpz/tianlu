package com.itheima.controller;


import com.itheima.dao.*;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/report")
    public Result list2() {

        List<report> reportList = bookService.list2();
        return Result.success(reportList);
    }
    @GetMapping("/produce")
    public Result list() {
        List<Dept> deptList = bookService.list();
        return Result.success(deptList);
    }
    @GetMapping("/video")
    public Result findUserById(@RequestBody Map<String, Object> params) {
        Long id = Long.valueOf(params.get("id").toString());
        List<viduo> entity = bookService.list4(Math.toIntExact(id));
        return Result.success(entity);
    }
    @GetMapping("/publicize")
    public Result findUserById2(@RequestBody Map<String, Object> params) {
        Long id = Long.valueOf(params.get("id").toString());
        List<publicize> entity = bookService.list5(Math.toIntExact(id));
        return Result.success(entity);
    }


}
