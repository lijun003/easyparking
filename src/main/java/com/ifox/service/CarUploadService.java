package com.ifox.service;

import java.util.List;

import com.ifox.domain.CarUpload;

public interface CarUploadService {
    List<CarUpload> findByStatus(int status);
}
