package com.ifox.service;

import static java.util.Arrays.asList;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.ifox.domain.CarUpload;
import com.ifox.repository.CarUploadRepository;

public class ScheduledServiceTest {

    @InjectMocks
    private DefaultScheduledService defaultScheduledService;

    @Mock
    private CarUploadRepository carUploadRepository;

    @Before
    public void setUp() {
        initMocks(this);
        when(carUploadRepository.findByStatus(0)).thenReturn(asList(new CarUpload(1111L, "川S99999", 0)));
    }

    @Test
    public void should_upload_car_info() throws IOException {
        defaultScheduledService.uploadCarInfo();
        verify(carUploadRepository).findByStatus(0);
        verify(carUploadRepository).save((CarUpload) anyObject());
    }
}
