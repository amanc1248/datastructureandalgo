public class CeilingOfNumber{
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        int target = 5;
        System.out.println(findCelingOfNumber(arr, target));
        // System.out.println(brutForceFindCeilingNumber(arr, target));
    }
    static int findCelingOfNumber(int[] arr, int target){
        if(target>arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            int midElem = arr[mid];
            if(target==midElem){
                return mid;
            }
            if(target<midElem){
                end = mid-1;
            }else{
                start =mid+1;
            };
        };
        return start;
    }

    
    static int brutForceFindCeilingNumber(int[] arr, int target){
        for(int num: arr){
            if(num==target)return num;
            if(num>target)return num;
        };
        return -1;
    }
}