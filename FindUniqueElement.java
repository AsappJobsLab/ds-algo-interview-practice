/*

 */

import java.util.Arrays;
public class FindUniqueElement {
    public static void main(String[] str){
        int arr[] = { 6, 1, 1, 6, 8, 4, 10, 8, 4};
        System.out.println("input array = " + Arrays.toString(arr));
        System.out.println("unique element = " + method1(arr));
    }

    /**
     Time Complexity: O(n)
     Space complexity: O(n)
     */
    public static int method1(int[] ar){
        int arSize = ar.length;
        int j;
        for(int i=0; i<arSize; i++){
            for(j=0; j<arSize; j++){
                if(i!=j && ar[i] == ar[j]){
                    ar[j] = -ar[j];
                    break;
                }

            }
            if(j == arSize)
                return ar[i];
        }
        return -1;
    }

}
