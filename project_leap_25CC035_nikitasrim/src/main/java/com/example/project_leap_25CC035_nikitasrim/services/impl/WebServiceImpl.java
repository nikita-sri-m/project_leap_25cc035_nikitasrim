package com.example.project_leap_25CC035_nikitasrim.services.impl;

import com.example.project_leap_25CC035_nikitasrim.repository.WebRepository;
import com.example.project_leap_25CC035_nikitasrim.repository.impl.WebRepositoryImpl;
import com.example.project_leap_25CC035_nikitasrim.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WebServiceImpl implements WebService {
    @Override
    public String writeData(String text) {
        WebRepository webRepository = new WebRepositoryImpl();
        return webRepository.writeData(text);
    }

    @Override
    public String readData() {
        WebRepository webRepository = new WebRepositoryImpl();
        return webRepository.readData();
    }
}