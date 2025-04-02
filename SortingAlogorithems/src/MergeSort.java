
public class MergeSort {

    public static void mergeSortAlgorithm(int arr[], int start, int end) {
        if (start >= end) { // Base case correction
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortAlgorithm(arr, start, mid); // Sort left half
        mergeSortAlgorithm(arr, mid + 1, end); // Sort right half

        merge(arr, start, mid, end); // Merge sorted halves
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to the original array
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 7, 6, 9, 0 };
        mergeSortAlgorithm(arr, 0, arr.length - 1); // Fix array size issue

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * These two while loops are used to copy the remaining elements from the left
 * and right subarrays after merging the common part.
 * 
 * Why Are These While Loops Needed?
 * When merging two sorted subarrays, the main while loop:
 * 
 * java
 * Copy
 * Edit
 * while (i <= mid && j <= end) {
 * if (arr[i] <= arr[j]) {
 * temp[k++] = arr[i++];
 * } else {
 * temp[k++] = arr[j++];
 * }
 * }
 * only runs until one of the subarrays is fully traversed.
 * If one subarray is completely merged but the other still has elements left,
 * we need to copy those remaining elements.
 * 
 * Breakdown of the Two Loops
 * 1️⃣ Copy Remaining Left Subarray Elements
 * java
 * Copy
 * Edit
 * while (i <= mid) {
 * temp[k++] = arr[i++];
 * }
 * If the right subarray is exhausted, but the left subarray still has elements,
 * we copy the remaining elements from the left subarray.
 * 
 * Since both subarrays were already sorted, the remaining elements are already
 * in order.
 * 
 * 2️⃣ Copy Remaining Right Subarray Elements
 * java
 * Copy
 * Edit
 * while (j <= end) {
 * temp[k++] = arr[j++];
 * }
 * If the left subarray is exhausted, but the right subarray still has elements,
 * we copy them over.
 * 
 * Again, since both subarrays were sorted, the remaining elements in the right
 * subarray are already in order.
 * 
 * Example to Visualize Why This Is Needed
 * Input Array Before Merging
 * less
 * Copy
 * Edit
 * Left subarray: [2, 5, 7]
 * Right subarray: [1, 4, 6, 8]
 * Merging Process
 * Compare 2 and 1 → Take 1
 * 
 * Compare 2 and 4 → Take 2
 * 
 * Compare 5 and 4 → Take 4
 * 
 * Compare 5 and 6 → Take 5
 * 
 * Compare 7 and 6 → Take 6
 * 
 * At this point, the left subarray is exhausted, but 8 is still left in the
 * right subarray.
 * 
 * Without the while (j <= end) loop, 8 would be missing from the final result!
 * Final Merged Array (After Copying Remaining Elements)
 * csharp
 * Copy
 * Edit
 * [1, 2, 4, 5, 6, 7, 8]
 * Key Takeaways
 * ✅ These two loops ensure that all elements from both subarrays are included
 * in the merged array.
 * ✅ They only run when one subarray is fully processed and the other still has
 * elements left.
 * ✅ Without these loops, the merge function would sometimes miss elements from
 * one of the subarrays.
 * 
 * Let me know if you need further clarification! 🚀
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * You said:
 * please can u give example
 * 
 * 
 * ChatGPT said:
 * Sure! Let's go step by step with an example to visualize why the extra while
 * loops are needed in Merge Sort.
 * 
 * Example: Merging Two Sorted Subarrays
 * Suppose we have the following array:
 * 
 * javascript
 * Copy
 * Edit
 * Original Array: [3, 8, 10, 1, 5, 7]
 * We will merge these two sorted halves:
 * 
 * less
 * Copy
 * Edit
 * Left Subarray: [3, 8, 10]
 * Right Subarray: [1, 5, 7]
 * Step-by-Step Merge Process
 * Initial Comparison Loop (while i <= mid && j <= end)
 * Left Subarray (i) Right Subarray (j) Compare Add to Merged Array
 * 3 1 3 > 1 1 (from Right)
 * 3 5 3 < 5 3 (from Left)
 * 8 5 8 > 5 5 (from Right)
 * 8 7 8 > 7 7 (from Right)
 * At this point, the right subarray is fully merged (exhausted), but 8 and 10
 * are still left in the left subarray.
 * 
 * Handling Remaining Elements with while (i <= mid)
 * Since there are still elements in the left subarray (8, 10), we copy them:
 * 
 * Left Subarray (i) Remaining Add to Merged Array
 * 8 10 8 (from Left)
 * 10 - 10 (from Left)
 * Now, all elements are merged.
 * 
 * Final Merged Array
 * csharp
 * Copy
 * Edit
 * [1, 3, 5, 7, 8, 10]
 * Why Are the While Loops Needed?
 * If we don’t have while (i <= mid), the elements 8 and 10 would be missing
 * from the final array.
 * 
 * If instead, the left subarray was exhausted first, we would need while (j <=
 * end) to copy the remaining right subarray elements.
 * 
 * Would you like to see another example with different number
 */
