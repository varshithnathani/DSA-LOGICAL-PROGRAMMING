package StackComplete;

import java.util.Stack;

public class Stockspan {
    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70,60, 85, 100};
        int[] span = new int[stocks.length];

        Span(stocks, span);
        for(int val: span){
            System.out.println(val+" ");
        }
    }
    public static void Span(int[] stocks, int[] span){
        span[0] = 1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i =1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int highPrev = s.peek();
                span[i] = i-highPrev;
            }
            s.push(i);
        }
    }
}
