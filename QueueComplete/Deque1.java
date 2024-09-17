package QueueComplete;

import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.add(2);
        dq.addFirst(3);
        dq.addLast(4); // O/P : 3 1 2 4
        dq.add(5);        // O/P : 3 1 2 4 5
        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq);
        
        System.out.println(dq.getFirst()); // Peek()
        System.out.println(dq.getLast());
    }
}
