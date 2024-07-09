/*
An English teacher wants the overall development of the students. She plans a surprise quiz to test the analytical skills of the students. She gives two words (str1,str2), the task for the students here is:
Observe both the words carefully. Change the word1 to word2.
The student who can change the words with a minimum number of steps is the winner.

Note:
Only of the operations – insert, delete or replace can be performed in one step.
All the operators should be performed only on word1. The string cannot have any special characters, space or number.

Constraints:
Str1={a-z)
Str1 != (A-Z0-9,special characters)
No spaces between characters
Size of Str1 and Str2<50
Input format for testing
The candidate has to write the code to accept 2 input(s).
First Input - Accept value str1 which is a string.
Second Input -Accept value str1 which is a string.

Output format for testing
The output should be a single integer value or a message if given in the problem statement (Check the output in Example 1. Example 2)
Additional messages in output will cause the failure of test cases.

Example 1
Input:
Capture -> value of str 1
Capsule -> value of str 2

Output:
2-> number of steps required to convert str 1 to str 2

Explanation:
To convert capture to capsule in
Step 1: 't' is replaced with ‘s’(capsure)
Step 2: 'r' is replaced with ‘l' (capsule)
Hence, the output is 2.
 */

import java.util.*;

public class MinNumberSteps {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String s1 = SC.next();
        String s2 = SC.next();
        int count =0;
        int len1 = s1.length();
        int len2 = s2.length();
        int val = Math.abs(len1-len2);
        int minlen = Math.min(len1,len2);
        for(int i=0; i<minlen; i++){
          if(s1.charAt(i) != s2.charAt(i)){
            count++;
          }
        }
        count += val;
        System.out.println(count);
        SC.close();
      }
}
