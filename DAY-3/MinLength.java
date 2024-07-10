/*
Find the minimum length word from the input string
Input Format

The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Constraints

0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second
Output Format

Print the minimum word from the input string
Sample Input 0

this is mine
Sample Output 0

is
Sample Input:
hello world its me

Sample Output:
me

*/

import java.util.*;
public class MinLength{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        String[] arr = str.split(" ");
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(arr[i].length(), min);
        }
        //System.out.println(min);
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() <= min){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}