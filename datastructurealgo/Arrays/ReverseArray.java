package Arrays;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] reversedArray = reverseArray(arr);
        System.out.println("Reveresed array is: "+Arrays.toString(reversedArray));
    }
    static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            reversedArray[i] = arr[arr.length-i-1];
        };
        return reversedArray;
    }
}
