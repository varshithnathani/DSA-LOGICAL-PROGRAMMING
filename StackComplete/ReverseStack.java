package StackComplete;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        // Take user input until -1 and then reverse the stack

        Scanner SC = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();

        // Taking User Input till -1
        while(true){
            int num = SC.nextInt();
            if(num == -1){
                break;
            }else {
                s.push(num);
            }
        }

//        while(!s.isEmpty()){
//            System.out.println(s.pop());
//       }

        // Creating another stack
        Stack<Integer> s2 = new Stack<>();

        while(!s.isEmpty()){
            s2.push(s.pop());
        }

        while(!s2.isEmpty()){
            System.out.println(s2.pop());
        }
    }
}
