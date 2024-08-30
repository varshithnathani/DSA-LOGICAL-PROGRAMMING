import java.util.*;
public class file1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        // Complete Line input
        String str = SC.nextLine();
        // Single Word Input
        String str2 = SC.next();
        // Concatination  of two strings
        String str3 = str + str2;
        System.out.println();
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        System.out.println("CharAt(0) from str2");
        System.out.println(str2.charAt(0));
        // length of the string
        int len = str.length();
        System.out.println("Length of str: "+ len);
    }
}
