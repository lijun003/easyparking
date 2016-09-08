package com.ifox.service;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.ifox.domain.CarUpload;
import com.ifox.exception.NotFoundException;
import com.ifox.repository.CarUploadRepository;

public class DefaultCarUploadServiceTest {
    @InjectMocks
    private DefaultCarUploadService carUploadService;

    @Mock
    private CarUploadRepository carUploadRepository;

    @Before
    public void setUp() {
        initMocks(this);

    }

    @Test
    public void should_find_right_carUpload() {
        when(carUploadRepository.findByStatus(0)).thenReturn(asList(new CarUpload(1111, "川S88888", 0)));
        assertThat(carUploadService.findByStatus(0).size(), is(1));
        assertThat(carUploadService.findByStatus(0).get(0).getpId(), is(1111L));

    }

    @Test(expected = NotFoundException.class)
    public void should_throw_right_exception() {
        when(carUploadRepository.findByStatus(1)).thenReturn(null);
        carUploadService.findByStatus(1);
    }

}
