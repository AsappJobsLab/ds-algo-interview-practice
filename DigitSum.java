/*
Given an array arr[] of size N. The task is to find the sum of the digits of all array elements which contains even number of 1’s in it’s their binary representation.

Examples:

Input : arr[] = {4, 9, 15}
Output : 15
4 = 10, it contains odd number of 1’s
9 = 1001, it contains even number of 1’s
15 = 1111, it contains even number of 1’s
Total Sum = Sum of digits of 9 and 15 = 9 + 1 + 5 = 15

Input : arr[] = {7, 23, 5}
Output :10
 */

import java.util.Arrays;
public class DigitSum {
    public static void main(String[] str){
        int arr[] = {7, 23, 5};
        System.out.println("input array = " + Arrays.toString(arr));
        System.out.println("some digits who has even 1's = " + findSumOfDigits(arr));
    }

    /**
     Time Complexity:
     Space complexity:
     */

    public static boolean isEvenOneBit(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) count++;
            num = num >> 1;
        }

        return count % 2 == 0;
    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static int findSumOfDigits(int[] ar){
        int arSize = ar.length;
        int sum = 0;
        for(int i=0; i<arSize; i++){
            if(isEvenOneBit(ar[i])){
                sum = sum + sumDigit(ar[i]);
            }
        }
        return sum;
    }
}
