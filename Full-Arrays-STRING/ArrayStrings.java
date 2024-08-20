
import java.util.*;
public class ArrayStrings {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // no of strings 
        SC.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter name: ");
            arr[i] = SC.nextLine();
        } 
        System.out.println("Search name");
        String search = SC.nextLine();
        boolean found = false;
        for(String names: arr){
            if(names.equals(search)){
                System.out.println("Found");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Not found");
        }

    }
}
