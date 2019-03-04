package com.Epam.company.HomeWork3.task5;

public class Task5 {
    public static void main(String[] args) {
        {
            int count = 2, numberOfTriangle = 0;
            while (numberOfTriangle < count) {
                int lines = 0;
                int numberOfLines = 6;
                while (lines < numberOfLines) {
                    int colums = 0;
                    while (colums < numberOfLines - lines - 1) {
                        colums++;
                        System.out.print(" ");
                    }
                    colums = lines + 1;
                    while (colums > 0) {
                        System.out.print("* ");
                        colums--;
                    }
                    lines++;
                    System.out.println(" ");
                }
                numberOfTriangle++;
            }
        }
    }
}