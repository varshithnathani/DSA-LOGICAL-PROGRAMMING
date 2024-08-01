import java.util.*;
public class LengthofLastWord {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(LastWordLength(str));
    }
    public static int LastWordLength(String str){
        String[] arr = str.split(" ");
        int n = arr.length;
        return arr[n-1].length();
    }
}
