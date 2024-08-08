public class PositionOfElementInInfinite {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8, 8, 8, 8, 12, 45, 67, 89, 89, 99, 91, 92, 93, 94, 95, 96, 100, 100, 100, 100,
                100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                100, };
        System.out.println(findPositionBinarySearch(arr, 95));
    }

    static int findPositionBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int temp = end + 1;
            end = end + ((end - start + 1) * 2);
            start = temp;
        }
        ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        ;
        return -1;

    }
}
