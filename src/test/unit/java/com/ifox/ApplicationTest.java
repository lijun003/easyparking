package com.ifox;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.ifox.domain.CarUpload;
import com.ifox.repository.CarUploadRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(PosApplication.class)
@WebAppConfiguration
public class ApplicationTest {
    @Autowired
    private CarUploadRepository carUploadRepository;

    @Before
    public void setUp() {
        CarUpload carUpload = new CarUpload();
        carUpload.setpId(111L);
        carUpload.setStatus(0);
        carUpload.setPlate("AAA");
        carUploadRepository.save(carUpload);
    }

    @Test
    public void should_find_plate_with_cache() {
        CarUpload carUpload = carUploadRepository.findOne(111L);
        CarUpload carUpload1 = carUploadRepository.findOne(111L);
        assertThat(carUpload == carUpload, is(true));


    }
}
