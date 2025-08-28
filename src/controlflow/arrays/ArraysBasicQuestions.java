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

    //Question 7: Write a program that takes an array and a target number as input and counts the number of times the target number appears in the array.
    //Input: nums = [1, 2, 3, 4, 2, 2, 5], target = 2
    //Output: Count: 3
    //Explanation: The number 2 appears 3 times in the array [1, 2, 3, 4, 2, 2, 5].
    public static int countTarget(int [] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }

        return count;
    }

    //Question 8: Write a program that takes an array as input and checks if it is sorted in forward order, backward order, or not sorted at all.
    //Example
    //Input: nums = [1, 2, 3, 4, 5]
    //Output: Sorted in Forward Order
    //Explanation: The array [1, 2, 3, 4, 5] is in ascending order, meaning it is sorted in forward order.
    //
    //Input: nums = [5, 4, 3, 2, 1]
    //Output: Sorted in Backward Order
    //Explanation: The array [5, 4, 3, 2, 1] is in descending order, meaning it is sorted in backward order.
    //
    //Input: nums = [3, 1, 4, 2, 5]
    //Output: Not Sorted
    //Explanation: The array [3, 1, 4, 2, 5] is neither in ascending nor descending order, so it is not sorted.

    public static String isSorted(int [] arr){
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isAscending = false;
            }else if(arr[i] < arr[i + 1]){
                isDescending = false;
            }
        }

        if(isAscending == true){
            return "Sorted in Forward Order";
        } else if (isDescending == true) {
            return "Sorted in Backward Order";
        }else {
            return "Not Sorted";
        }
    }

    //Question 8: Find Count of Unique and Duplicate Elements in an Array Solution in C++/Java/Python/JS
    public static void countDuplicatesAndUniques(int [] arr){
        int freq[] = new int[101];

        for(int i = 0; i < arr.length; i++){
           freq[arr[i]]++;
        }

        int uniqueCount = 0;
        int duplicateCount = 0;

        for(int i = 0; i <= 100; i++){
            if(freq[i] == 1){
                uniqueCount++;
            }else if(freq[i] >= 2){
                duplicateCount += freq[i] - 1;
            }
        }

        System.out.println("Unique Count: " + uniqueCount + " " + "Duplicate count: " + duplicateCount);
    }

    //Question 9:Given an array of integers, we need to check if there exist two distinct elements in the array such that their sum equals a given target value. If such a pair exists, the function should print true; otherwise, it should print false.
    //Example:
    //Input: nums: [2, 7, 11, 15], target: 9
    //Output: true

    //Explanation: In this case, the elements 2 and 7 sum up to 9, so the function should print true.
    //Input: nums: [2, 9, 11, 9, 4], target: 18
    //Output: true

    //Explanation: In this case, the elements 9 (at index 1) and 9 (at index 3) sum up to 18, both elements are at different index so the function should print true.


   public static boolean calculateTargetSum(int [] arr, int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }

        return false;
   }

   //Question 10 : Given an array of integers, we need to check if there exist three distinct elements in the array such that their sum equals a given target value. If such a triplet exists,
   // the function should print true; otherwise, it should print false.
   //Input: nums = [2, 7, 11, 15, 12, 10], target = 24
   //Output: true
   //Explanation: The elements 2, 7, and 15 sum up to 24.
   //
   //Input: nums = [2, 7, 11, 15], target = 20
   //Output: false
   //Explanation: No three elements in the array sum up to 20.

    public static boolean tripletSum(int [] nums, int target){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //Question 1: Write a program that takes an array as input and prints each element of the array along with its corresponding index.
//        System.out.println("Enter the Length of array: ");
//        int length = sc.nextInt();
//
//        System.out.print("Enter the array: ");
//        int array[] = new int[length];
//
//        for(int i = 0; i < length; i++){
//            array[i] = sc.nextInt();
//        }

//        for(int i = 0; i < length; i++){
//            System.out.println("The value at index " + i + " is " + array[i] );
//        }

//        System.out.println("----------------------------------------");

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
//
//
//
//        alternateNumberFromArray(array);
//        System.out.println();
//        System.out.println("Duplicate Array: ");
//        duplicateArray(array);
//        productSum(array);
//
//        System.out.println("Enter the target value: ");
//        int target = sc.nextInt();
//
//        System.out.println("Target appears : " + countTarget(array, target));

        //System.out.println(isSorted(array));
//        int nums[] = {1, 2, 2, 3, 4, 4, 4, 5};
//
//        countDuplicatesAndUniques(nums);

//        int nums [] =  {2, 9, 11, 9, 4};
//        int target = 18;
//
//        System.out.println("Target is present : then true for not false: " + calculateTargetSum(nums, target));

        int [] nums ={2, 7, 11, 15, 12, 10};
        int target = 24;
        System.out.println(tripletSum(nums, target));
    }
}
