package com.lgy.spring_test_member_std.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemDto {

    private String mem_uid;
    private String mem_pwd;
    private String mem_name;
}
