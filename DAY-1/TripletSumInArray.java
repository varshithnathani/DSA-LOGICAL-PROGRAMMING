import java.util.*;

public class TripletSumInArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Size of Array");
        int n = SC.nextInt();
        System.out.println("Array Elements");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println("Sum: ");
        int sum = SC.nextInt();
        boolean check = false;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == sum){
                        System.out.println("Triplets: "+arr[i]+" "+arr[j]+" "+arr[k]);
                        check = true;
                        break;
                    }
                }
            }
        }
        if(check == false){
            System.out.println("No Triplets found in the given array.");
        }
        SC.close();

    }
}
