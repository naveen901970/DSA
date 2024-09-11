public class kandanes_sum_subarry {
    public static void kadanemaxsubarray(int  numbers[]) {
      
        int cs=0;
        int Ms=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs=cs+numbers[i];
           
            if(cs<0){
               cs=0;
            }
            Ms=Math.max(cs, Ms);
    
        }
     //When the there is all negative numbers it will work if pasitive also it will work      
    // int cs=numbers[0];
    // int Ms=numbers[0];
    // for (int i = 1; i < numbers.length; i++) {
    //     cs=Math.max(numbers[i], cs+numbers[i]);
    //     Ms=Math.max(cs, Ms);
       
       

    // }
    
        System.out.println("The Maximum sum= "+Ms);
         
     }
    
        public static void main(String[] args) throws Exception {
            int numbers[]={-1,-2,-3,-4,7};
            // maxsubarrays(numbers);
            kadanemaxsubarray( numbers) ;
        }
    }
    

