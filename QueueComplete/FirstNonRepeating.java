package QueueComplete;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabccxb";
        solve(str);
    }
    public static void solve(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
}
