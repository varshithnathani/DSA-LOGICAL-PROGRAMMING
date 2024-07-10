/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Input Format

Integer representing array size
Array having elements
Constraints

1 <= s.length <= 105
Output Format

Reversed string
Sample Input 0

5
h e l l o
Sample Output 0

o l l e h

*/

import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.next().charAt(0);
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}