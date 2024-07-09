

import java.util.*;
public class WordInPatterns {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // no of strings
        String[] strs = new String[n];
        for(int i=0; i<n; i++){
            strs[i] = SC.nextLine();
        }
        SC.nextLine();
        
        String word = SC.nextLine(); // word
        System.out.println(value(strs, word));
        SC.close();
    }
    public static int value(String[] strs, String word){
        int count =0; 
        for(int i=0; i<strs.length; i++){
            if(word.contains(strs[i])){
                count++;
            }
        }
        return count;
    }
}
