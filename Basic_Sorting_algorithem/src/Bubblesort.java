
import java.util.Arrays;

public class Bubblesort {
   

    public static void bubblesort(int arr[]) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }
  
    public static void main(String[] args) throws Exception {
       int arr[]={1,2,5,7,3,8,4,9,6};
       bubblesort(arr);
       System.out.println(Arrays.toString(arr));
    }
}
