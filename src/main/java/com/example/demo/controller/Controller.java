package com.example.demo.controller;

import com.example.demo.mapper.Mapper;
import com.example.demo.service.Measure;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RequiredArgsConstructor
@RestController
public class Controller {
    private final Measure measure;
    private final Mapper mapper;
    private long startTime = 0;

    @GetMapping("/")
    int home() {
        startTime = System.nanoTime();
        mapper.select();
        measure.add(System.nanoTime() - startTime);
        return 1;
    }

    @GetMapping("/print")
    long home3() {
        return 1;
    }

    @GetMapping("/avg")
    long home2() {
        return measure.avg();
    }


}
