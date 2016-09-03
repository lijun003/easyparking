package com.ifox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.ifox.domain.CarUpload;
import com.ifox.repository.CarUploadRepository;

public class DefaultCarUploadService implements CarUploadService {
    @Autowired
    private CarUploadRepository carUploadRepository;

    @Override
    public List<CarUpload> findByStatus(int status) {
        return carUploadRepository.findByStatus(status);
    }
}
