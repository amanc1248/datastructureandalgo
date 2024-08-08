public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9,10,13,14,17};
        System.out.println(findFloorOfNumber(arr, 8999));
    }
    static int findFloorOfNumber(int[] arr, int target){
        if(target<arr[0])return -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1 ;
            }else{
                return mid;
            };
        };
        return end;
    }
}
