/*
Given a number N, the task is to split the Num into multiple parts in such a fashion as to find the highest product. 
Print the highest product value.

Consider N = 4.
Best: 4 = 2 + 2 and 2 * 2 = 4

Similarly for N = 6, (3 * 3) = 9
For N = 8, (2 * 3 * 3) = 18

For N = 15, (3 * 3 * 3 * 3 * 3) = 243
Constraints
1 <= N <= 100

Input format
The candidate has to write the code to accept a non-negative integer number only.

Output format
The output should be a positive integer only.
 */

import java.util.*;
public class HighestProduct {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n = SC.nextInt();
        int max =1;
        while(n>4){
            max = max * 3;
            n = n-3;
        }
        System.out.println(max*n);
        SC.close();
    }
}
