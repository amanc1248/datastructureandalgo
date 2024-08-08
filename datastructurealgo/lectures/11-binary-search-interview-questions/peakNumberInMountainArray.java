public class peakNumberInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,144444,6,5,4,3,2,1};
        // int[]arr = {3,5,3,2,0};
        // int[] arr = {0,1,2,3,4,5,4,3,2,1,0};
        System.out.println(arr[peakNumberInMountainArray(arr)]);
    }
    
    static int peakNumberInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            System.out.println(start + ", " + end);
            int mid = start + (end - start) / 2;
            int midNum = arr[mid];
            int afterNum = arr[mid + 1];
            if (midNum > afterNum) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
