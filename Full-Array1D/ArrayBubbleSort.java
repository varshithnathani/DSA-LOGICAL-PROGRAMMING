import java.util.*;
public class ArrayBubbleSort {
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
        
        // sort array 
        int temp =0;
        for(int i=0; i<n-1;i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
