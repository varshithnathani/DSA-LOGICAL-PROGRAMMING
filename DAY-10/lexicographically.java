import java.util.*;

public class lexicographically {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.next();
        }
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    
}
