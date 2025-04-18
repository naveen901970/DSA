
public class print_prime_numbers {

    public static boolean prime(int a) {
       for (int i = 2; i < Math.sqrt(a); i++) {
           if(a%i==0){
            return false;
           }
       }
       return true;
            
    }

    public static void primeinRange(int n) {
        for (int i = 1; i<n; i++) {
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        
    }

    public static void main(String args[]) {
        primeinRange(20);
        
    }

    
}