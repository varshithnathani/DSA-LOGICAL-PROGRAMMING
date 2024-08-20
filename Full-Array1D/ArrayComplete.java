import java.util.*;
public class ArrayComplete {
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

        // linear search in an array
        // search element 20 present or not
        int elementdata = 20;
        boolean ispresent = false;
        for(int k:arr){
            if(k == elementdata){
                ispresent = true;
                System.out.println(elementdata+" Is present");
                break;
            }
        }
        if(ispresent == false){
            System.out.println("Not found");
        }

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


        // display only unique elements in the array
        int[] arr2 = {1,2,2,3,4};
        int j =0;
        for(int i=0; i<arr2.length-1; i++){
            if(arr2[i] != arr2[i+1]){
                j++;
                arr2[j] = arr2[i+1];
            }
        }
        for(int i=0; i<=j; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        // Reverse contentes in an array
        int temp2 =0;
        int[] arr3 = {10,20,30,40};
        System.out.println(Arrays.toString(arr3));
        for(int i=0; i<arr3.length/2; i++){
            temp2 = arr3[i];
            arr3[i] = arr3[arr3.length-i-1];
            arr3[arr3.length-i-1] = temp2;
        }
        System.out.println(Arrays.toString(arr3));


        
    }
}
