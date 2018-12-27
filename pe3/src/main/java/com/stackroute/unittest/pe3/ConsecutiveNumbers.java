package com.stackroute.unittest.pe3;

import java.util.*;
/*
        Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
    assume the digits are a ​ string​ and use split()
    Input: 98,96,95,94,93
    Output: 98,96,95,94,93 non consecutive numbers
    Input: 54,53,52,51,50,49,48
    Output : 54,53,52,51,50,49,48 are consecutive numbers
    Input: 1,2,3,4,5,6,6
    Output: 1,2,3,4,5,6,6 non consecutive numbers
 */
public class ConsecutiveNumbers {

    public String consecutiveNumbers (String series) {
        String[] numberSeries = series.split(",");
        int[] numberInt = new int[numberSeries.length];
        for (int i=0; i<numberSeries.length; i++) {
            numberInt[i] = Integer.parseInt(numberSeries[i].trim());
        }
        //return "Consecutive series";

        for (int i=0; i<numberSeries.length-2; i++) {
            if ((numberInt[i]-numberInt[i+1]==-1)||(numberInt[i]-numberInt[i+1]==1))
                return "Consecutive series";

        }

        return "not a consecutive series";
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the series");
        String series = scanner.next();
        ConsecutiveNumbers consecNumbers = new ConsecutiveNumbers();
        String res = consecNumbers.consecutiveNumbers(series);
        System.out.println(res);
    }
}