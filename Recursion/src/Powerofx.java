
import java.util.Scanner;

public class Powerofx {
    public static int powerofsearch(int x,int n) {
        if(n==0){
            return 1;
        }
        return  x*powerofsearch(x, n-1);
    }
    public static int inoptimize(int x,int n) {
      if(n==0){
        return 1;
      }
      int pow=n/2;
      int ans=inoptimize(x, pow);
       if(n%2==0){
        return ans*ans;
       }else{
        return 2*ans*ans;
       }
    }



    public static int apnaoptimaization(int x,int n) {
        if(n==0){
            return 1;
        }
        int halfpower=apnaoptimaization(x,n/2)*apnaoptimaization(x,n/2);
        if(n%2!=0){
            return x*halfpower;

        }  
        return halfpower;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:-");
        int x=sc.nextInt();
        System.out.println("please enter the power of x:-");
        int n=sc.nextInt();
        System.out.println(powerofsearch(x, n));
        System.out.println(inoptimize(x, n));

    }
}


/*1. Naive Recursion (powerofsearch)
Theory:
Approach:
The function powerofsearch(x, n) computes 
x
n
x 
n
  by multiplying 
x
x with the result of 
x
(
n
−
1
)
x 
(n−1)
 .
Base case: 
n
=
=
0
n==0 returns 1 (because 
x
0
=
1
x 
0
 =1).
Recursive step: 
x
n
=
x
×
x
(
n
−
1
)
x 
n
 =x×x 
(n−1)
 .

Time Complexity:

This method makes n recursive calls, so its time complexity is O(n).

Visualization (Recursion Tree):
Imagine you call powerofsearch(x, 4):

scss
Copy
Edit
powerofsearch(x, 4)
         │
         └──> returns x * powerofsearch(x, 3)
                   │
                   └──> returns x * powerofsearch(x, 2)
                             │
                             └──> returns x * powerofsearch(x, 1)
                                       │
                                       └──> returns x * powerofsearch(x, 0)
                                                 │
                                                 └──> returns 1  (base case)
In this linear chain, the recursion goes 4 levels deep (for 
n
=
4
n=4).

2. Optimized Exponentiation by Squaring (inoptimize)
Theory:
Approach:
This method uses the idea of exponentiation by squaring, which reduces the number of multiplications by splitting the exponent:

For an even exponent (
n
n even):

x
n
=
(
x
n
2
)
2
x 
n
 =(x 
2
n
​
 
 ) 
2
 
For an odd exponent (
n
n odd):
The standard formula is:

x
n
=
x
×
(
x
n
2
)
2
x 
n
 =x×(x 
2
n
​
 
 ) 
2
 
Note: Your code uses 2 * ans * ans for the odd case. Typically, it should be x * ans * ans to correctly compute 
x
n
x 
n
 . (Keep this in mind when comparing methods.)

Time Complexity:

This method only makes about O(log n) recursive calls since each call halves the exponent.

Visualization (Recursion Tree):
Let’s consider inoptimize(x, 5) (assuming the odd-case should use x * ans * ans):

scss
Copy
Edit
inoptimize(x, 5)
         │
         └──> Compute: half = inoptimize(x, 5/2)  → inoptimize(x, 2)
                   │
                   └──> Compute: half = inoptimize(x, 2/2)  → inoptimize(x, 1)
                             │
                             └──> Compute: half = inoptimize(x, 1/2)  → inoptimize(x, 0)
                                       │
                                       └──> Base case: returns 1
                             │
                             └──> For n = 1 (odd): returns x * 1 * 1  → returns x
                   │
                   └──> For n = 2 (even): returns (x)^2
         │
         └──> For n = 5 (odd): returns x * (result from n=2)^2
Here, the depth of recursion is about 
log
⁡
2
(
n
)
log 
2
​
 (n).

3. Inefficient Exponentiation by Squaring (apnaoptimaization)
Theory:
Approach:
The function apnaoptimaization(x, n) also aims to use exponentiation by squaring. However, it calls the recursive function twice for the same subproblem:

java
Copy
Edit
int halfpower = apnaoptimaization(x, n/2) * apnaoptimaization(x, n/2);
This duplication causes redundant calculations and increases the work done.

Time Complexity:

Due to the redundant calls, the time complexity is much worse than O(log n). In the worst case, it could approach O(2^(log n)) = O(n), though the exact cost depends on overlapping subproblems.

Visualization (Redundant Recursion Tree):
For apnaoptimaization(x, 4), the recursion tree looks like this:

markdown
Copy
Edit
apnaoptimaization(x, 4)
         /              \
        /                \
apnaoptimaization(x,2)   apnaoptimaization(x,2)
    /        \                /       \
   ...       ...             ...       ...
Each call to apnaoptimaization(x, 2) is computed twice even though they are the same. This duplication makes the tree wider and less efficient.

Summary & Revision Points
Naive Recursion (powerofsearch):

Simple and clear: 
x
n
=
x
×
x
(
n
−
1
)
x 
n
 =x×x 
(n−1)
 .

Drawback: Linear recursion, making it inefficient for large 
n
n.

Optimized Exponentiation (inoptimize):

Key Idea: Use exponentiation by squaring to halve the exponent at each step.

Efficiency: Reduces recursive calls to O(log n).

Caveat: Check that the odd case returns x * ans * ans (not 2 * ans * ans).

Inefficient Optimization (apnaoptimaization):

Concept: Tries to use exponentiation by squaring.

Problem: Redundant recursive calls lead to duplicate work.

Lesson: Always store the result of the recursive call if it will be used more than once.

Graphical Diagram (Combined View)
Below is a simplified diagram comparing the two main approaches:

sql
Copy
Edit
                +----------------------+
                |   powerofsearch(x, n)|
                +----------------------+
                         │
                  Linear recursion
                         │
                [n recursive calls: O(n)]
                         │
                        ...
                         │
                powerofsearch(x,0)=1
                         
           -----------------------------------
           |                                 |
           V                                 V
+-------------------------+       +--------------------------+
|   inoptimize(x, n)      |       | apnaoptimaization(x, n)  |
+-------------------------+       +--------------------------+
           │                                 │
   Uses exponentiation               Redundant recursive calls
       by squaring                     (calls same subproblem twice)
           │                                 │
   [O(log n) recursive calls]       [Worse performance than O(log n)]
           │                                 │
       Correct odd case:                 Inefficient computation
       x * ans * ans (should be)
Conclusion
Understanding different recursive methods for exponentiation helps you see:

How optimizations reduce the number of computations (from O(n) to O(log n)).

Why it's important to avoid redundant work by reusing computed results.

These concepts are not only vital for exponentiation but are also a great example of how algorithmic thinking improves performance in many recursive problems.

Would you like any further clarification or additional visual diag */
