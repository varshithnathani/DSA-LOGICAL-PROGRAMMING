import java.util.Scanner;

public class StaircaseProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solve(n));
  }

  public static long solve(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    long[] dp = new long[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}