package StackComplete;

import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[n];

        // Initialize all elements in nextGreater array to -1
        for (int i = 0; i < n; i++) {
            nextGreater[i] = -1;
        }

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Stack --> Not Empty
            // Peek <= arr[i]       // until then pop()
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if stack is not empty then enter the nextGreater value
            if (!s.isEmpty()) {
                nextGreater[i] = arr[s.peek()];
            }

            // push into the stack
            s.push(i);
        }

        // Print
        for (int val : nextGreater) {
            System.out.print(val + " ");
        }
    }
}
