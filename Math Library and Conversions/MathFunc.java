import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class MathFunc {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n1 = SC.nextInt(), n2 = SC.nextInt();
        // max
        System.out.println("Max : "+ Math.max(n1,n2));
        // min
        System.out.println("Min : "+Math.min(n1,n2));
        // power       -- values has to be double even if we give int also it will type converted
        System.out.println("Power : "+ Math.pow(n1,n2)); // here it will print val in double 
        // sqrt
        System.out.println("Sqrt : "+Math.sqrt(144));
        // ceil -- nearest heighest value
        System.out.println("Ceil : "+Math.ceil(101.234));
        // Floor -- nearest lowest value
        System.out.println("Floor : "+ Math.floor(101.234));
        // Round -- rounding to nearest value
        System.out.println("Round : "+ Math.round(101.2345)); // 101
        System.out.println("Round : "+ Math.round(101.54321)); // 102
        // double num = 101.12345;
        // System.out.println("Round : "+ Math.round(num*100.0)/100.0); // round to 2 decimal points 
        System.out.println("Round : "+ Math.round((101.12345)*100.0)/100.0); // round to 2 decimal points 

        // if it needed to round for 3 decimal points then use 1000.0
        
        // Random
        System.out.println(Math.random()); // val in b/w 0.0 to 1
        
        Random rand = new Random();
        int dummy = rand.nextInt(); // random value will be generated
        int dummy2 = rand.nextInt(599); // random value will be generated with in the range of 599
        System.out.println(dummy);
        System.out.println(dummy2);

        
    
    }
}
