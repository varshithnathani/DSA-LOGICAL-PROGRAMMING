import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int rows = SC.nextInt();
        int columns = SC.nextInt();
        // 2D array user input
        int[][] arr = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = SC.nextInt();
            }
        }
        // Printing the 2d array
        for(int k[]:arr){
            for(int m: k){
                System.out.print(m+" ");;
            }
            System.out.println();
        }

        // creatring another matrix for transpose 
        int[][] transpose = new int[columns][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        // printing transpose matrix
        for(int k[]:transpose){
            for(int m: k){
                System.out.print(m+" ");;
            }
            System.out.println();
        }

    }
}
