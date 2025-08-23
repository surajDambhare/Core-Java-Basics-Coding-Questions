package controlflow.patterns;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        //Question 1: Write a Java program to print right triangle star pattern (*) pattern of N rows.
        //*
        //**
        //***
        //****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

        //Question 2: Write a Java program to print hollow right triangle star pattern (*) pattern of N rows.
        //*
        //**
        //* *
        //*  *
        //*****

        for(int i = 1; i <= n; i++){
                if (i == 1 || i == n) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    for(int j = 1; j <= i; j++){
                        if(j == 1 || j == i){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();

                }
            }

         //OR
         for(int i = 1; i <= n; i++){
             for(int j = 1; j <= i; j++){
                 if(i == 1 || j == 1 || j == i || i == n){
                     System.out.print("*");
                 }else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        System.out.println("------------------------------------------");

         //Question 3: Write a Java program to print mirrored right triangle star pattern (*) pattern of N rows.
        //    *
        //   **
        //  ***
        // ****
        //*****
         int spaces = n - 1;

         for(int i = 1; i <= n; i++){
             for(int j = 1; j <= spaces; j++){
                 System.out.print(" ");
             }

             for(int k = 1; k <= i; k++){
                 System.out.print("*");
             }

             spaces--;
             System.out.println();
         }
        System.out.println("------------------------------------------");

         //Question 4: Write a Java program to print hollow mirrored right triangle star pattern (*) pattern of N rows.
        //    *
        //   **
        //  * *
        // *  *
        //*****

        int space = n;
        for(int i = 1; i <= n; i++){
            //for spaces
            for(int k = 1; k <= space; k++){
                System.out.print(" ");
            }

            //For Hollow triangle stars
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i || i == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            space--;
            System.out.println();
        }
        System.out.println("------------------------------------------");

        //Question 5: Write a Java program to print inverted right triangle star pattern (*) pattern of N rows.
        //*****
        //****
        //***
        //**
        //*
        int stars = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            stars--;
            System.out.println();
        }
    }
}
