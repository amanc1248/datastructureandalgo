import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,},
            {10,11,12}
        };
        System.out.println(Arrays.toString(searchIn2D(arr, 12)));
        System.out.println(maxIn2DArray(arr));
        System.out.println();
    }
    static int[] searchIn2D(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i][j]==target){
                    return  new int[]{i, j};
                }
            }
        };
        return new int[]{-1,-1};
    }

    static int maxIn2DArray(int[][] arr){
        int max = arr[0][0];
        for(int[] i: arr){
            for(int j: i){
                if(j>max)max=j;
            }
        }
        return max;
    }
}
