import java.util.*;

public class OperationsBinaryString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.next();
        System.out.println(solve(str));
    }
    public static int solve(String str){
        int val = str.charAt(0)-'0';
        for(int i=1; i<str.length();){
            char ch = str.charAt(i);
            //System.out.println(ch);
            i++;
            if(ch == 'A'){
                val = val & (str.charAt(i)-'0');
            }else if(ch == 'B'){
                val = val | (str.charAt(i)-'0');
            }
            else{
                val = val ^ (str.charAt(i)-'0');
            }
            i++;
        }
        return val;

    }
}
