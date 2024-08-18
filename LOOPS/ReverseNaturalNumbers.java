import java.util.*;
public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        for(int i=n; i>=0; i--){
            System.out.print(i+" ");
        }
    }
}
