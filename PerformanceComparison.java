public class PerformanceComparison {
    public static void compare(int[] arr, int target) {
        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        System.out.println("Array size: " + arr.length + ", Target: " + target);

        long start = System.nanoTime();
        int linearResult = SearchingOperations.linearSearch(arr, target);
        long linearTime = System.nanoTime() - start;

        int[] sortedArr = arr.clone();
        java.util.Arrays.sort(sortedArr);

        start = System.nanoTime();
        int binaryResult = SearchingOperations.binarySearch(sortedArr, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("\n--- Results ---");
        System.out.println("Linear Search: index=" + linearResult + ", time=" + linearTime + " ns");
        System.out.println("Binary Search: index=" + binaryResult + ", time=" + binaryTime + " ns");
        System.out.println("\nNote: Binary Search is faster for large sorted arrays (O(log n) vs O(n))");
    }
}