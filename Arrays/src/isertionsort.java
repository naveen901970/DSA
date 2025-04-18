public class isertionsort {
    public static void insertions(int sort[]) {
        
        for (int i = 1; i < sort.length; i++) {
            int curr=sort[i];
            int prev=i-1;
          
            while (prev>=0 && sort[prev]>curr) { 
             
                sort[prev+1]=sort[prev];
            
                prev--;
            
            }
            // prev=prev+1;
            sort[prev+1]=curr;
        }
    }//O(n^2);
    public static void main(String[] args) {
        int sort[]={5,1,3,5,6,7,9,10,2,4};
        insertions(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.print("["+sort[i]+"]");
        }
    }
}
