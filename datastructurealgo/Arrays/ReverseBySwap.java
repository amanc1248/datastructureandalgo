package Arrays;

import java.util.Arrays;

public class ReverseBySwap {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(reverseBySwap(arr)));
    }
    static int[] reverseBySwap(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start+=1;
            end-=1;
        };
        return arr;
    }
}
