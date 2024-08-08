public class findInMountainArray {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        // int[]arr = {1,5,2};
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(arr, 3));
    }

    static int findInMountainArray(int[] arr, int target) {
        // Steps:
        // 1. find peak index
        // 2. then run the binary search

        // find peak index
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int theFoundIndex =normalBinarySearch(arr, target, 0, end, true);
        if(theFoundIndex==-1){
            return normalBinarySearch(arr, target, end,arr.length-1, false);
        }else{
            return theFoundIndex;
        }
    }

    static int normalBinarySearch(int [] arr, int target, int startIndex, int peakIndex, boolean isAsce){
        int start = startIndex;
        int end = peakIndex;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(isAsce){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid +1;
                }else{
                    return mid;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else if(target>arr[mid]){
                    end = mid;
                }else{
                    return mid;
                }
            }
        };
        return -1;
    }
}
