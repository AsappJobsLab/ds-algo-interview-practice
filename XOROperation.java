/*
Given an array arr and a number K, find the new array formed by performing XOR of the corresponding element from the given array with the given number K.

Examples:

Input: arr[] = { 2, 4, 1, 3, 5 }, K = 5
Output: 7 1 4 6 0
Explanation:
2 XOR 5 = 7
4 XOR 5 = 1
1 XOR 5 = 4
3 XOR 5 = 6
5 XOR 5 = 0

Input: arr[] = { 4, 75, 45, 42 }, K = 2
Output: 6 73 47 40
 */

import java.util.Arrays;
public class XOROperation {
    public static void main(String[] str){
        int arr[] = {2, 4, 1, 3, 5};
        int k = 5;
        System.out.println("array before XOR Operation = " + Arrays.toString(arr));
        doXOROperationOnSameArray(arr,k);
        System.out.println("array after XOR Operation = " + Arrays.toString(arr));
    }

    /**
     Time Complexity: O(n)
     Space complexity: O(n)
     */
    public static int[] doXOROperation(int[] ar, int K){
        int arSize = ar.length;

        int[] newArray = new int[arSize];

        for(int i=0; i<arSize; i++){
            newArray[i] = ar[i] ^ K;
        }

        return newArray;
    }

    /**
     Time Complexity: O(n)
     Space complexity: O(1)
     */
    public static void doXOROperationOnSameArray(int[] ar, int K){
        int arSize = ar.length;
        for(int i=0; i<arSize; i++){
            ar[i] = ar[i] ^ K;
        }
    }

}
