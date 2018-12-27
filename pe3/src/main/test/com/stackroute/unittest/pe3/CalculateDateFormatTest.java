package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateFormatTest {

    @Test
    public void Test() {


        CalculateDateFormat calDate = new CalculateDateFormat();

        String result = calDate.formatDate();
        assertEquals("Mon 24/12/2018" + "Sun 30/12/2018",result);

    }
}