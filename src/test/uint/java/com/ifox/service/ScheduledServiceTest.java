package com.ifox.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class ScheduledServiceTest {

    private ScheduledService scheduledService;

    @Test
    public void should_return_right_schedule_time() {
        scheduledService = mock(ScheduledService.class);
        scheduledService.reportCurrentTime();
        verify(scheduledService).reportCurrentTime();
    }

}