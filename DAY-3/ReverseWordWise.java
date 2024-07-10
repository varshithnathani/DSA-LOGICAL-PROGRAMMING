/*
Akhil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.

Input Format

String in a single line
Constraints

0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second
Output Format

Word wise reversed string in a single line
Sample Input 0

Welcome to Face Prep
Sample Output 0

emocleW ot ecaF perP
*/

import java.util.*;
public class ReverseWordWise{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
       
        while(true){
            if(SC.hasNext()){
                StringBuilder str1 = new StringBuilder(SC.next());
                System.out.print(str1.reverse()+" ");
            }else{
                break;
            }
        }
    }
}