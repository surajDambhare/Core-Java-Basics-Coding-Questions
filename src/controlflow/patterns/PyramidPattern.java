package controlflow.patterns;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {

        // Question 1: Write a Java program to print Pyramid star( equilateral triangle ) pattern of N rows.
        //    *
        //   ***
        //  *****
        // *******
        //*********

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int spaces = n - 1;
        for(int i = 1; i <= n; i++){
            //For Spaces
            for(int j = 1; j<= spaces; j++){
                System.out.print(" ");
            }

            //For stars
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }

            spaces--;
            System.out.println();
        }

        System.out.println("-------------------------------------------");

        //Question 2: Write a Java program to print hollow pyramid star pattern (*) pattern of N rows.
        //    *
        //   * *
        //  *   *
        // *     *
        //*********

        int space = n - 1;
        for(int i = 1; i <= n; i++){
            //For Spaces
            for(int j = 1; j<= space; j++){
                System.out.print(" ");
            }

            //For stars
            for(int k = 1; k <= 2 * i - 1; k++){
                if(k == 1 || k == 2 * i - 1 || i == n || i == 1){
                  System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            space--;
            System.out.println();
        }

        System.out.println("-------------------------------------------");

        //Question 3: Write a Java program to print inverted Pyramid star pattern for N rows.
        //*********
        // *******
        //  *****
        //   ***
        //    *
         int space1 = 0;
        for(int i = 1; i <= n; i++){
            //For Spaces
            for(int j = 1; j<= space1; j++){
                System.out.print(" ");
            }

            //For stars
            for(int k = 1; k <= (2 * n) - (2 * i - 1); k++){
                System.out.print("*");
            }

            space1++;
            System.out.println();
        }

        System.out.println("-------------------------------------------");

        //Question 4: Write a Java program to print hollow inverted Pyramid star pattern for N rows.
        //*********
        // *     *
        //  *   *
        //   * *
        //    *

        int space2 = 0;
        for(int i = 1; i <= n; i++) {
            //For Spaces
            for (int j = 1; j <= space2; j++) {
                System.out.print(" ");
            }

            //For stars
            for (int k = 1; k <= 2 * n - (2 * i - 1); k++) {
                if (k == 1 || k == 2 * n - (2 * i - 1) || i == n || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            space2++;
            System.out.println();
        }









        }
}
