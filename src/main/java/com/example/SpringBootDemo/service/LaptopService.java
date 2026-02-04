package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.printf("service method calling");
    }
    public boolean isGoodForProgram(Laptop lap){
        return true;
    }
}
