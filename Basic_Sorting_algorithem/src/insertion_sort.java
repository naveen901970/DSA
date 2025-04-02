
import java.util.Arrays;

public class insertion_sort {
    public static void insertionsort(int arr[]) {
         
        int n=arr.length;
  
      for (int i = 1; i <n; i++) {
          
          int current=arr[i];
          int privious=i-1;
          while(privious>=0&&arr[privious]>current){
            arr[privious+1]=arr[privious];
            privious--;
          }
          arr[privious+1]=current;


      }
  





    }
    public static void main(String[] args) {
        int arr[]={4,3,6,2};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
