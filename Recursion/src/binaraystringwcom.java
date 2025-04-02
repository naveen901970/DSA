public class binaraystringwcom {
    public static void binary_without_combinstions_of_1s(int n, int lastletter,String str) {
        if(n==0){
            System.out.println(str);
            return;
        }

         binary_without_combinstions_of_1s(n-1, 0, str+"0");


         if(lastletter==0){
            binary_without_combinstions_of_1s(n-1, 1, str+"1");
         }
    }


    public static void main(String[] args) {
        binary_without_combinstions_of_1s(4
        , 0,"");
    }
}
