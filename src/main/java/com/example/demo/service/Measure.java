package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Measure {
    public static ArrayList<Long> time = new ArrayList<>();

    public void add(Long t) {
        synchronized (this) {
            time.add(t);
            System.out.println(time.size());
        }
    }

    public long avg() {
        System.out.print("AVG : ");
        long total = 0;
        int cnt = time.size();
        if(cnt == 0) return 1;

        for(Long a : time){
            total += a.longValue();
        }
        return total / cnt;
    }
}
