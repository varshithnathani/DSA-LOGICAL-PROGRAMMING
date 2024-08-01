import java.util.*;
import java.math.BigInteger;
public class AddBinary {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String s1 = SC.nextLine();
        String s2 = SC.nextLine();
        System.out.println(BinaryString(s1,s2));
    }

    public static String BinaryString(String s1, String s2){
        BigInteger sum = new BigInteger(s1,2).add(new BigInteger(s2,2));
        return sum.toString(2);
    }
}
