package com.ifox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.ifox.repository.CarUploadRepository;

@Service
public class DefaultScheduledService implements ScheduledService {
    @Autowired
    private CarUploadRepository carUploadRepository;

    @Scheduled(fixedDelay = 5000)
    @Override
    public void reportCurrentTime() {
    System.out.print(carUploadRepository.findByStatus(0).get(0).getPlate());
    }
}
