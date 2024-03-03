package com.itheima.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class publicize {
    private int id;//总记录数
    private String url;//数据列表
    private String thumbnail;
    private String title;
    private String escription;
}

