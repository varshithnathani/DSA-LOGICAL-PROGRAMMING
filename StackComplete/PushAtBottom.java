package StackComplete;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        AtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void AtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        AtBottom(s,data);
        s.push(top);
    }
}
