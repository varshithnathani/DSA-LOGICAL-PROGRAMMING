/*
 
Given a sentence str. The task is to find whether the given sentence contains all letters of the English alphabet (a to z or A to Z). If it does not, then print all missing letters of the alphabet, otherwise print 0.
Note
All characters in the given sentence should be treated as case insensitive, which means that ‘A’ and ‘a’ are to be treated as the same.
The output should be in alphabetic order
The output should contain only lowercase alphabets
If none of the letters are missing, print 0 as output

Example 1
Input
The four boxing wizard starts over the quickly.
Output
jmp

Explanation
“The four boxing wizard starts over the quickly” does not contain all the letters from ‘a’ to ‘z’ or ‘A’ to ‘Z’ as ‘j’, ‘m’ and ‘p’ are missing.
 */



import java.util.*;
public class MissingLetter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        str = str.toLowerCase();

        int n = str.length();
        char[] ch = new char[n];
        for(int i=0; i<n; i++){
            ch[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(ch));


        for(int i='a'; i<='z'; i++){
            boolean b = false;
            for(int j=0; j<n; j++){
                if(i == ch[j]){
                    b = true;
                }
            }
            if(b == false){
                System.out.println((char)i);
            }
        }
        SC.close();
    }
}
