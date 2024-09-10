package StackComplete;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String str = "ABC"; // O/P: CBA

        // Pushing all the characters to stack
        for(int i =0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        // Creating a StringBuilder
        StringBuilder newStr = new StringBuilder();

        // adding all the characters to the stringbuilder using pop();
        while(!s.isEmpty()){
            newStr.append(s.pop());
        }
        System.out.println(newStr);
    }
}
