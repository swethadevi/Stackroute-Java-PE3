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
    @Test
    public void Test1(){
        CalculateDateFormat calDate = new CalculateDateFormat();

        String result = calDate.formatDate();
        assertEquals("Wed 26/12/2018" + "Tue 01/01/2019",result);

    }

    @Test
    public void Test2(){
        CalculateDateFormat calDate = new CalculateDateFormat();

        String result = calDate.formatDate();
        assertEquals("Sat 29/12/2018" + "Fri 04/01/2019",result);

    }
}