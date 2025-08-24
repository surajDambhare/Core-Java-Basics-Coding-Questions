package controlflow.patterns;

import java.util.Scanner;

public class ZeroAndOnePattern2 {

    public static void main(String[] args) {

        //Question 1:
        //11111
        //22222
        //33333
        //44444
        //55555

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the cols: ");
        int cols = sc.nextInt();


        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


        //Question 2:
        //12345
        //12345
        //12345
        //12345
        //12345

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 3:
        //12345
        //23456
        //34567
        //45678
        //56789

        for(int i = 1; i <= rows; i++){
            for(int j = i; j < cols + i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        //Question 4:
        //1  2  3  4  5
        //6  7  8  9 10
        //11 12 13 14 15
        //16 17 18 19 20
        //21 22 23 24 25

        int k = 1;

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


        //Question 5:
        //55555
        //54444
        //54333
        //54322
        //54321

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= cols; j++){
             if(j <= i){
                 System.out.print(rows - j + 1);
             }else {
                 System.out.print(rows - i + 1);
             }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


        //Question 6:
        //55555
        //44445
        //33345
        //22345
        //12345

        for(int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                if (j <= rows - i + 1) {
                    System.out.print(rows - i + 1);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


    }
}
