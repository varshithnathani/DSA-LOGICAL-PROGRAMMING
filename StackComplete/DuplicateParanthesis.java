package StackComplete;

import java.util.Stack;

public class DuplicateParanthesis {
    public static void main(String[] args) {
        String str = "((a+b))";

        System.out.println(solve(str));
    }
    public static boolean solve(String str){

        Stack<Character> s = new Stack<>();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            // Closing condition
            // checking for '('
            if(ch == ')'){
                int count = 0;
                while(!s.isEmpty() && s.peek() == '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return  true;
                }
            }else{ // opening case
                s.push(ch);
            }
        }
        return false;
    }

}
