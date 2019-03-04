package com.Epam.company.HomeWork3.task4;

public class Task4 {
    public static void main(String[] args) {
        {
            int lines = 0;
            int numberOfLines = 5;
            while (lines < numberOfLines) {
                int rows = 0;
                while (rows < numberOfLines - lines) {
                    rows++;
                    System.out.print(" ");
                }
                rows = lines + 1;
                while (rows > 0) {
                    System.out.print("*");
                    rows--;
                }
                lines++;
                System.out.println(" ");
            }
        }
        {
            int lines = 0;
            int numberOfLines = 6;
            while (lines < numberOfLines) {
                int rows = lines;
                while (rows > 0) {
                    rows--;
                    System.out.print(" ");
                }
                rows = 0 ;
                while (rows < numberOfLines -lines) {
                    System.out.print("*");
                    rows++;
                }
                lines++;
                System.out.println(" ");
            }
        }
    }
}
