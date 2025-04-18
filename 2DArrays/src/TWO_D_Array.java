
import java.util.Scanner;

public class  TWO_D_Array {
    public static boolean SearchtwoDarray(int matrics[][],int key ) {
        for (int i = 0; i < matrics.length ; i++) {
            for (int j = 0; j < matrics[0].length; j++) {
                if(matrics[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void Searchtwoarray_max_min(int matrics[][]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < matrics.length ; i++) {
            for (int j = 0; j < matrics[0].length; j++) {
                if(largest<matrics[i][j]){
                    largest=matrics[i][j];
                }
                if (smallest > matrics[i][j]) {
                    smallest=matrics[i][j];
                }
            }
        }
        System.out.println("the largest element and smallest element in 2D Array is L: "+largest+" S: "+smallest);
    }
    public static void main(String[] args) {
        int matrics[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrics.length;//edhu bhandhu yastu row edhave hantha gothu aguthe
        int m=matrics[0].length;//edhu o^th row nali yastu colume edhave hantha gothu aguthe
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrics[i][j]=sc.nextInt();
            }
            System.out.println("");
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int snn=matrics[i][j];
                System.out.print(snn+" ");
            }
            System.out.println("");
            
        }
        int key=sc.nextInt();
        System.out.println(SearchtwoDarray(matrics ,key));
        Searchtwoarray_max_min(matrics );
    }
}
