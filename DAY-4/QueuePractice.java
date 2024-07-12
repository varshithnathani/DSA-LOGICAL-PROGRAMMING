import java.util.*;
public class QueuePractice {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();  // Only Homogenioous
        // LinkedList pq = new LinkedList(); // Both Homogenious and Heterogenous
        pq.add(100);
        pq.add(200);
        pq.offer(300);
        pq.offer(400);

        System.out.println(pq);

        // head element 
        //System.out.println(pq.element()); // if pq is empty the it will return exception
        //System.out.println(pq.peek()); // if pq is empty then it will return null

        // Remove the head element
        // System.out.println(pq.remove()); // if pq is empty the it will return exception
        // System.out.println(pq);
        //System.out.println(pq.poll()); // if pq is empty then it will return null




    }
}
