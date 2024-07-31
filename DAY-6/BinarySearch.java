public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int val = 20;
        int result = binarySearch(arr, val);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1; // subtract 1 to avoid ArrayIndexOutOfBoundsException

        while (left <= right) {
            int mid = (left + right)/2;

            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // element not found
    }
}