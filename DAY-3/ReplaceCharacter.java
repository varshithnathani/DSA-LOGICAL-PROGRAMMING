/*
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

Input Format

Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Constraints

1 <= Length of String S <= 10^6
Output Format

Updated string
Sample Input 0

abacd
a x
Sample Output 0

xbxcd
*/
import java.util.*;
public class ReplaceCharacter{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        char ch = SC.next().charAt(0);
        char ch2 = SC.next().charAt(0);
        String newstr = str.replace(ch, ch2);
        System.out.println(newstr);
    }
}