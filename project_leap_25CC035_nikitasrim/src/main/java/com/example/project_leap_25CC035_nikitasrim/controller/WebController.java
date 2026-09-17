package com.example.project_leap_25CC035_nikitasrim.controller;

import com.example.project_leap_25CC035_nikitasrim.services.WebService;
import com.example.project_leap_25CC035_nikitasrim.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @PostMapping("/data/write")
    String writeData(String text) {
        WebService webService = new WebServiceImpl();
        return webService.writeData(text);
    }

    @GetMapping("/data/get")
    String getData() {
        WebService webService = new WebServiceImpl();
        return webService.readData();
    }
}