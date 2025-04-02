public class quickssort {

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pi = partition(arr, si, ei);
        quicksort(arr, si, pi - 1);
        quicksort(arr, pi + 1, ei);
    }
 //worest case
 /*
  * Choosing the Largest or Smallest Element as Pivot Every Time

If we always pick a bad pivot (smallest/largest element), it will cause unbalanced partitioning.


  */
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { // Fixed condition
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 7, 6, 9, 0 };
        quicksort(arr, 0, arr.length - 1);

        System.out.print("Sorted array by using Quicksort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Visualization of QuickSort
 * QuickSort works using Divide and Conquer, where an element (pivot) is chosen,
 * and the array is partitioned into two subarrays. Let's visualize the steps
 * using an example.
 * 
 * Example:
 * Input Array: [1, 4, 5, 2, 7, 6, 9, 0]
 * We take the last element as the pivot and partition accordingly.
 * 
 * Step-by-Step Execution:
 * First Call: quicksort(arr, 0, 7)
 * 
 * Pivot = 0
 * 
 * Partitioning: Move elements smaller than pivot to the left.
 * 
 * Result: [0, 4, 5, 2, 7, 6, 9, 1]
 * 
 * Recursive Calls: [ ] | [4, 5, 2, 7, 6, 9, 1]
 * 
 * Second Call: quicksort(arr, 1, 7)
 * 
 * Pivot = 1
 * 
 * Partitioning: [0, 1, 5, 2, 7, 6, 9, 4]
 * 
 * Recursive Calls: [0, 1] | [5, 2, 7, 6, 9, 4]
 * 
 * Third Call: quicksort(arr, 2, 7)
 * 
 * Pivot = 4
 * 
 * Partitioning: [0, 1, 2, 4, 7, 6, 9, 5]
 * 
 * Recursive Calls: [0, 1, 2] | [4, 7, 6, 9, 5]
 * 
 * Fourth Call: quicksort(arr, 4, 7)
 * 
 * Pivot = 5
 * 
 * Partitioning: [0, 1, 2, 4, 5, 6, 9, 7]
 * 
 * Recursive Calls: [0, 1, 2, 4, 5] | [6, 9, 7]
 * 
 * Final Steps: Sorting [6, 9, 7] recursively leads to [6, 7, 9].
 * 
 * Final Sorted Array:
 * [0, 1, 2, 4, 5, 6, 7, 9]
 * 
 * Common QuickSort Interview Questions
 * Here are some frequently asked QuickSort-related interview questions:
 * 
 * Basic Questions:
 * How does QuickSort work?
 * 
 * Explain the divide-and-conquer approach and partitioning.
 * 
 * What is the time complexity of QuickSort?
 * 
 * Best/Average Case: O(n log n)
 * 
 * Worst Case: O(n²), when the pivot is always the smallest/largest element.
 * 
 * Why is QuickSort better than Bubble Sort and Selection Sort?
 * 
 * QuickSort has an average time complexity of O(n log n), whereas Bubble and
 * Selection Sort take O(n²), making them slower.
 * 
 * What is the space complexity of QuickSort?
 * 
 * In-place QuickSort: O(log n) due to recursive calls.
 * 
 * Non-in-place (extra array for sorting): O(n)
 * 
 * Advanced Questions:
 * What are the different ways to choose a pivot in QuickSort?
 * 
 * Last element (Lomuto partition scheme)
 * 
 * First element
 * 
 * Random pivot
 * 
 * Median-of-three (median of first, middle, and last elements)
 * 
 * How can you optimize QuickSort to avoid worst-case performance?
 * 
 * Use randomized QuickSort or median-of-three pivot selection.
 * 
 * Is QuickSort stable?
 * 
 * No, QuickSort is not stable because it swaps elements across the array,
 * changing their relative order.
 * 
 * Where is QuickSort used in real life?
 * 
 * Sorting databases, large datasets, and competitive programming.
 * 
 * Used in Java's Arrays.sort() for primitives (Dual-Pivot QuickSort).
 * 
 * What is the difference between QuickSort and MergeSort?
 * 
 * Feature QuickSort MergeSort
 * Time Complexity O(n log n) (avg) O(n log n) (always)
 * Worst Case O(n²) O(n log n)
 * Stability Not stable Stable
 * Space Complexity O(log n) (in-place) O(n) (extra array)
 * Use Case Efficient in practice Best for linked lists
 * Would you like code implementations for different QuickSort variations or
 * more visualizations? 🚀
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
