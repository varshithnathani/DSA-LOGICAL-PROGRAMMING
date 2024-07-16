import java.util.*;
public class shortestpath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        solve(str);
        
    }
    public static void solve(String str){
        int x =0;
        int y =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'W'){
                x=x-1;
            }else if(str.charAt(i) == 'E'){
                x = x+1;
            }else if(str.charAt(i) == 'N'){
                y = y+1;
            }else{
                y = y-1;
            }
        }
        int X = x*x;
        int Y = y*y;
        int val = (int)Math.sqrt(X+Y);
        System.out.println(val);
    }
}
