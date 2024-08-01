import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int minIndex = -1;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();

        }
        System.out.println("Before Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }

        for(int i=0; i<n-1; i++){
            minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp; 
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
