public class FindMinMaxNumber {
    public static void main(String[] args) {
        int[] arr = {12,3,45,6,7,8,9,0,3,4,5,6,7,-99};
        System.out.println("Min: "+findMin(arr));
        System.out.println("Max: "+findMax(arr));
    };
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if(i<min)min=i;
        };
        return min;
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i: arr){
            if(i>max)max= i;
        };
        return max;
    }
}
