public class pair_of_array {
    
   public static void pairofarray(int numbers[]) {
    int countofpairs=0;
       for (int i = 0; i < numbers.length; i++) {
        
           int crr=numbers[i];
           for (int j = i+1; j < numbers.length; j++) {
              System.out.print("("  + crr + "," +numbers[j]+")");
               countofpairs++;
           }
           System.out.println("");
           
       }
       System.out.println(countofpairs);
       
   }
    public static void main(String[] args) {
        

        int numbers[]={1,2,3,4,5,6};
        pairofarray(numbers);

    }
}
