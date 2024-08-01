import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // Size of the array
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.print("Before Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        for(int i=0; i<n; i++ ){
            for(int j =0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println();
        System.out.print("After Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}
