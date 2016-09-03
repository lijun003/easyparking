package com.ifox.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DefaultScheduledService implements ScheduledService {
    @Scheduled(fixedDelay = 5000)
    @Override
    public void reportCurrentTime() {
    }
}
