package com.itheima.dao;


import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface BookDao {
    @Select("SELECT * FROM video WHERE id = #{id}")
    List<viduo>  findUserById(int id);
    @Select("select * from report")
    List<report> list2();

    @Select("select * from produce")
    List<Dept> list();
    @Select("SELECT * FROM publicize WHERE id = #{id}")
    List<publicize>  findUserById2(int id);
}
