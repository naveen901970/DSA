public class print_subarrays {



    public static void subarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
         // int start=i;
             for(int j=i;j<numbers.length;j++){
                 // int end=j;
                 for (int k = i/*start */; k <=j/*end */; k++) {
                     System.out.print("["+numbers[k]+"]");
                 }
                 System.out.print(" ");
             }
             System.out.println("");
            
        }
    }
     public static void main(String[] args) {
         int number[]={1,2,3,4,5};
         subarrays(number);
     }
 }
