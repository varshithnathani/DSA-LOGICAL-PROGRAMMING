/*
Given an input string S that contains multiple words, you need to remove all the spaces present in the input string.
There can be multiple spaces present after any word.
Input Format

String s
Constraints

1 <= Length of string S <= 10^6
Output Format

Updated String
Sample Input:

abc def g hi
Sample Output:

abcdefghi

*/

import java.util.*;
public class TrimSpaces{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}