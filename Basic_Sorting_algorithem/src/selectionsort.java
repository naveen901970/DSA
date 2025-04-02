
import java.util.Arrays;

public class selectionsort {

    public static void selectionsorts(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            int currentpostion = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[currentpostion]) {
                    currentpostion = j;
                }

            }
            int temp = arr[currentpostion];
            arr[currentpostion] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 3, 5, 6, 8, 7, 9 };
        selectionsorts(arr);
        System.out.println(Arrays.toString(arr));

    }

}
/*
 * 📌 Basic Questions
 * 1️⃣ What is Selection Sort?
 * 👉 Selection Sort is a simple sorting algorithm that repeatedly selects the
 * smallest element from the unsorted portion of the array and swaps it with the
 * first unsorted element.
 * 
 * 2️⃣ How does Selection Sort work?
 * 👉 The algorithm divides the array into two parts:
 * 
 * Sorted part (left side, initially empty)
 * 
 * Unsorted part (right side, initially full array)
 * 
 * It finds the smallest element in the unsorted part and swaps it with the
 * first unsorted element.
 * 
 * This process is repeated until the entire array is sorted.
 * 
 * 3️⃣ What is the time complexity of Selection Sort?
 * Case Time Complexity
 * Best O(n²)
 * Worst O(n²)
 * Avg O(n²)
 * 👉 Selection Sort always takes O(n²) time, even if the array is already
 * sorted.
 * 
 * 4️⃣ What is the space complexity of Selection Sort?
 * 👉 O(1) (Constant space) because it only swaps elements in place and does not
 * use extra memory.
 * 
 * 5️⃣ Is Selection Sort stable?
 * 👉 No, Selection Sort is not stable because swapping may change the relative
 * order of equal elements.
 * 
 * 6️⃣ Is Selection Sort an in-place sorting algorithm?
 * 👉 Yes, it sorts the array without using extra memory.
 * 
 * 📌 Advanced Questions
 * 7️⃣ How many swaps does Selection Sort perform?
 * 👉 Selection Sort performs at most (n - 1) swaps, making it more efficient in
 * terms of swaps than Bubble Sort.
 * 
 * 8️⃣ Why is Selection Sort inefficient for large datasets?
 * 👉 Since Selection Sort runs in O(n²) time, it is slow for large datasets. It
 * is not as efficient as Merge Sort (O(n log n)) or Quick Sort (O(n log n) in
 * average case).
 * 
 * 9️⃣ When is Selection Sort preferred?
 * 👉 Selection Sort is useful when:
 * 
 * The number of swaps must be minimized (e.g., sorting data with limited swap
 * operations).
 * 
 * Small datasets where simplicity is preferred over performance.
 * 
 * 🔟 How does Selection Sort compare with Bubble Sort and Insertion Sort?
 * Algorithm Time Complexity (Best/Worst) Stable? Swaps Count
 * Selection Sort O(n²) / O(n²) ❌ No O(n) (Efficient)
 * Bubble Sort O(n) / O(n²) ✅ Yes O(n²) (High)
 * Insertion Sort O(n) / O(n²) ✅ Yes O(n²) (High)
 * 👉 Selection Sort is better than Bubble Sort but worse than Insertion Sort
 * for nearly sorted arrays.
 * 
 * 📌 Coding Questions
 * 1️⃣ Implement Selection Sort in Java
 * java
 * Copy
 * Edit
 * import java.util.Arrays;
 * 
 * public class SelectionSort {
 * public static void selectionSort(int arr[]) {
 * int n = arr.length;
 * 
 * for (int i = 0; i < n - 1; i++) {
 * int minIndex = i;
 * 
 * for (int j = i + 1; j < n; j++) {
 * if (arr[j] < arr[minIndex]) {
 * minIndex = j;
 * }
 * }
 * 
 * int temp = arr[minIndex];
 * arr[minIndex] = arr[i];
 * arr[i] = temp;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {64, 25, 12, 22, 11};
 * selectionSort(arr);
 * System.out.println(Arrays.toString(arr)); // Output: [11, 12, 22, 25, 64]
 * }
 * }
 * 2️⃣ Modify Selection Sort to Sort in Descending Order
 * 👉 Change arr[j] < arr[minIndex] to arr[j] > arr[minIndex] in the inner loop.
 * 
 * 3️⃣ Find the Kth smallest/largest element using Selection Sort
 * 👉 Run the Selection Sort loop until the Kth smallest or Kth largest element
 * is placed at index K-1 or n-K.
 * 
 * 4️⃣ How can we make Selection Sort stable?
 * 👉 Instead of swapping, shift elements to the right and insert the minimum at
 * the correct position.
 * 
 * 📌 Trick Questions
 * 1️⃣ What is the worst-case scenario for Selection Sort?
 * 👉 The worst case is when the smallest element is always at the end,
 * requiring maximum comparisons.
 * 
 * 2️⃣ Can Selection Sort be optimized?
 * 👉 Selection Sort is not easily optimizable beyond its standard O(n²)
 * complexity.
 * 
 * 3️⃣ Why do we say Selection Sort performs better than Bubble Sort in terms of
 * swaps?
 * 👉 Selection Sort only swaps when necessary, whereas Bubble Sort performs
 * excessive swaps.
 * 
 * 4️⃣ Can Selection Sort be used for Linked Lists?
 * 👉 No, because swapping nodes in a linked list is inefficient. Merge Sort is
 * preferred for linked lists.
 * 
 * 🔥 Final Summary
 * Feature Selection Sort
 * Time Complexity O(n²)
 * Space Complexity O(1)
 * Stable? ❌ No
 * In-Place? ✅ Yes
 * Best for? Small datasets, fewer swaps
 * 💡 Pro Tip
 * 👉 Use Selection Sort when swaps are costly but comparisons are cheap!
 * 👉 For large datasets, use Merge Sort or Quick Sort instead.
 * 
 * 
 */
