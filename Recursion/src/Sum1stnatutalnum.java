public class Sum1stnatutalnum {
    
    public static double  sum1stnatutalnum(int n) {
        if ( n == 1) {

            return 1;
        }
        return n + sum1stnatutalnum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum1stnatutalnum(1));

    }
}
