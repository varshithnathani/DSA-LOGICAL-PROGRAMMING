import java.util.*;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int sum =0;
        while(n!=0){
            sum += n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
