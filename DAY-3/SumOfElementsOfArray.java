/*
For a given two-dimensional integer array/list of size (N x M), print the sum of all the elements of 2d array
Input Format

The first line have the M value
Second line have N value
Third-line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith rows constitutes column values separated by a single space
Constraints

1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Output Format

Sum of all elements in the array
Sample Input 0

2
2
1 2
3 4
Sample Output 0

10
*/

import java.util.*;
public class SumOfElementsOfArray{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int m = SC.nextInt();
        int sum =0;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = SC.nextInt();
                
            }
        }
         for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
               sum+= arr[i][j];
                
            }
        }
        System.out.println(sum);
    }
}