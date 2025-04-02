class Arrayissortedarenot {
    public static boolean arrayisinsortedarenot(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }            
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return arrayisinsortedarenot(arr, i + 1);
    }

    public static int firstaccorenceofarry(int arr[], int key, int i) {
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstaccorenceofarry(arr, key, i + 1);
    }

    public static int lastaccorence(int arr2[], int key, int i, int lastdidit) {
        if (i > arr2.length - 1) {
            return lastdidit;
        }
        if (arr2[i] == key) {
            lastdidit = i;
        }
        return lastaccorence(arr2, key, i + 1, lastdidit);
    }

    public static int lastapna(int arr2[], int key, int i) {
        if (i > arr2.length - 1) {
            return -1;

        }
        int isfound = lastapna(arr2, key, i + 1);
        if (isfound == -1 && arr2[i] == key) {
            return i;

        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int i = 0;
        int arr2[] = { 1, 5, 6, 3, 7, 5, 8, 2, 9, 10 };
        int key = 5;
        int lastdidit = -1;
        System.out.println(arrayisinsortedarenot(arr, i));
        System.out.println(firstaccorenceofarry(arr2, key, i));

        System.out.println(lastaccorence(arr2, key, i, lastdidit));

        System.out.println(lastapna(arr2, key, i));
    }
}
/**
 * This class demonstrates various recursive methods to work with arrays.
 * 
 * Methods:
 * 
 * 1. arrayisinsortedarenot(int arr[], int i)
 *    - Checks whether the given array is sorted in ascending order.
 *    - It recursively compares each element with its next element.
 *    - Base Case: When the last index is reached, returns true.
 *    - If any adjacent pair is out of order, returns false immediately.
 * 
 * 2. firstaccorenceofarry(int arr[], int key, int i)
 *    - Finds the first occurrence of 'key' in the array.
 *    - It recursively checks each element from index i onwards.
 *    - Returns the index of the key when found, otherwise returns -1 if the end is reached.
 * 
 * 3. lastaccorence(int arr2[], int key, int i, int lastdidit)
 *    - Finds the last occurrence of 'key' in the array using an accumulator parameter.
 *    - The accumulator 'lastdidit' stores the latest index where the key was found.
 *    - Recurses through the array updating 'lastdidit' as needed.
 *    - When the end is reached, returns the last recorded index (or -1 if the key was never found).
 * 
 * 4. lastapna(int arr2[], int key, int i)
 *    - An alternative method to find the last occurrence of 'key'.
 *    - It recurses to the end of the array first and then checks while unwinding the recursion.
 *    - If no occurrence was found in deeper recursive calls and the current element is the key,
 *      it returns the current index.
 *    - Otherwise, it returns the index found in the later recursion calls (or -1 if not found).
 * lastapna(arr2, 5, 0)
    └──> calls lastapna(arr2, 5, 1)
           └──> calls lastapna(arr2, 5, 2)
                  └──> calls lastapna(arr2, 5, 3)
                         └──> calls lastapna(arr2, 5, 4)
                                └──> calls lastapna(arr2, 5, 5)
                                       └──> calls lastapna(arr2, 5, 6)
                                              └──> calls lastapna(arr2, 5, 7)
                                                     └──> calls lastapna(arr2, 5, 8)
                                                            └──> calls lastapna(arr2, 5, 9)
                                                                   └──> calls lastapna(arr2, 5, 10)
                                                                         └──> **Base case:** i=10, returns **-1**
 *
 * The main method demonstrates the usage of these methods with example arrays.
 */