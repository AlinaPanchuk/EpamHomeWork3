package com.Epam.company.HomeWork3.task2;

public class Task2 {
    public static void main(String[] args) {
        {
            int line = 0;
            int numberOfLines = 6;
            while (line < numberOfLines) {
                int rows = line;
                while (rows > 0) {
                    rows--;
                    System.out.print(" ");
                }
                rows = 0 ;
                while (rows < numberOfLines -line) {
                    System.out.print("*");
                    rows++;
                }
                line++;
                System.out.println(" ");
            }
        }
    }
}
