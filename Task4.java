package com.Epam.company.HomeWork3.task4;

public class Task4 {
    public static void main(String[] args) {
        {
            int i = 0;
            int numberOfLines = 5;
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
