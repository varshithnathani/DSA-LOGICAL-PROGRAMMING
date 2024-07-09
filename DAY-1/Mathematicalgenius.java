/*

Rahul, a mathematical genius will be given a positive number N and he needs to reduce it to 0 (zero) by following operations 

mentioned as under:

Take one of the divisors of N – which is different from N itself and subtract it from N.

Perform the above operation till the original number is reduced to 0 (zero).

The task here is to find the minimum number of steps Rahul needs to perform such that N is reduced to 0 (zero)

Note

If the N is 1 during the operation, then in order to reduce 1 to 0 (zero) subtract 1 from it. 

It is shown in the following examples

Example 1

Input 

5

Output

4

Explanation 

Divisors of 5 are 1, 5 but you cannot subtract 5 so then subtract 1 from 5

The reduced number is 5-1 = 4

Divisors of 4 are 1, 2 and 4 but you cannot subtract 4 so reduce it by 2, after reducing it by 2, number becomes 4 – 2 = 2

Divisor of 2 are 1, 2 and after reducing it by 1, number becomes 2 – 1 = 1

You can subtract 1 by 1 and then the number becomes 0.

So for N = 5, the minimum number of steps are 4.

Example 2

Input 

8

Output 

4

Explanation 

In first step, subtract 4 from 8, number becomes 8 – 4 = 4

In second step, subtract 2 from 4, number becomes 4 – 2 = 2

In third step, subtract 1 from 2, number becomes 2 – 1 = 1

In fourth step, subtract 1 from 1, number becomes 1 – 1 = 0

Example 3

Input

6

Output

4
 */

import java.util.*;
public class Mathematicalgenius{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int count =0; 
        int temp =0;

        while(n>0){
            for(int i=1; i<=n/2; i++){
                if(n%i==0){
                    temp = i;
                }
            }
            n = n-temp;
            count++;
        }
        System.out.println(count);
        SC.close();
    }
} 