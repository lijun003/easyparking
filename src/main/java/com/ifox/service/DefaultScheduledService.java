package com.ifox.service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
import com.ifox.domain.CarUpload;
import com.ifox.domain.Question;
import com.ifox.repository.CarUploadRepository;
import com.ifox.util.HttpUtil;

import okhttp3.Response;

@Service
public class DefaultScheduledService implements ScheduledService {
    private static final String URL = "http://www.ifox-lab.cn:8086/qas-service/questions";
    private static final int NOT_UPLOAD = 0;
    private static final int UPLOADED = 1;
    @Autowired
    private CarUploadRepository carUploadRepository;

    @Scheduled(fixedDelay = 5000)
    @Transactional
    @Override
    public void uploadCarInfo() throws IOException {
        List<CarUpload> carUploads;
        carUploads = carUploadRepository.findByStatus(NOT_UPLOAD);
        for (CarUpload carUpload : carUploads) {
            Response response = uploadInfo();
            updateStatus(carUpload, response);
        }
    }

    private void updateStatus(CarUpload carUpload, Response response) {
        if (response.isSuccessful()) {
            carUpload.setStatus(UPLOADED);
            carUploadRepository.save(carUpload);
        }
    }

    private Response uploadInfo() throws IOException {
        Question question = new Question (UUID.randomUUID().toString(), "string", "string");
        return HttpUtil.post(URL, JSON.toJSONString(question));
    }
}
