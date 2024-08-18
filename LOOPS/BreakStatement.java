import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        boolean lucky = false;
        for(int i=0; i<5; i++){
            int n = SC.nextInt();
            if(n == 13){
                lucky = true;
                System.out.println("Lucky Winner");
                break;
            }
        }
        if(!lucky){
            System.out.println("Not lucky");
        }
    }
}
