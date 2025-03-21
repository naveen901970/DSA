public class selectionsort {
    public static void selectionsorts(int arr[]) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++)//elli yakke n-1 madthivi handre last element nali navvu yennu sort madolle eralla
        {
            int minPos= i;
          for (int j = i+1; j < n; j++)//elli yakke n use madthivi handre last number vargu chek madbheku ==mathe i+1 yake use madthivi handre i elemnt mundhe check madudhukke
           {
              if(arr[minPos]>arr[j]){
                     minPos=j;
              }
          }  
          int temp=arr[minPos];
          arr[minPos]=arr[i];
          arr[i]=temp;

        }
    }//O(n^2)
    public static void main(String[] args) {
        int arr[]={5,1,3,6,2,4};
        selectionsorts(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }

    }
}
