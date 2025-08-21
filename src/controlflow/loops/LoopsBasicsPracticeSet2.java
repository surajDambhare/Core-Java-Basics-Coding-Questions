package controlflow.loops;

import java.util.Scanner;

public class LoopsBasicsPracticeSet2 {

    public static boolean isPrimeNumber(int number){
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //To take input from user using this in build class.
        Scanner sc = new Scanner(System.in);

        //Question 1: Write a Program to input a number from user and find all factors of the given number using for loop.
        //Input: num = 12
        //Output: Factors of 12: 1, 2, 3, 4, 6, 12
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//
//        //Question 2: Write a program in Java to input a number and check whether the number is prime number or not using for loop.
//        System.out.println("Enter the number to check the prime or not: ");
//        int number = sc.nextInt();
//
//        // we are initially assuming is prime number
//        boolean isPrime = true;
//        for(int i = 2; i <= number / 2; i++){
//            if(number % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(isPrime == false){
//            System.out.println("Number is not a prime Number: " + number);
//        }else {
//            System.out.println("Number is a Prime Number: " + number);
//        }

        //Question 3: Write a Java program to print all Prime numbers between 1 to n using loop
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("--------------------------------------------------");

        //Question 4: Write a Java program to input a number from user and find Prime factors of the given number using loop.
        System.out.println("Enter the number for calculate the prime factors: ");
        int num1 = sc.nextInt();

        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0) {
                if (isPrimeNumber(i) == true) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
