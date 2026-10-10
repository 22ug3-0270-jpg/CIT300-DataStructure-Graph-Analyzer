public class SearchingOperations {
    public static int linearSearch(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Linear Search: Found at index " + i + " (Steps: " + steps + ")");
                return i;
            }
        }
        System.out.println("Linear Search: Not found (Steps: " + steps + ")");
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int steps = 0;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Binary Search: Found at index " + mid + " (Steps: " + steps + ")");
                return mid;
            }
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Binary Search: Not found (Steps: " + steps + ")");
        return -1;
    }
}