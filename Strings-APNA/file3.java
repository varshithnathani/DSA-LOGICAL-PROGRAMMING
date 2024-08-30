import java.util.*;
public class file3 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str1 = "hello";  
        String str2 = "hello";
        String str3 = new String("hello"); 

        if(str1 == str2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(str1 == str3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
 
        if(str1.equals(str3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        // SUB STRING

        String str4 = "Hello World!";

        // Our own method for substring 

        substringTest(str4, 4,8); // 8 will not be included


        // Inbuild Sustring provided by the sun microsystems

        System.out.println(str4.substring(4,8));
    }
    public static void substringTest(String str, int n, int m){
        System.out.println();
        for(int i=n; i<m; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
