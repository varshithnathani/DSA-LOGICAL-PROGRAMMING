import java.util.*;
public class carry {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num1 = SC.nextInt();
        int num2 = SC.nextInt();
        System.out.println(solve(num1,num2));
    }
    public static int solve(int num1, int num2){
        int carrynum =0;
        int count =0;
        
        while(num1>0 || num2 >0){
            int a = num1%10;
            int b = num2%10;
            if(a+b+carrynum>=10){
                carrynum=1;
                count++;
            }
            else{
                carrynum =0;
            }
            num1 /= 10;
            num2 /=10;
        }
        return count;
    }
}
