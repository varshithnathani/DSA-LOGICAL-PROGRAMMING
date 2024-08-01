// Time Complexity = logn
import java.util.*;
public class SearchInsertPositon {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int target = SC.nextInt();
        System.out.println(InsertPositon(arr,target));
    }
    public static int InsertPositon(int[] arr, int target){
        int first =0;
        int last = arr.length-1;
        while(first<=last){
            int mid = first + (last-first) /2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>target)
                last = mid-1;
            else
                first = mid+1;
        }
        return first;
    }

}
