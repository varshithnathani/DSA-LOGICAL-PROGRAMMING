package Sortings;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j =0;
        for(int i=0; i<count.length; i++){
           while(count[i] >0){
            arr[j] = i;
            j++;
            count[i]--;
           } 
        }
        System.out.println(Arrays.toString(arr));
    }
}
