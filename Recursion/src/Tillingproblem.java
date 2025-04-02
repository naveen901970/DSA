public class Tillingproblem {

    public static int tillingpob(int n) {// 2xn row Xcolume flooe
        if (n == 1 || n == 0) {
            return 1;
        }
        int vertical = tillingpob(n - 1);
        int horizental = tillingpob(n - 2);
        return vertical + horizental;
    }

    public static void main(String[] args) {
        System.out.println(tillingpob(5));
    }
}
/*
 * Visualization (Recursion Tree for tillingpob(5)):
 * Imagine you call tillingpob(5). The recursion tree looks like this:
 * 
 * python-repl
 * Copy
 * Edit
 * tillingpob(5)
 * / \
 * / \
 * tillingpob(4) tillingpob(3)
 * / \ / \
 * tillingpob(3) tillingpob(2) tillingpob(2) tillingpob(1)
 * / \ / \ / \
 * ... ... ... ... ... ...
 * Detailed Breakdown:
 * tillingpob(5):
 * 
 * Calls tillingpob(4) (vertical placement)
 * 
 * Calls tillingpob(3) (horizontal placement)
 * 
 * tillingpob(4):
 * 
 * Calls tillingpob(3)
 * 
 * Calls tillingpob(2)
 * 
 * tillingpob(3):
 * 
 * Calls tillingpob(2)
 * 
 * Calls tillingpob(1)
 * 
 * (Recall: tillingpob(1) returns 1 as a base case)
 * 
 * tillingpob(2):
 * 
 * Calls tillingpob(1) → returns 1
 * 
 * Calls tillingpob(0) → returns 1
 * 
 * So, tillingpob(2) = 1 + 1 = 2.
 * 
 * Now, combining these:
 * 
 * tillingpob(3) = tillingpob(2) + tillingpob(1) =
 * 2
 * +
 * 1
 * =
 * 3
 * 2+1=3.
 * 
 * tillingpob(4) = tillingpob(3) + tillingpob(2) =
 * 3
 * +
 * 2
 * =
 * 5
 * 3+2=5.
 * 
 * Finally, tillingpob(5) = tillingpob(4) + tillingpob(3) =
 * 5
 * +
 * 3
 * =
 * 8
 * 5+3=8.
 * 
 * Thus, the output of tillingpob(5) is 8.
 * 
 * Summary Diagram
 * Here's a simplified diagram showing the recursive calls:
 * 
 * csharp
 * Copy
 * Edit
 * t illingpob(5)
 * / \
 * / \
 * tillingpob(4) tillingpob(3)
 * / \ / \
 * tillingpob(3) tillingpob(2) tillingpob(2) tillingpob(1)
 * ... ... ... (base case)
 */