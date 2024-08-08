public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 4, 4, 5, 6, 7, 8, 9, 900};
        System.out.println(linearSearch(arr, 9)); // Should print 7
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
