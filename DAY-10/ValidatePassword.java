import java.util.*;
public class ValidatePassword {
    static final int min_str_length =8;
    static final int Min_Lower_letter = 5;
    static final int Min_Upper_letter = 1;
    static final int min_int = 1;
    static final int min_special_char=1;
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        String str = SC.nextLine();
        System.out.println(validate(str));
    }
    public static boolean validate(String str){
        int upperCount =0;
        int lowerCount =0;
        int num =0;
        int specialchar =0;
        if(str.length()<min_str_length){
            System.out.println("Length is less than 8"); return false;
        }
        else{
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(Character.isDigit(ch))
                    num++;
                else if(Character.isLowerCase(ch))
                    lowerCount++;
                else if(Character.isUpperCase(ch))
                    upperCount++;
                else
                    specialchar++;

            }
        }
        if(num>= min_int && lowerCount >= Min_Lower_letter && upperCount >= Min_Upper_letter && specialchar >= min_special_char)
            return true;
        else {
            if(num<min_int){
                System.out.println("Min Int violated");
                return false;
            }else if(lowerCount<Min_Lower_letter){
                System.out.println("Min Lower Letter violated");
                return false;
            }else if(upperCount < Min_Upper_letter){
                System.out.println("Min Upper letter violated");
                return false;
            }else if(specialchar < min_special_char){
                System.out.println("Special char violated");
                return false;
            }
        }
        return false;


    }

}
