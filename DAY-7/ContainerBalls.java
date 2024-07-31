import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 3;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        for(int i=4; i<=n; i++){
            arr[i] = arr[i-1]+arr[i-3];
        }
        return arr[n];
    }
}