/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

Input Format

The first line have the M value
Second line have N value
Third-line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith rows constitutes column values separated by a single space
Constraints

No

Output Format

90 degree Rotated Matrix in single line.
Sample Input 0

3
3
1 2 3
4 5 6
7 8 9
Sample Output 0

7 4 1 8 5 2 9 6 3

*/
import java.util.*;
public class Rotate2DArray{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = SC.nextInt();
            }
        }
        for(int j=0; j<n; j++){
            for(int i=n-1; i>=0; i--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}