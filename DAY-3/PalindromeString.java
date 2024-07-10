/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters.

Input Format

The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Constraints

0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second
Output Format

The only line of output prints either 'true' or 'false'.
Sample Input 0

abba
Sample Output 0

true

*/
import java.util.*;
public class PalindromeString{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.next();
        int left =0;
        int right = str.length()-1;
        boolean b = true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                b = false;
                break;
            }
            left++;
            right--;
        }
        if(b){
            System.out.println(b);
        }else{
            System.out.println("false");
        }
        
    }
}