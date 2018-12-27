package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    private ConsecutiveNumbers consecutiveSeries = new ConsecutiveNumbers();

    @Test
    public void checkSeriesNotConsecutive () {
        assertEquals("Not a consecutive series",consecutiveSeries.consecutiveNumbers("56,54,53"));
    }
    @Test
    public void checkSeriesConsecutive () {
        assertNotSame("Not a consecutive series",consecutiveSeries.consecutiveNumbers("56,55,54"));
    }
    @Test
    public void checkSeriesConsecutive1 () {
        assertNotSame("consecutive series",consecutiveSeries.consecutiveNumbers("1,2,3,4,5,6,6"));
    }
    @Test
    public void checkSeriesConsecutive2 () {
        assertSame("Not a consecutive series",consecutiveSeries.consecutiveNumbers("1,2,3,4,5,6,6"));// for the failure of testcase
    }
}