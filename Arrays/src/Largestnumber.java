public class Largestnumber{

  public static int Largest(int number[],int largest,int smallest){
      for (int i = 0; i < number.length; i++) {
        if(largest < number[i]){
            largest=number[i];
        }
        if(smallest > number[i]){
            smallest=number[i];
        }
          
      }
      System.out.println("the smallest value is:"+smallest);
return  largest;
      
     
  }
    public static void main(String[] args) {
       int number[]={1,2,6,7,3,8,9,12,10};
       int largest=Integer.MIN_VALUE;
       int smallest=Integer.MAX_VALUE;
       System.out.println("yhe Largest value is :"+Largest(number,largest,smallest));
   }
}