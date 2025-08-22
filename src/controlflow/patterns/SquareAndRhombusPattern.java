package controlflow.patterns;

import java.util.Scanner;

public class SquareAndRhombusPattern {
    public static void main(String[] args) {
        //Question 1: Write a Java program to print a square star(*) pattern series of N rows.
        // input : 5
        // output
        //*****
        //*****
        //*****
        //*****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        System.out.println("Square Pattern : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        //Question 2: Write a Java program to print a hollow square star(*) pattern series of N rows.
        //*****
        //*   *
        //*   *
        //*   *
        //*****

        System.out.println("Hollow Square Star: ");

        for(int i = 1; i <= n; i++){
            if(i == 1 || i == n){
                for(int j = 1; j <= n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int k = 1; k <= n; k++){
                    if(k == 1 || k == n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("Hollow square star pattern with diagonals: ");
        //Question 3: Write a Java program to print a hollow square star pattern with diagonals.
        //*****
        //** **
        //* * *
        //** **
        //*****

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n || i == j || j == n - i + 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        //Question 4: Write a java program to print a rhombus star pattern of N rows.
        //    *****
        //   *****
        //  *****
        // *****
        //*****

        int spaces = n - 1;
        int stars = n;

        for(int i = 1; i <= n; i++){
                for(int k = 1; k <= spaces; k++){
                    System.out.print(" ");
                }

                for(int m = 1; m <= stars; m++){
                    System.out.print("*");
                }
                spaces--;
            System.out.println();
        }

        System.out.println("------------------------------------------");

        //Question 5: Write a java program to print the inverted/mirrored rhombus star pattern of N rows.
        //*****
        // *****
        //  *****
        //   *****
        //    *****

        int space = 0;
        int star = n;

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= space; k++){
                System.out.print(" ");
            }

            for(int m = 1; m <= star; m++){
                System.out.print("*");
            }
            space++;
            System.out.println();
        }

        System.out.println("------------------------------------------");
    }
}
