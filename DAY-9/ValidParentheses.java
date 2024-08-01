import java.util.*;
class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch =='{'|| ch=='['){
                list.push(ch);
            }else {
                if(list.isEmpty())
                    return false;
                char ch2 = list.pop();
                if(ch == ')' && ch2!='(' || ch==']' && ch2!= '[' || ch=='}' && ch2!='{')
                    return false;

            }
        }
        return list.isEmpty();
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String s = SC.nextLine();
        System.out.println(isValid(s));
    }
}