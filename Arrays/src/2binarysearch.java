import java.util.Scanner;

public class binarysearch {

public static int  binarysearch(int numbers[],int key) {
    int start=0;
    int end=numbers.length-1;//10-1=9 the number.length it will exact length so array in start from zero os we we have diceares by one
    while(start<=end){
        int mid=(start+end)/2;
        //comparision
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
              start=start+1;
        }else
        {
            end=end-1;
        }
    }
    return -1;

}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,4,5,6,8,10,56,78,123,};
        int key=sc.nextInt();
        int index=binarysearch(numbers, key);
        if(index==-1){
            System.out.println("NOT OF fornd");
        }else{
              System.out.println("Found at"+index);
        }
    }
}
