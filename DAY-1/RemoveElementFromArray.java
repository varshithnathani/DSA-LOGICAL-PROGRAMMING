import java.util.*;
public class RemoveElementFromArray {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("No of Integers:");
        int n = SC.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println("Element to Delete");
        int RemoveElement = SC.nextInt();
        System.out.println("Original Array : "+Arrays.toString(arr));
        
        int[] arr1 = new int[n];
        int j =0;
        for(int i=0; i<n; i++){
            if(arr[i] != RemoveElement){
                arr1[j] = arr[i];
                j++;
            }
        }
        int arr2[] = new int[arr.length-1];
        for(int i=0; i<n-1; i++){
            arr2[i] = arr1[i];
        }

        System.out.println("Updated Array :"+Arrays.toString(arr2));

        SC.close();

    }
}