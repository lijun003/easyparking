package com.ifox.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.ifox.domain.CarUpload;

public interface CarUploadRepository extends CrudRepository<CarUpload, Long> {
   List<CarUpload > findByStatus(int status);
}
