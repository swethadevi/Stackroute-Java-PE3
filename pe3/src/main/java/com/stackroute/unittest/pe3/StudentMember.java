package com.stackroute.unittest.pe3;

import java.io.*;
import java.util.*;

/*
        Create a class called StudentMarks, which prompts user for the number of students, reads it
    from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
    grades of each of the students and saves them in an int array called stuGrades. Your program shall
    check that the grade is between 0 and 100 else has to trow an error message.
*/

public class StudentMember {
    public void studentMarks () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of Students : ");
        int numOfStudents = scanner.nextInt();
        int[] stuGrades = new int[numOfStudents];

        for (int i = 0; i < stuGrades.length; i++) {
            System.out.println("Enter grade of Student " + (i + 1));
            stuGrades[i] = scanner.nextInt();
            try{
                if (!(stuGrades[i] >= 0 && stuGrades[i] <= 100)) {
                    System.out.println("Error..! Grades should be between 0 and 100");
                    break;
                }
            }
            catch (Exception e)
            {
                throw new IOError(e);
            }


        }
    }
    public static void main (String args[]) {
        StudentMember stuMarks = new StudentMember();
        stuMarks.studentMarks();
    }
}