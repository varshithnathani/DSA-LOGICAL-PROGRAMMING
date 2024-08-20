import java.util.*;
public class ArrayStrings2D {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String[][] arr = new String[2][2];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter Data");
                arr[i][j] = SC.nextLine();
            }
        }System.out.println();
        for(String[] k: arr){
            for(String m: k){
                System.out.print(m+ " ");
            }System.out.println();
        }
        System.out.println();

        System.out.println("Enter search element");
        // search element in strings
        String search = SC.nextLine();
        boolean found = false;
        for(String[] k: arr){
            for(String m: k){
                if(m.equals(search)){
                    System.out.println("Found");
                    found = true;
                    break;

                }
            }System.out.println();
        }
        if(!found){
            System.out.println("No found");
        }
        
    }
}
