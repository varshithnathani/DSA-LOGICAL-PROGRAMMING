import java.util.*;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = SC.nextInt();

        System.out.println("Array Elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }

        boolean hasUnique = false;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=1; j<n; j++){
                if(i != j && arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Unique: " + arr[i]);
                hasUnique = true;
            }
        }

        if(!hasUnique){
            System.out.println("No unique elements found.");
        }

        SC.close();
    }
}