package com.stackroute.unittest.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void remVowel() {
        RemoveVowels remVowels=new RemoveVowels();
        assertEquals( "nd" ,remVowels.remVowel("india"));
        assertEquals("Grmny",remVowels.remVowel("Germany"));
    }

    @Test
    public void test1(){
        RemoveVowels Vowels=new RemoveVowels();
        assertEquals("mrc",Vowels.remVowel("america"));
        assertEquals("sa",Vowels.remVowel("asia"));// comparision failure expected s actual sa

    }

}