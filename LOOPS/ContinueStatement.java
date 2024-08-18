import java.util.*;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int sum =0;
        for(int i=0; i<5; i++){
            int n = SC.nextInt();
            if(n%2 !=0){
                sum+=n;
            }else{
                continue;
            }

        }
        System.out.println(sum);
    }
}
