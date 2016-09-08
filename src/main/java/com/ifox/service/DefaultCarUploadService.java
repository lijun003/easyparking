package com.ifox.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifox.domain.CarUpload;
import com.ifox.exception.NotFoundException;
import com.ifox.repository.CarUploadRepository;

@Service
public class DefaultCarUploadService implements CarUploadService {
    @Autowired
    private CarUploadRepository carUploadRepository;

    @Override
    public List<CarUpload> findByStatus(int status) {
        List<CarUpload> carUploads = carUploadRepository.findByStatus(status);
        Optional.ofNullable(carUploads).orElseThrow(()->new NotFoundException("carUploads is not found"));
        return carUploads;
    }
}
