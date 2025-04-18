public class bubbelsort {

    public static void bubblesorting(int arr[]) {
        int n=arr.length-1;
        System.out.println(n);
        System.out.print("before sorthing an array:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");

        }
        System.out.println("afther sorthing an arry using the buibble sort:-");
        for (int i = 0; i <n; i++) {

            for (int j = 0; j < n-i ; j++) {
                if (arr[j] > arr[j+1]) {
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 3, 8, 9, 2 };
        bubblesorting(arr);
    }
}
