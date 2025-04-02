class Fibonaccis{
    public static int fibonaccis(int n) {
        if(n==1||n==0)
        return n;
        return fibonaccis(n-1)+ fibonaccis(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonaccis(4));
    }
}
/*fibonaccis(4)
     /            \
    /              \
fibonaccis(3)    fibonaccis(2)
   /      \         /      \
  /        \       /        \
fibonaccis(2) fibonaccis(1) fibonaccis(1) fibonaccis(0)
  /      \
 /        \
fibonaccis(1) fibonaccis(0)
 */