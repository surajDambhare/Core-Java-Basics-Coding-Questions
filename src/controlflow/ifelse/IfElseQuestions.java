package controlflow.ifelse;

import java.util.Scanner;

public class IfElseQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Question 1: input a character from user and check whether given character is alphabet, digit or special character.
        System.out.println("Enter any type of character : " );
        char ch = sc.next().charAt(0);

        if((ch >= 65 && ch <= 90 )|| (ch >= 97 && ch <= 122)){
            System.out.println("Characters is alphabetic! ");
        }else if(ch >= 48 && ch <= 57){
            System.out.println("Characters is digit!");
        }else{
            System.out.println("Characters is special character");
        }

        //Question 2: input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
        //Input : 567890
        // Output :
        // Total Number of Notes
        // 500 = 1135
        // 100 = 3
        // 50 = 1
        // 20 = 2
        // 10 = 0
        // 5 = 0
        // 2 = 0
        // 1 = 0

        System.out.println("Enter the Money: ");
        int money = sc.nextInt();

        int count_500 = 0;
        int count_100 = 0;
        int count_50 = 0;
        int count_20 = 0;
        int count_10 = 0;
        int count_5 = 0;
        int count_2 = 0;
        int count_1 = 0;

        if(money >= 500){
            count_500 = money / 500;
            money -= count_500 * 500;
        }
        if (money >= 100){
            count_100 = money / 100;
            money -= count_100 * 100;
        }
        if (money >= 50){
            count_50 = money / 50;
            money -= count_50 * 50;
        }
        if (money >= 20){
            count_20 = money / 20;
            money -= count_20 * 20;
        }
        if (money >= 10){
            count_10 = money / 10;
            money -= count_10 * 10;
        }
        if (money >= 5){
            count_5 = money / 5;
            money -= count_5 * 5;
        }
        if (money >= 2){
            count_2 = money / 2;
            money -= count_2 * 2;
        }

        if (money >= 1){
            count_1 = money;
        }


        System.out.println("Count of 500 : " + count_500);
        System.out.println("Count of 100 : " + count_100);
        System.out.println("Count of 50 : " + count_50);
        System.out.println("Count of 20 : " + count_20);
        System.out.println("Count of 10 : " + count_10);
        System.out.println("Count of 5 : " + count_5);
        System.out.println("Count of 2 : " + count_2);
        System.out.println("Count of 1 : " + count_1);

        //Question 3:  input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle.
//        Properties of triangle
//        A triangle is said Equilateral Triangle, if all its sides are equal. If a, b, c are three sides of triangle. Then, the triangle is equilateral only if a == b == c.
//        A triangle is said Isosceles Triangle, if its two sides are equal. If a, b, c are three sides of triangle. Then, the triangle is isosceles if either a == b or a == c or b == c.
//        A triangle is said Scalene Triangle, if none of its sides are equal.

        System.out.println("Enter Triangle's First Side : " );
        int firstSide = sc.nextInt();
        System.out.println("Enter Triangle's Second Side : ");
        int secondSide = sc.nextInt();
        System.out.println("Enter Triangle's Third Side: ");
        int thirdSide = sc.nextInt();

        if(firstSide == secondSide && secondSide == thirdSide && thirdSide == firstSide){
            System.out.println("Equilateral Triangle!");
        }else if(firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide){
            System.out.println("Isosceles Triangle!");
        }else{
            System.out.println("Scalene Triangle!");
        }

        //Question 4: input electricity unit charge and calculate the total electricity bill according to the given condition:
        //For first 50 units Rs. 0.50/unit
        //For next 100 units Rs. 0.75/unit
        //For next 100 units Rs. 1.20/unit
        //For unit above 250 Rs. 1.50/unit
        //An additional surcharge of 20% is added to the bill.

        System.out.println("Enter the Electricity Units : ");
        int units = sc.nextInt();

        double amount = 0;

        if(units <= 50){
            amount = units * 0.50;
        }else if(units <= 150){
            amount = 25 + (units - 50) * 0.75;
        }else if(units <= 250){
            amount = 100 + (units - 100) * 1.20;
        }else {
            amount = 220 + (units - 100) * 1.50;
        }

        double surCharge =  amount * 0.20;
        double totalAmount = amount + surCharge;

        System.out.println("Total Bill : " + totalAmount);

    }
}
