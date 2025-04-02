public class Frindspairing {

    public static int pairingfrinds(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairingfrinds(n - 1) + (n - 1) * pairingfrinds(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairingfrinds(1
        ));
    }

    /*
     * Explanation of the Friends Pairing Problem
     * This problem calculates the number of ways n friends can either stay single
     * or pair up. The solution follows a recursive approach based on two choices
     * for each friend:
     * 
     * Stay Single: If a friend remains single, the problem reduces to f(n-1).
     * 
     * Pair Up: If a friend pairs with any one of the remaining (n-1) friends, then
     * the remaining (n-2) friends still need to be paired, contributing (n-1) *
     * f(n-2) ways.
     * 
     * Thus, the recurrence relation is:
     * f(n) = f(n−1) + (n−1) × f(n−2)
     * 
     * where:
     * 
     * f(n−1) represents the case where the n-th friend stays single.
     * 
     * (n−1) × f(n−2) represents the case where the n-th friend pairs up with one of
     * the (n-1) friends.
     * 
     * Base Cases
     * If there is only one friend (n=1), there is only 1 way (he stays alone):
     * f(1) = 1
     * 
     * If there are two friends (n=2), they can either:
     * 
     * Stay single: (1, 2)
     * 
     * Pair up: (12)
     * So, there are 2 ways:
     * f(2) = 2
     * 
     * Step-by-Step Execution for n=5
     * We compute:
     * 
     * Compute f(3)
     * f(3) = f(2) + 2 × f(1) = 2 + 2 × 1 = 2 + 2 = 4
     * 
     * Compute f(4)
     * f(4) = f(3) + 3 × f(2) = 4 + 3 × 2 = 4 + 6 = 10
     * 
     * Compute f(5)
     * f(5) = f(4) + 4 × f(3) = 10 + 4 × 4 = 10 + 16 = 26
     * 
     * So, the output for pairingfrinds(5) is 26, meaning there are 26 ways to
     * arrange 5 friends.
     * 
     * Recursive Call Breakdown
     * Let’s visualize the function calls:
     * 
     * scss
     * Copy
     * Edit
     * pairingfrinds(5)
     * ├── pairingfrinds(4)
     * │ ├── pairingfrinds(3)
     * │ │ ├── pairingfrinds(2) → 2
     * │ │ ├── pairingfrinds(1) → 1
     * │ │ └── Result: 4
     * │ ├── pairingfrinds(2) → 2
     * │ └── Result: 10
     * ├── pairingfrinds(3)
     * │ ├── pairingfrinds(2) → 2
     * │ ├── pairingfrinds(1) → 1
     * │ └── Result: 4
     * └── Result: 26
     * Each function call breaks down into smaller calls until it reaches n=1 or
     * n=2, which are the base cases.
     * 
     * Final Answer
     * For n=5, the number of ways friends can either stay single or pair up is 26.
     * 
     * Would you like a graphical representation of this recursion tree
     */

}
