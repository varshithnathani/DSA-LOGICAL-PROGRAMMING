import java.util.*;
public class RomanToInteger{
    public static void main(String[] args){
        Scanner SC= new Scanner(System.in);
        String str = SC.nextLine();
        char[] ch = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            ch[i] = str.charAt(i);
        }
        
        int sum =0;
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'I'){
                sum += 1;
            }else if(ch[i] == 'V'){
                sum += 5;
                    
            }else if(ch[i] == 'X'){
                sum += 10;
            }else if(ch[i] == 'L'){
                sum += 50;
            }else if(ch[i] == 'C'){
                sum += 100;
            }else if(ch[i] == 'D'){
                sum += 500;
                
            }else{
                sum += 1000;
            }
        }
        System.out.print(sum);
    }
}