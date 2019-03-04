package com.Epam.company.HomeWork3.task3;

public class Task3 {
    public static void main(String[] args) {
        {
            int i = 0;
            int numberOfLines = 6;
            while (i < numberOfLines) {
                int j = 0;
                while (j < numberOfLines - i) {
                    j++;
                    System.out.print(" ");
                }
                j = i + 1;
                while (j > 0) {
                    System.out.print("*");
                    j--;
                }
                i++;
                System.out.println(" ");
            }
        }

    }
}
