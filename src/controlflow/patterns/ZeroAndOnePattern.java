package controlflow.patterns;

import java.util.Scanner;

public class ZeroAndOnePattern {
    public static void main(String[] args) {
        //Question 1: Write a program to print 0s and 1s at alternate rows.
        //rows = 6
        //cols = 5
        //11111
        //00000
        //11111
        //00000
        //11111
        //00000

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the cols: ");
        int cols = sc.nextInt();


        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                if(i % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 2:
        //01010
        //01010
        //01010
        //01010
        //01010
        //01010

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                if(j % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 3:
        //11111
        //10001
        //10001
        //10001
        //10001
        //11111

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 4:
        //10101
        //01010
        //10101
        //01010
        //10101

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
              if(i % 2 == 1){
                  if(j % 2 == 1){
                      System.out.print("1");
                  }else{
                      System.out.print("0");
                  }
              }else{
                  if(j % 2 == 0){
                      System.out.print("1");
                  }else{
                      System.out.print("0");
                  }
              }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 5:
        //11011
        //11011
        //00000
        //11011
        //11011

        int mid = 0;
        if(rows % 2 == 0){
            mid = rows / 2;
        }else{
            mid = (rows + 1) / 2;
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i == mid || j == mid){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


        //Question 6:
        //10001
        //01010
        //00100
        //01010
        //10001

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(j == i || j == (cols + 1) - i){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 7:
        //01110
        //10001
        //10001
        //10001
        //01110

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if ((i == 1 || i == rows) && (j == 1 || j == cols)) {
                    System.out.print("0");
                }else
                if(i == 1|| i == rows || j == 1 || j == cols){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


    }
}
