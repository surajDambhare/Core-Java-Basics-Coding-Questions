package controlflow.arrays;

import java.util.Scanner;

public class ArraysBasicQuestions {
    //Question 3: Write a program that takes an array as input and prints the alternate elements of the array.
    public static void alternateNumberFromArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    //Question 4: Write a program that takes an array as input and creates a duplicate of the given array.
    public static void duplicateArray(int [] arr){
        int n = arr.length;
        int duplicateArray[] = new int[n];

        for(int i = 0; i < n; i++){
            duplicateArray[i] = arr[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(duplicateArray[i] + " ");
        }
    }

    //Question 5: Write a program that takes an array as input and creates two separate arrays: One containing all the odd elements and the other containing all the even elements.
    public static void separateOddEven(int [] arr){
        int oddCount = 0, evenCount = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        int [] evenArray = new int[evenCount];
        int [] oddArray = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenArray[evenIndex] = arr[i];
            }else {
                oddArray[oddIndex] = arr[i];
            }
        }

        printArray(evenArray);
        printArray(oddArray);
    }

    //Question 6: Write a program that takes an array as input and calculates both the sum and the product of all the elements in the array.
    //Example
    //Input: nums = [1, 2, 3, 4]
    //Output:
    //Sum: 10
    //Product: 24
    //Explanation: The sum of the elements (1 + 2 + 3 + 4) is 10, and the product (1 * 2 * 3 * 4) is 24.

    public static void productSum(int [] arr){
        int n = arr.length;
        int sum = 0;
        int product = 1;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Product: " + product);
        System.out.println("Sum: " + sum);
    }

    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1: Write a program that takes an array as input and prints each element of the array along with its corresponding index.
        System.out.println("Enter the Length of array: ");
        int length = sc.nextInt();

        System.out.print("Enter the array: ");
        int array[] = new int[length];

        for(int i = 0; i < length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < length; i++){
            System.out.println("The value at index " + i + " is " + array[i] );
        }

        System.out.println("----------------------------------------");

        //Write a program that takes an array as input and prints each element of the array in reverse order.
        //
        //Example
        //
        //Input: nums = [1, 2, 3, 5, 6]
        //Output: [6, 5, 3, 2, 1]

//        for(int i = length - 1; i >= 0; i--){
//            System.out.println("reverse array: " + array[i]);
//        }

//         int reversedArray[] = new int[array.length];
//
//         for(int i = 0; i < length; i++){
//             reversedArray[length - i - 1] = array[i];
//         }
//
//         for(int i = 0; i < length; i++){
//             System.out.print(reversedArray[i] + " ");
//         }



        alternateNumberFromArray(array);
        System.out.println();
        System.out.println("Duplicate Array: ");
        duplicateArray(array);

        productSum(array);
    }
}
