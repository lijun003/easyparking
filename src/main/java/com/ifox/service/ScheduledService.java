package com.ifox.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Scheduled(fixedDelay = 5000)
    public Date reportCurrentTime() {
        return new Date();
    }
}
