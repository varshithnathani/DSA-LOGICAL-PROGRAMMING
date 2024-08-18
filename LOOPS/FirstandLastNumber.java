import java.util.*;
public class FirstandLastNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); 
        int lastNum = n%10;
        int firstNum =0 ; 
        while(n!=0){
            firstNum = n;
            n/=10;

        } 
        System.out.println("First Number : "+firstNum + " Last Number : "+lastNum);

    }
}
