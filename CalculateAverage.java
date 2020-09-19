/*
calculate average of an array elements (positive integer)?
input: [1, 4, 5, 1, 6]
output: 3.4

input: [4, 4, 5, 1, 6]
output: 5
 */

import java.util.Arrays;
public class CalculateAverage {
    public static void main(String[] str){
        int arr[] = {Integer.MAX_VALUE, 4, 5, 1, 6};
        System.out.println("input array = " + Arrays.toString(arr));
        System.out.println("average = " + calculateAverage(arr));
    }

    /**
     Time Complexity: O(n)
     Space complexity: O(1)
     */

    public static double calculateAverage(int[] ar){
        int arSize = ar.length;
        double sum = 0.0;
        for(int i=0; i< arSize; i++){
            sum = sum + ar[i]/arSize;
        }

        return sum;
    }
}