import java.util.*;

public class Array2D1 {
    public static void main(String[] args) {

        // Input from user.
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = SC.nextInt();
            }
        }
        int key = SC.nextInt();
        display(matrix, n, m);
        boolean found = keycheck(matrix, n, m, key);
        if(!found){
            System.out.println("Key not found");
        }
        maxval(matrix, n, m);

        SC.close();

    }


    public static void display(int[][] matrix, int n, int m){
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

    public static boolean keycheck(int[][] matrix, int n, int m, int key){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }


    public static void maxval(int[][] matrix, int n, int m){
        int sum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(sum <= matrix[i][j] ){
                    sum = matrix[i][j];
                }
            }
        }
        System.out.println("Max Value :"+sum);
    }

}




