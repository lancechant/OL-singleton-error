package com.example.demo.schedule;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class TestSchedule {

    @Schedule(minute = "*/5", hour = "*", persistent = false)//Doesn't matter if called more than once
    public void sendHeartbeat() {
        System.out.println("test");
    }
}
