import java.util.Scanner;
public class convertUpperCase {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str= SC.nextLine();
        System.out.println(upperCase(str));
    }
    public static StringBuilder upperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }else{
                sb.append(str.charAt(i));
            }
        }
        sb.toString();
        return sb;
    }
}
