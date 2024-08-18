import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+ i+" = "+ n*i);
        }
    }
}
