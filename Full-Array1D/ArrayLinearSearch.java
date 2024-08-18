import java.util.Scanner;

public class ArrayLinearSearch {
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
    }
}
