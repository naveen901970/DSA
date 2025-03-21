
import java.util.Scanner;

public class search_in_sortedMatrix {


    public static boolean  staircase_search(int matrice[][],int key) {
        int row=0;
        int col=matrice.length-1;
        while(row<=matrice.length && col>=0){
            if(matrice[row][col]==key){
                System.out.println("found the key at ("+row+","+col+")");
                return true;
            }
            if(key<matrice[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                          {32,33,39,50} };
         Scanner sc=new Scanner(System.in);
         int key=sc.nextInt();

            staircase_search(matrix,key)  ;            
   
    }
}
