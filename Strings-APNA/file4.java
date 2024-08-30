import java.util.Scanner;


// Longest String in an array suing lexographical Order
public class file4{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        SC.nextLine();
        String[] names = new String[n];
        for(int i =0; i<n; i++){
            names[i] = SC.nextLine();
        }


        /*
         * str1.compareTo(str2);
         * 0: equal
         * <0 : str1< str2
         * >0 : str1 > str2
         */
        String largest = names[0];
        for(int i=0; i<n; i++){
            if(largest.compareTo(names[i])<0){
                largest = names[i];
            }
        }
        System.out.println(largest);
    }
}