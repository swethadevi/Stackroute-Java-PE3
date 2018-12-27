package com.stackroute.unittest.pe3;

import java.util.Scanner;
/*
        Write a program to compute the addition of two matrix, Read the number of rows and columns
    as input, also the values of each matrix
    Output:
    Input number of rows of matrix: 3
    Input number of columns of matrix: 2
    Input elements of first matrix: 1 2 3 4 5 6
    Input the elements of second matrix: 9 8 7 6 5 4
    Sum of the matrices:-
    10
    10
    10
    10
    10
    10
 */

public class AddTwoMatrix {
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n  = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        //to loop through the array to enter the elements of 1st matrix
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");
        //to loop through the array to enter the elements of 2nd matrix
        for (c = 0 ; c < m ; c++)
            for (d = 0 ; d < n ; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");
        //to sum up the elements of the two matrices
        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}
