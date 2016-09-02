package com.ifox.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DefaultScheduledService implements ScheduledService {
    @Scheduled(fixedDelay = 5000)
    @Override
    public Date reportCurrentTime() {
        return new Date();
    }
}
