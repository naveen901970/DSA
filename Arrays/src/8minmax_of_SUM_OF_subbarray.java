public class minmax_of_SUM_OF_subbarray {
    


    public static void subarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
           
              int MIN_VALUE=Integer.MAX_VALUE;
              int MAX_VALUE=Integer.MIN_VALUE;
             for(int j=i;j<numbers.length;j++){
                 
                 int sum=0;
                 for (int k = i/*start */; k <=j/*end */; k++) {
                    
                    sum=sum+numbers[k];
                   
                 }
                if(MAX_VALUE<sum){
                    MAX_VALUE=sum;
                }
                if(MIN_VALUE > sum){
                    MIN_VALUE=sum;
                }
                 
                
             }
             System.out.print("mininum value: "+MIN_VALUE+"  maxmium value : "+MAX_VALUE);

             System.out.println("");
            
        }
    }
     public static void main(String[] args) {
         int number[]={1,2,3,4,5};
         subarrays(number);
     }
}
