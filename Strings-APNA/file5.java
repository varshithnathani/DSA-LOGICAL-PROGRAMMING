import java.util.Scanner;

public class file5 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(""); 
        // if we have any string to convert to sb then place it in = new StrignBuilder(str);
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.substring(0,4));
        // converting sb to string --> sb.toString();
        String str = sb.toString();
        System.out.println(str);
       

    }
}
