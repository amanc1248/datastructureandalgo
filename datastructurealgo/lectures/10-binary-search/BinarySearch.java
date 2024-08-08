
public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = {-12,-11,-10,-1,0,1,2,3,4,5,6,7,8,9,10};
        // int[] arr = { 10, 9, 8, 7, 6, 5 };
        int[] arr = { 10, 10, 10, 10, 10, 10, 10 };
        System.out.println(doBinarySearch(arr, 10));

    };

    static int doBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int foundIndex = -1;
        while (start <= end) {
            String isAsce = isAsce(arr[start], arr[end]);
            if (isAsce == "equal")
                return start;
            boolean isAscending = isAsce == "asce" ? true : false;
            int midIndex = start + (end - start) / 2;
            int midElement = arr[midIndex];
            if (midElement == target) {
                foundIndex = midIndex;
                break;
            }
            ;
            if (isAscending) {
                if (target < midElement) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            } else {
                if (target < midElement) {
                    start = midIndex + 1;
                } else {
                    end = midIndex - 1;
                }
            }

        }

        return foundIndex;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int foundIndex = -1;
        while (start <= end) {
            String isAsce = isAsce(arr[start], arr[end]);
            if (isAsce == "equal")
                return start;
            boolean isAscending = isAsce == "asce" ? true : false;
            int midIndex = start + (end - start) / 2;
            int midElement = arr[midIndex];
            if (midElement == target) {
                foundIndex = midIndex;
                break;
            }
            ;
            if (isAscending) {
                if (target < midElement) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1;
                }
            } else {
                if (target < midElement) {
                    start = midIndex + 1;
                } else {
                    end = midIndex - 1;
                }
            }

        }

        return foundIndex;
    }
    static String isAsce(int firstElem, int lastElem) {
        if (firstElem < lastElem) {
            return "asce";
        } else if (firstElem > lastElem) {
            return "desc";
        } else {
            return "equal";
        }
    }
}
