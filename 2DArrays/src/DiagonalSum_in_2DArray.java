public class DiagonalSum_in_2DArray{

    public static void Diagonal_sum(int matrice[][]) {
        int psum=0;
        int Dsum=0;
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
        psum+=matrice[i][i];
        Dsum+=matrice[i][matrice.length-1-i];
    }//O(N)
    System.out.println(psum+Dsum);
}
    public static void main(String[] args) {
        int matrice[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        Diagonal_sum(matrice);
    }
}
