/*

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
     Space complexity: O(n)
     */
    public static int calculateAverage(int[] ar){
        int arSize = ar.length;
        int avg = 0;
        for(int i=0; i<arSize-1; i+=2){
            avg = avg + ar[i] - (ar[i] - ar[i+1])/2;
        }
        return avg;
    }

}