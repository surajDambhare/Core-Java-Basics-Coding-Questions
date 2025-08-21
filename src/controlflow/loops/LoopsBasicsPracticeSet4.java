package controlflow.loops;

import java.util.Scanner;

public class LoopsBasicsPracticeSet4 {
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            return true;
        }else {
            return  false;
        }
    }

    public static int factorial(int number){
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number){
        int originalNumber = number;
        int sum = 0;

        while (number > 0){
            int lastDigits = number % 10;
            sum += factorial(lastDigits);
            number /= 10;
        }

        if(sum == originalNumber){
            return true;
        }else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        // Question 1: Write a Java program to input a number and check whether the number is a Perfect number or not.
        // What is a Perfect Number?
        // A perfect number is a positive integer that is equal to the sum of its proper positive divisors. A positive proper divisor is a positive divisor of a number, excluding itself.
        // For example: 6 is the first perfect number
        // Proper divisors of 6 are 1, 2, 3
        // Sum of its proper divisors = 1 + 2 + 3 = 6.
        // Hence 6 is a perfect number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

//        if(isPerfectNumber(number) == true){
//            System.out.println("Number is Perfect Number : " + number);
//        }else {
//            System.out.println("Number is not perfect Number : " + number);
//        }


        //Question 2: Write a Java program to find all Perfect numbers between 1 to n where n is the input given by the user.
//        for(int i = 1; i <= number; i++){
//            if (isPerfectNumber(i) == true) {
//                System.out.print(i + " ");
//            }
//        }

        //Question 3: Write a Java program to input a number from the user and check whether the given number is a strong number or not.
        // What is a Strong Number?
        //A strong number is a special number whose sum of factorial of digits is equal to the original number.
        //For example: 145 is a strong number. Since, 1! + 4! + 5! = 145

//        if(isStrongNumber(number) == true){
//            System.out.println(number + " Number is a Strong Number!");
//        }else{
//            System.out.println(number + " Number is not a Strong Number!");
//        }

        //Question 4: Write a java program to print all strong numbers between 1 to n where n is the input given by the user.
        for(int i = 1; i <= number; i++){
            if(isStrongNumber(i) == true){
                System.out.print(i + " ");
            }
        }




    }
}
