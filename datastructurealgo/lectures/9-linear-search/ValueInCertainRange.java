public class ValueInCertainRange {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findInCertainRange(arr, 4, 7, 8));
    };
    static int findInCertainRange(int[]arr, int start, int end, int target){
        if(arr.length==0)return -1;
        for(int i = start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        };
        return -1;
    }
}
