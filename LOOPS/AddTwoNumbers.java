import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        boolean isTrue = true;
        do{
            int n1 = SC.nextInt();
            int n2 = SC.nextInt();
            int sum = n1+n2;
            System.out.println("Sum :"+sum);
            System.out.println("Press 0- continue || press 1-Exit");
            int val = SC.nextInt();
            if(val ==1){
                isTrue = false;
            }
        }while(isTrue);
    }
}
