public class IncreasingOrder {
    // Recursive method to print numbers from 1 to n
    // static void printNumbers(int current, int n) {
    // if (current > n) {

    // System.out.println("the currecnt number is greter then number");
    // return;

    // }// Base case: stop when current exceeds n

    // System.out.print(current+" ");
    // // Print current number
    // printNumbers(current + 1, n); // Recursive call with next number
    // }

    // public static void main(String[] args) {
    // int n = 5; // Example: print numbers from 1 to 5
    // System.out.println("Numbers in increasing order:");
    // printNumbers(1, n);
    // }
    // printNumbers(1, 5) → printNumbers(2, 5) → printNumbers(3, 5) →
    // printNumbers(4, 5) → printNumbers(5, 5) → printNumbers(6, 5) [Stops]

    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }

        PrintInc(n - 1);
        System.out.print(n + " ");
    }

    public static void PrintDricing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        PrintDricing(n - 1);
    }

    public static void main(String[] args) {
        PrintInc(6);
        System.out.println("");
        System.out.println("======================================");
        PrintDricing(8);
    }
}