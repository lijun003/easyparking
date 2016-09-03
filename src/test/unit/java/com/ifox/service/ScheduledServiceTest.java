package com.ifox.service;

import org.junit.Before;
import org.junit.Test;

public class ScheduledServiceTest {

    private ScheduledService scheduledService;

    @Before
    public void setUp() {
        scheduledService = new DefaultScheduledService();
    }

    @Test
    public void should_return_right_schedule_time() {
        scheduledService.reportCurrentTime();
    }
}
