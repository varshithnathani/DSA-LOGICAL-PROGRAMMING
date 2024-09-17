package QueueComplete;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        solve(q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    public static void solve(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> FirstHalf = new LinkedList<>();
        for(int i =0; i<size/2; i++){
            FirstHalf.add(q.remove());
        }

        while(!FirstHalf.isEmpty()){
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }
}
