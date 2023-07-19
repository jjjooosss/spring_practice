package com.lgy.spring_join.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptDto {
    private int deptno;
    private String dname;
    private String loc;
}
