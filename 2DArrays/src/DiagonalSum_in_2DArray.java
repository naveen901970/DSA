public class DiagonalSum_in_2DArray{

    public static void Diagonal_sum(int matrice[][]) {
        int primarysum=0;
        int Diagonalsum=0;
        // for (int i = 0; i < matrice.length; i++) {
        //     for (int j = 0; j < matrice[0].length; j++) {
        //                if(i==j){
        //                 psum+=matrice[i][j];
        //                }
        //                if(j+i==matrice.length-1){
        //                      Dsum+=matrice[i][j];
        //                }
        // }
      
        
    //}O(n^2)we can reduce the time complexcity
    for (int i = 0; i < matrice.length; i++) {
        primarysum+=matrice[i][i];
        Diagonalsum+=matrice[i][matrice.length-1-i];
    }//O(N)
    System.out.println(primarysum+Diagonalsum);
}
    public static void main(String[] args) {
        int matrice[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        Diagonal_sum(matrice);
    }
}
