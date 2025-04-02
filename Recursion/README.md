Recursion in Java is a programming technique where a method calls itself to solve a problem. It is commonly used for problems that can be broken down into smaller, similar subproblems.

Key Concepts:
Base Case - The condition that stops the recursion.

Recursive Case - The part where the function calls itself.

Example: Factorial Calculation
java
Copy
Edit
public class RecursionExample {
// Recursive method to calculate factorial
static int factorial(int n) {
if (n == 0) // Base case
return 1;
return n \* factorial(n - 1); // Recursive call
}

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

}
Output:

csharp
Copy
Edit
Factorial of 5 is: 120
Types of Recursion:
Direct Recursion – A method calls itself directly.

Indirect Recursion – A method calls another method, which eventually calls the original method.

Example: Fibonacci Series
java
Copy
Edit
public class Fibonacci {
static int fibonacci(int n) {
if (n <= 1) // Base case
return n;
return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

}
Advantages of Recursion:
Reduces code complexity for problems like tree traversal, backtracking, etc.

Provides an elegant and logical approach to problem-solving.

Disadvantages:
Can cause StackOverflowError if the recursion depth is too high.

Usually slower than iteration due to function call overhead.

# Would you like to see an example of tail recursion or how to convert recursion into iteration? 🚀

If you want to calculate the 5th Fibonacci number, let's break it down step by step using recursion.

Fibonacci Sequence Formula
F
(
n
)
=
F
(
n
−
1
)

- F
  (
  n
  −
  2
  )
  F(n)=F(n−1)+F(n−2)
  With base cases:

F
(
0
)
=
0
,
F
(
1
)
=
1
F(0)=0,F(1)=1
Recursive Breakdown for Fibonacci(5)
bash
Copy
Edit
fibonacci(5)
├── fibonacci(4)
│ ├── fibonacci(3)
│ │ ├── fibonacci(2)
│ │ │ ├── fibonacci(1) → returns 1
│ │ │ ├── fibonacci(0) → returns 0
│ │ │ └── sum = 1 + 0 = 1
│ │ ├── fibonacci(1) → returns 1
│ │ └── sum = 1 + 1 = 2
│ ├── fibonacci(2)
│ │ ├── fibonacci(1) → returns 1
│ │ ├── fibonacci(0) → returns 0
│ │ └── sum = 1 + 0 = 1
│ └── sum = 2 + 1 = 3
├── fibonacci(3)
│ ├── fibonacci(2)
│ │ ├── fibonacci(1) → returns 1
│ │ ├── fibonacci(0) → returns 0
│ │ └── sum = 1 + 0 = 1
│ ├── fibonacci(1) → returns 1
│ └── sum = 1 + 1 = 2
└── sum = 3 + 2 = **5**
Final Answer
F
(
5
)
=
5
F(5)=5
Java Code
java
Copy
Edit
public class Fibonacci {
static int fibonacci(int n) {
if (n <= 1) // Base case
return n;
return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

}
Output
arduino
Copy
Edit
Fibonacci number at position 5 is: 5
Would you like a loop-based (iterative) solution instead of recursion? 🚀

You said:
3

ChatGPT said:
If you want to calculate Fibonacci(3), let's go step by step.

Fibonacci Formula
F
(
n
)
=
F
(
n
−
1
)

- F
  (
  n
  −
  2
  )
  F(n)=F(n−1)+F(n−2)
  With base cases:

F
(
0
)
=
0
,
F
(
1
)
=
1
F(0)=0,F(1)=1
Recursive Breakdown for Fibonacci(3)
sql
Copy
Edit
fibonacci(3)
├── fibonacci(2)
│ ├── fibonacci(1) → returns 1
│ ├── fibonacci(0) → returns 0
│ └── sum = 1 + 0 = 1
├── fibonacci(1) → returns 1
└── sum = 1 + 1 = **2**
Final Answer
F
(
3
)
=
2
F(3)=2
Java Code
java
Copy
Edit
public class Fibonacci {
static int fibonacci(int n) {
if (n <= 1) // Base case
return n;
return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

}
Output
arduino
Copy
Edit
Fibonacci number at position 3 is: 2
Would you like to see an iterative solution to avoid repeated calculations? 🚀

You said:
4

ChatGPT said:
If you want to calculate Fibonacci(4), let's go step by step.

Fibonacci Formula
F
(
n
)
=
F
(
n
−
1
)

- F
  (
  n
  −
  2
  )
  F(n)=F(n−1)+F(n−2)
  With base cases:

F
(
0
)
=
0
,
F
(
1
)
=
1
F(0)=0,F(1)=1
Recursive Breakdown for Fibonacci(4)
sql
Copy
Edit
fibonacci(4)
├── fibonacci(3)
│ ├── fibonacci(2)
│ │ ├── fibonacci(1) → returns 1
│ │ ├── fibonacci(0) → returns 0
│ │ └── sum = 1 + 0 = 1
│ ├── fibonacci(1) → returns 1
│ └── sum = 1 + 1 = 2
├── fibonacci(2)
│ ├── fibonacci(1) → returns 1
│ ├── fibonacci(0) → returns 0
│ └── sum = 1 + 0 = 1
└── sum = 2 + 1 = **3**
Final Answer
F
(
4
)
=
3
F(4)=3
Java Code
java
Copy
Edit
public class Fibonacci {
static int fibonacci(int n) {
if (n <= 1) // Base case
return n;
return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

}
Output
arduino
Copy
Edit
Fibonacci number at position 4 is: 3
Would you like an optimized version using dynamic programming to improve efficiency? 🚀

Search

Reason
