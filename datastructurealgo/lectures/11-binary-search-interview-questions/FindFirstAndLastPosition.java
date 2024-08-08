import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println();
        // System.out.println(Arrays.toString(findFirstAndLastBrutForce(arr, 10)));
        // System.out.println(Arrays.toString(brutForceFindFirstAndLastBinarySearch(arr, 7)));
        System.out.println(Arrays.toString(findFirstAndLastOcc(arr, 12)));
    }
    // static int[] findFirstAndLast(int[] arr, int target){
    //     int [] foundValue = {-1,-1};
    //     if(arr.length==0)return foundValue;
    //     int start = 0;
    //     int end = arr.length  - 1;
    // }
    static int[] findFirstAndLastBrutForce(int[] arr, int target){
        int startIndex = -1;
        int endIndex = -1;
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == target){
                startIndex = index;
                break;
            };
        };
        if(startIndex==-1)return new int[]{startIndex, endIndex};
        if(startIndex==arr.length-1) return new int[]{startIndex, startIndex};
        for(int index = startIndex+1; index<arr.length; index++){
            if(arr[index]!=target){
                endIndex = index-1;
                break;
            }
        };
        return new int[]{startIndex, endIndex};
    }

    static int[] brutForceFindFirstAndLastBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int startIndex = -1;
        int endIndex = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else{
                startIndex = mid;
                if(mid==arr.length-1)return new int[]{startIndex, startIndex};
                for(int i = mid+1; i<arr.length; i++){
                    if(arr[i]!=target){
                        endIndex = i;
                        return new int[] {startIndex, endIndex};
                    };
                }
            }
        };
        return new int[] {startIndex, endIndex};
    }

    static int findOccurance(int [] nums, int target, boolean firstOccuranceCheck){
        int start = 0;
        int end  = nums.length -1;
        int occurance = -1;
        while(start<=end){
            int mid = start +(end -start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }else if (target>nums[mid]){
                start = mid +1;
            }else{
                occurance = mid;
                if(firstOccuranceCheck){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return occurance;
    }

    static int[] findFirstAndLastOcc(int [] arr, int target){
        int firstOccurance = findOccurance(arr, target,true);
        int lastOccurance = findOccurance(arr, target, false);
        return new int[] {firstOccurance, lastOccurance};
    }
}
