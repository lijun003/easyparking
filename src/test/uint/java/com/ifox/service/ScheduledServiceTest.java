package com.ifox.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;

public class ScheduledServiceTest {

    private ScheduledService scheduledService;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void should_return_right_schedule_time() {
        scheduledService = mock(ScheduledService.class);
        scheduledService.reportCurrentTime();
        verify(scheduledService).reportCurrentTime();
    }

}