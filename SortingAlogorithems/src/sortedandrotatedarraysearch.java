
import java.util.Scanner;

public class sortedandrotatedarraysearch {

    public static int Searchingtheindexinarray(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;

        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return Searchingtheindexinarray(arr, target, si, mid - 1);
            } else {
                return Searchingtheindexinarray(arr, target, mid + 1, ei);
            }

        } else {

            if (arr[mid] <= target && target <= arr[ei]) {
                return Searchingtheindexinarray(arr, target, mid + 1, ei);
            } else {
                return Searchingtheindexinarray(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the target number to search in array:-");
        int target = sc.nextInt();
        int index = Searchingtheindexinarray(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("The target index is: |" + index + "|");
        } else {
            System.out.println("Target not found in array.");
        }

    }
}
/*
 * 🔹 Time Complexity
 * Best case (O(1)) → If arr[mid] == target immediately.
 * 
 * Worst case (O(log n)) → Binary search halves the array each time.
 * 
 * 🔹 Explanation of the Code
 * This program searches for a target element in a sorted and rotated array
 * using a modified binary search.
 * 
 * 🔸 Key Observations
 * A sorted and rotated array is an array that was originally sorted but then
 * rotated at some pivot point.
 * 
 * Example: {4,5,6,7,0,1,2,3}
 * 
 * The idea is to find which half is sorted and then determine if the target
 * lies in that half.
 * 
 * 🔹 Steps of the Algorithm
 * Find the middle element (mid):
 * 
 * If arr[mid] == target, return mid.
 * 
 * Check if the left half (arr[si] to arr[mid]) is sorted:
 * 
 * If yes, check if the target is within this half and search there.
 * 
 * Otherwise, search in the right half.
 * 
 * Else, the right half is sorted:
 * 
 * Check if the target is within this half and search there.
 * 
 * Otherwise, search in the left half.
 * 
 * 
 */