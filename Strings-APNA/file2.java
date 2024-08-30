import java.time.Year;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        int x = 0;
        int y = 0;

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'W')
                x--;
            else if(ch == 'E')
                x++;
            else if(ch == 'N')
                y++;
            else
                y--;
        }

        int Xsq = x*x;
        int ysq = y*y;

        System.out.println(Math.sqrt(Xsq+ysq));

    }
}
