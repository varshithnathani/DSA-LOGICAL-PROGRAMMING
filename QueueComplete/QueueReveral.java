package QueueComplete;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReveral {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        solve(q);
        // System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    public static void solve(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}
