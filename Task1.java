package com.Epam.company.HomeWork3;

public class Task1 {
    public static void main(String[] args) {
        {
            int line = 0, numberOfLines = 5;
            while (line < numberOfLines) {
                int value = line;
                while (value >= 0) {
                    System.out.print("* ");
                    value--;
                }
                line++;
                System.out.println();
            }
        }
        {
            int line = 0, numberOfLines = 4, value;
            while (line < numberOfLines) {
                value = numberOfLines - line;
                int j = 0;
                while (j < value) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                line++;
            }
        }
    }
}