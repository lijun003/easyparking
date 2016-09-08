package com.ifox.repository;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import com.ifox.domain.CarUpload;

@CacheConfig(cacheNames = "carUploads")
public interface CarUploadRepository extends CrudRepository<CarUpload, Long> {
   @Cacheable
   CarUpload findOne(Long pId);

   List<CarUpload > findByStatus(int status);
}
