import java.util.*;
public class BettingGame {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int I = 10;
        int bet =1;
        String str = SC.next();
        int val =I;
        int i;
        for(i=0; i<str.length(); i++) {
            if(bet>I)
                break;
            if(str.charAt(i) == 'W') {
                val +=bet;
                if(bet !=1) {
                    bet = bet/2;
                }
            } else {
                val -=bet;
                bet = bet*2;
            }
        }
        if(i!=str.length()){
            System.out.println(-1);
        }else{
            System.out.println(val);
        }
    }

}