public class homeworkproblem {

   static String str11[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "egiht", "nine" };

   public static void accurence_of_key(int arr[], int n, int key) {
      if (n == arr.length) {
         System.out.println("");
         return;
      }

      if (arr[n] == key) {
         System.out.print(n + " ");

      }
      accurence_of_key(arr, n + 1, key);
   }

   public static void To_print_numbers_in_string(int n) {// 2019 two zero one nine
      if (n == 0) {

         return;

      }

      int lastnum = n % 10;
      To_print_numbers_in_string(n / 10);
      System.out.print(str11[lastnum] + " ");
   }

   public static int find_length_of_string(String str) {
      if(str.length()==0){
         return 0;
      }
      return find_length_of_string(str.substring(1))+1;

       
   }

   public static void main(String[] args) {
      int arr[] = { 3, 2, 4, 5, 2, 6, 7, 2, 8 };
      int key = 2;
      accurence_of_key(arr, 0, key);
      To_print_numbers_in_string(2019);
      System.out.println("");
      System.out.println(find_length_of_string("abcd"));
   }
}