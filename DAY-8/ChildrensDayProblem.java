// Dearrangement Problem

import java.util.*;

public class ChildrensDayProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solve(n));
  }

  public static int solve(int n) {
    if (n == 0)
      return 1;
    if (n == 1)
      return 0;
    int dp[] = new int[n + 1];
    dp[0] = 1;
    dp[1] = 0;
    for (int i = 2; i <= n; i++) { 
     dp[i] = (int)((long) (i-1)*(dp[i-1]+dp[i-2])%100000007);
    }
    return dp[n];
  }
}
    