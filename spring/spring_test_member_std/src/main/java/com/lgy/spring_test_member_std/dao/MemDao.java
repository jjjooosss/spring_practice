package com.lgy.spring_test_member_std.dao;

import com.lgy.spring_test_member_std.dto.MemDto;

import java.util.ArrayList;
import java.util.HashMap;

public interface MemDao {
    ArrayList<MemDto> loginOk(HashMap<String, String> param);
    void register(HashMap<String, String> param);
}
