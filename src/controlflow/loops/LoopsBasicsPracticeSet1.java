package controlflow.loops;

import java.util.Scanner;

public class LoopsBasicsPracticeSet1 {
    public static void main(String[] args) {
        // Question 1 : input a number and find the sum of first and last digit of the number using a for loop.
        // input : num = 12345
        // output: Sum of first and last digit = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int lastDigit = number % 10;
        int n = number;

        while(n > 10){
            n = n / 10;
        }

        int firstDigit = n;
        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit = " + sum);


        // Question 2:  input a number from the user and calculate product of its digits.
        // input : 1234
        // output : 24
        System.out.println("Enter the number to calculate the digitsqq product: ");
        int number2 = sc.nextInt();
        int product = 1;

        while (number2 > 0){
            //To get the last digit
            lastDigit = number2 % 10;

            //Calculating the products
            product *= lastDigit;

            //To remove the last digits
            number2 /= 10;
        }


        System.out.println("Products of digits in the number is : " + product);

        // Question 3: input number from user and check number is palindrome or not using loop.
        System.out.println("Enter the number to check the palindrome or not : ");
        int initialNumber = sc.nextInt();

        int num = initialNumber;
        int palindromeNumber = 0;

        while (num > 0){
            int lastDigits = num % 10;
            palindromeNumber = palindromeNumber * 10 + lastDigits;
            num /= 10;
        }

        if(initialNumber == palindromeNumber){
            System.out.println("Number is palindrome!");
        }else {
            System.out.println("Number is not palindrome!");
        }

//        Question 4:  find power of a number using for loop.
//        base = 2
//        exponent = 5
//          2 ^ 5 = 32

        System.out.println("Enter the base: ");
        int base = sc.nextInt();

        System.out.println("Enter the power: ");
        int exponent = sc.nextInt();
        int power = 1;

        for(int i = 1; i <= exponent; i++){
            power *= base;
        }

        System.out.println("power : " + power);

        // Question 5: print Fibonacci series up to n terms using loop.
        // 6 = 0 1 1 2 3 5
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;

        for(int i = 1; i <= num1; i++){

            System.out.print(thirdNumber + " ");

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
        }

    }
}
