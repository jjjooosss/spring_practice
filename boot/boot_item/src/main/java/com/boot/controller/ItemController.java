package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.dto.ItemDto;
import com.boot.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ItemController {

    @Autowired
    private ItemService service;

    @RequestMapping("/list")
    public String list(Model model) {
        log.info("@# list");
        ArrayList<ItemDto> list = service.list();
        model.addAttribute("list",list);

        return "content_view";
    }

    @RequestMapping("/write")
    public String writeResult(@RequestParam HashMap<String, String> param) {
        log.info("@# writeResult");
        service.write(param);
        return "writeResult";
    }
    @RequestMapping("/writeOk")
    public String write() {
        log.info("@# write");

        return "itemWrite";
    }
}