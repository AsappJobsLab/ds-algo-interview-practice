/*
Given an Array of size N and a values K, around which we need to right rotate the array. How to quickly print the right rotated array?

Examples :

Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
Output: 7 9 1 3 5
Explanation:
After 1st rotation - {9, 1, 3, 5, 7}
After 2nd rotation - {7, 9, 1, 3, 5}

Input: Array[] = {1, 2, 3, 4, 5}, K = 4.
Output: 2 3 4 5 1
 */

import java.util.Arrays;
public class printArray {
    public static void main(String[] str){
        int arr[] = {1, 3, 5, 7, 9};
        int k =4;
        System.out.println("array before = " + Arrays.toString(arr));
        printWithoutRotation(arr, k);
    }

    /**
     Time Complexity: O(n*k)
     Space complexity: O(1)
     */
    public static void printAfterRotation(int[] ar, int K){
        int arSize = ar.length;
        int temp;

        if(K<0) return;

        K = K%arSize;

        for(int i=1; i<=K; i++){
            temp = ar[arSize-1];
            for(int j=arSize-1;j>0;j--){
                ar[j] = ar[j-1];
            }
            ar[0] = temp;
        }
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
     */
    public static void printWithoutRotation(int[] ar, int K){
        int arSize = ar.length;

        if(K<0 || arSize < 2) return;

        K = K%arSize;

        for(int i=0; i<arSize; i++){
            if(i<K) System.out.print(ar[arSize-K+i]+" ");
            else System.out.print(ar[i-K]+" ");
        }
    }
}
