/*
Find the first non-repeating element in a given array of integers.

Examples:

Input : -1 2 -1 3 2
Output : 3
Explanation : The first number that does not
repeat is : 3

Input : 9 4 9 6 7 4
Output : 6
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] str){
        int arr[] = { 9, 4, 6, 7, 4, 6, 7};
        System.out.println("input array = " + Arrays.toString(arr));
        System.out.println("value of first non repeating element = " + findFirstUniqueElement(arr));
    }

    /**
     Time Complexity: O(n)
     Space complexity: O(n)
     */

    public static int findFirstUniqueElement(int[] ar){
        int arSize = ar.length;

        Map <Integer, Integer> uniqueMap = new HashMap<>();

        // building map
        for(int i=0; i< arSize; i++){
            if(uniqueMap.containsKey(ar[i]))
                uniqueMap.put(ar[i], uniqueMap.get(ar[i]) + 1);
            else
                uniqueMap.put(ar[i] , 1);
        }

        // scan map
        for(Map.Entry<Integer, Integer> it: uniqueMap.entrySet()){
            if(it.getValue() == 1) return it.getKey();
        }

        return -1;
    }

}
