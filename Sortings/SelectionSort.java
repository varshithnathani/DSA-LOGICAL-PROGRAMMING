package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        solve(arr,n);
    }
    public static void solve(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j =i+1; j<n-1; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
