package QueueComplete;

import java.util.Stack;

public class UsingStacks {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // add
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(s1.isEmpty()){
                return  -1;
            }
            return s1.pop();
        }

        public int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }


        public boolean isEmpty(){
            return s1.isEmpty();
        }
    }
}
