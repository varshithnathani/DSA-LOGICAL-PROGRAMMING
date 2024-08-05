import java.util.*;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialchar = "!@#$%^&*()_+-=";
        String combine = upper+lower+numbers+specialchar;
        char[] pass = new char[n];
        Random r = new Random();
        for(int i=0; i<n; i++){
            pass[i] = combine.charAt(r.nextInt(combine.length()));
        }
        String finalString = new String(pass);
        System.out.println(finalString);
    }
}
