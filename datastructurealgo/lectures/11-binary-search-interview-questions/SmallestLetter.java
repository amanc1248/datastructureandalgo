public class SmallestLetter {
    public static void main(String[] args) {
        // char[] arr = {'a','b','c','d','e','f'};
        char[] arr = {'a','c','x','x','y','y'};
        System.out.println(smallestLetter(arr, 'b'));
    }
    static char smallestLetter(char[] arr, char target){
        // if(target> arr[arr.length-1] || target ==arr[arr.length-1])return arr[0];
        int start = 0;
        int end  = arr.length - 1;
        while (start<=end) {
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
        System.out.println(start);
        System.out.println(start % arr.length); // this means. arr.length/start.
        return arr[start % arr.length];
    }
}
