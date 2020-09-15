import java.util.Arrays;

/*
Given an array of random numbers, Push all the zero’s of the given array to the end of the array. For example, if the given arrays is {1, 0, 2, 6, 0, 4}, it should be changed to {1, 2, 6, 4, 0, 0}. The order of all other elements should be the same.

Examples:

Input: arr[]={8, 9, 0, 1, 2, 0, 3}
Output: arr[]={8, 9, 1, 2, 3, 0, 0}
Explanation:
Swap {0 ,1} -> Resulting array {8, 9, 1, 0, 2, 0, 3}
Swap {0 ,2} -> Resulting array {8, 9, 1, 2, 0, 0, 3}
Swap {0 ,3} -> Final array {8, 9, 1, 2, 3, 0, 0}

Input: arr[]={4, 5, 0, 0, 0, 0, 6, 7}
Output: arr[]={4, 5, 6, 7, 0, 0, 0, 0}
 */
public class MoveZeros {
    public static void main(String[] str){
        int arr[] = {0,0,4, 5, 0, 0, 0, 0, 6, 7};
        System.out.println("array before = " + Arrays.toString(arr));
        moveAllZeros(arr);
        System.out.println("array after = " + Arrays.toString(arr));
    }

    public static void moveAllZeros(int[] ar){
        int j,i = 0;
        int arSize = ar.length;
        boolean flag = true;

        // boundary check
        if(arSize == 0 || arSize == 1) return;

        while(flag){
            while(i < arSize && ar[i] != 0) i++;
            j = i+1;
            while(j < arSize && ar[j] == 0) j++;

            if(i == arSize || j == arSize){
                flag = false;
            }else{
                //swap
                ar[i] = ar[i] + ar[j];
                ar[j] = ar[i] - ar[j];
                ar[i] = ar[i] - ar[j];
            }
        }
    }
}
