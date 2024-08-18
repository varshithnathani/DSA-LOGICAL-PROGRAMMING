import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        // input of an array
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        // print array
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
