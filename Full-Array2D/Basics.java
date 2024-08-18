import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int[][] arr = {{1,2,3} , {4,5,6}};
        // int[][] arr = new int[][];

        System.out.println(arr.length); // gives no.of rows 
        System.out.println(arr[0].length); // gives no.of columns in a row

        // // userinput 
        // int rows = SC.nextInt();
        // int col = SC.nextInt();
        // int[][] arr2 = new int[rows][col];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<col; j++){
        //         arr[i][j] = SC.nextInt();
        //     }
        // }
        // // print 2D array
        // for(int k[]: arr){
        //     for(int m : k){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }

        // ROW SIZE CAN VARY IN 2D-ARRAY
        int[][] arr3 = {{1,2,3,4}, {1,2,3}, {1,2,5,4,3,2}, {1}};
        System.out.println(arr3[0].length);
        System.out.println(arr3[1].length);
        System.out.println(arr3[2].length);
        System.out.println(arr3[3].length);

        // Now cal the sum of all elements in the arr3
        int sum =0;
        for(int[] k: arr3){
            for(int m:k){
                sum+=m;
            }
        }
        System.out.println(sum);
    }
}
