public class spial_Matrixce {
    public static void spiral_matrix(int matrice[][]) {
        int start_row=0;
        int end_row=matrice.length-1;
        int end_col=matrice.length-1;
        int start_col=0;
        while(start_row<=end_row && start_col<=end_col){
            for (int j= start_col;  j <=end_col;  j++){
                System.out.print("["+matrice[start_row][j]+"]"+" ");
            }
            for (int i = start_row+1; i <=end_row; i++) {
                  System.out.print("["+matrice[i][end_col]+"]"+" ");
            }
            for (int j = end_col-1; j >=start_col; j--) {
                if(start_col==end_col){
                    break;
                }
                  System.out.print("["+matrice[end_row][j]+"]"+" ");
            }
            for (int i =end_row-1; i>=start_row+1; i--){
                if(end_row==start_row){
                    break;
                }
                System.out.print("["+matrice[i][start_col]+"]"+" ");
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
        System.err.println("");
    }
    public static void main(String[] args) {
        int matrice[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        spiral_matrix(matrice);
    }
}
