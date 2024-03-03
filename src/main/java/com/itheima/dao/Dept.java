package com.itheima.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer id;
    private String start1;
    private String start2;
    private String start3;
    private String end1;
    private String end2;
    private String end3;
    private String abnormal;
   }