package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr= {100000,2,3,4,5,6,7,8,9,10};
        System.out.println("Maximum item is: "+ max(arr));
    }
    static int max(int[] arr){
        int maxValue = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue =arr[i];
            };
        };
        return maxValue;
    }
}
