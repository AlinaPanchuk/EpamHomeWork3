package com.Epam.company.HomeWork3.task2;

public class Task2 {
    public static void main(String[] args) {
        {
            int i = 0;
            int numberOfLines = 6;
            while (i < numberOfLines) {
                int j = i;
                while (j > 0) {
                    j--;
                    System.out.print(" ");
                }
                j = 0 ;
                while (j < numberOfLines -i) {
                    System.out.print("*");
                    j++;
                }
                i++;
                System.out.println(" ");
            }
        }
    }
}
