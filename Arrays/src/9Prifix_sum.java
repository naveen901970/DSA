public class Prifix_sum{
     

    public static void maxsubarrays(int numbers[]) {
       int currsum=0;
       int MAX_VALUE=Integer.MIN_VALUE;
       int prifix[]=new int[numbers.length];
       prifix[0]=numbers[0];
       for (int i = 1; i < prifix.length; i++) {
        prifix[i]=prifix[i-1]+numbers[i];
           
       }
       for (int i = 0; i < numbers.length; i++) {
        for (int j = i; j < numbers.length; j++) {
      currsum=i==0?prifix[j]:prifix[j]-prifix[i-1];
      System.out.print(currsum+" ");
      if(MAX_VALUE<currsum){
        MAX_VALUE=currsum;
    }

        }
    System.out.println("");
}
System.out.print("the Maximum  sum of subarray value is : "+MAX_VALUE);

    }


    public static void main(String[] args) throws Exception {
        int numbers[]={1,-2,6,-1,3};
        maxsubarrays(numbers);
    }



}