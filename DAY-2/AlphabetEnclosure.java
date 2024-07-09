/*
Maria is teaching her 2 years old Tina English alphabets. Tina likes donuts a lot, and whenever she sees anything which is even a little bit circular, she says donuts. Maria didn't understand in the beginning, but later she got it, that any alphabets which is enclosed shape, is liked by Tina.
Let say A, this has an enclosure of triangle. Then B, it has 2 enclosures. C has no enclosures. D has 1...and so on.
So, now Maria taught Tina a new way, that if she finds any alphabets with enclosures sum up all the enclosures For e.g. the word TINA has only 1 enclosure. The word MARIA has 3 enclosures.
Given a word in all upper case, find the total number of enclosures in the entire word.

Example 1
Input:
HOLLYWOOD  -> Input string, S

Output:
4  -> Output
 */


import java.util.*;
public class AlphabetEnclosure {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        int n = str.length();

        char[] ch = new char[n];
        for(int i=0; i<n; i++){
            ch[i] = str.charAt(i);
        }

        int count=0;

        for(int i=0; i<n; i++){
            if(ch[i]== 'B'){
                count = count+2;
            }
            if(ch[i] == 'D' || ch[i] == 'O' || ch[i] == 'P' || ch[i] == 'Q' || ch[i]== 'R'){
                count++;
            }
        }
        System.out.println(count);
        SC.close();
        
    }
}
