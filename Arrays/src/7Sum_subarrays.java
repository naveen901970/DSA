
public class Sum_subarrays {



    public static void subarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
         // int start=i;
             for(int j=i;j<numbers.length;j++){
                 // int end=j;
                 int sum=0;
                 for (int k = i/*start */; k <=j/*end */; k++) {
                    
                    sum=sum+numbers[k];
                   
                 }
                 System.out.print("["+sum+"]");
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