package com.ifox.service;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

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
        assertThat(scheduledService.reportCurrentTime(), is(new Date()));
    }
}
