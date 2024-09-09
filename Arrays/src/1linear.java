
import java.util.Scanner;


public class linear {
    public static int LInearSearch(int Number[],int key) {
        for (int i = 0; i < Number.length; i++) {
            if(Number[i]==key){
                return i;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Number[]= {1,2,3,4,5,6,7,8,9,10};
        int key=sc.nextInt();
        int index=LInearSearch(Number,key);
        if(index==-1){
              System.out.println("Not Found");
        }else{
              System.out.println("FOUND THE KEY");
        }

        
        
        
         
        
    }
}
