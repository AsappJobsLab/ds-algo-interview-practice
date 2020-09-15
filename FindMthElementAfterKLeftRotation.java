import java.util.Arrays;

/*
Given non-negative integers K, M, and an array arr[] with N elements find the Mth element of the array after K left rotations.

Examples:

Input: arr[] = {3, 4, 5, 23}, K = 2, M = 1
Output: 5
Explanation:
The array after first left rotation a1[ ] = {4, 5, 23, 3}
The array after second left rotation a2[ ] = {5, 23, 3, 4}
st element after 2 left rotations is 5.

Input: arr[] = {1, 2, 3, 4, 5}, K = 3, M = 2
Output: 5
Explanation:
The array after 3 left rotation has 5 at its second position.
 */
public class FindMthElementAfterKLeftRotation {
    public static void main(String[] str){
            int arr[] = {3,4,1,2,7,5,9,23};
        int k = 1;
        int m = 1;
        System.out.println("array before rotation = " + Arrays.toString(arr));
        int val = findElementAfterRotationMethod2(arr,k,m);

        if(val == -1)
            System.out.println("input is wrong, please check once again!");
        else
            System.out.println("final output = " + val);

        System.out.println("array after "+k+" rotation = " + Arrays.toString(arr));

    }

    /*
    Time complexity: O(n*k)
    Space complexity: O(1)
     */
    public static int findElementAfterRotationMethod1(int[] ar, int K, int M){
        int arSize = ar.length;

        // first check
        if(arSize == 0 || M > arSize || M < 1 || K < 0) return -1;

        // second check
        K = K%arSize;

        for(int i=1; i<=K; i++){
            int temp = ar[0];
            for(int j=1; j<arSize; j++){
                ar[j-1] = ar[j];
            }
            ar[arSize-1] = temp;
        }

        return ar[M-1];
    }

    /*
    Time complexity: O(1)
    Space complexity: O(1)
     */
    public static int findElementAfterRotationMethod2(int[] ar, int K, int M){
        int arSize = ar.length;

        // first check
        if(arSize == 0 || M > arSize || M < 1 || K < 0) return -1;

        // second check
        K = K%arSize;

        return ar[(K+M-1)%arSize];
    }
}
