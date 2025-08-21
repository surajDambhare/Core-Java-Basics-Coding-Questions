package controlflow.loops;

import java.util.Scanner;

public class LoopsBasicsPracticeSet3 {

    public static boolean isArmstrongNumber(int originalNumber){
        int digits = 0;
        int number = originalNumber;

        if(number == 0){
            digits = 1;
        }

        while(number != 0){
            number /= 10;
            digits++;
        }

        int num = originalNumber;
        int sum = 0;

        while (num > 0){
            int lastDigits = num % 10;

            sum = (int) (sum + Math.pow(lastDigits, digits));

            num /= 10;

        }

        if(originalNumber == sum){
            return true;
        }else{
           return false;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Question 1: Write a Java program to input two numbers from user and find LCM (Lowest Common Multiple).
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        //Checking which number is bigger
        int lcm = (a > b) ? a : b;

        while(true){
            if((lcm % a == 0) && (lcm % b == 0)){
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + a + " and " + b + " is : " + lcm);

        //Question 2: Write a Java program to input two numbers from the user and find HCF (Highest Common Factor) / GCD (Greatest Common Divisor)
        int hcf = 1;

        for(int i = 1; i <= Math.min(a, b); i++){
            if((a % i == 0) && (b % i == 0)){
                hcf = i;
            }
        }

        System.out.println("HCF of " + a + " and " + b + " is : " + hcf);

        //Question 3: Write a Java program to input a number from the user and check whether the given number is an Armstrong number or not.What is a Armstrong Number?
        //An Armstrong number is a n-digit number that is equal to the sum of the nth power of its digits.
        //For example –
        //6 = 6^1 = 6
        //371 = 3^3 + 7^3 + 1^3 = 371

//        System.out.println("Enter the number: ");
//        int originalNumber = sc.nextInt();
//        int digits = 0;
//        int number = originalNumber;
//
//        if(number == 0){
//            digits = 1;
//        }
//
//        while(number != 0){
//            number /= 10;
//            digits++;
//        }
//
//        int num = originalNumber;
//        int sum = 0;
//
//        while (num > 0){
//            int lastDigits = num % 10;
//
//            sum = (int) (sum + Math.pow(lastDigits, digits));
//
//            num /= 10;
//
//        }
//
//        if(originalNumber == sum){
//            System.out.println("Number is an armstrong number!");
//        }else{
//            System.out.println("Number is not an armstrong number!");
//        }
//

        for(int i = 1; i <= 1000; i++){
            if(isArmstrongNumber(i) == true){
                System.out.print(i + " ");
            }
        }


    }
}
