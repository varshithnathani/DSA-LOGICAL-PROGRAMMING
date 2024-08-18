import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}