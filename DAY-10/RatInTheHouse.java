import java.util.*;
public class RatInTheHouse {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int r = SC.nextInt(); // r represents no of rats 
        int units = SC.nextInt(); // amount of food required for each rat
        int n = SC.nextInt(); // size of the arr
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int sum = r*units;

        System.out.println(solve(r,units,arr,sum));


    }
    public static int solve(int r, int units, int[] arr, int sum){
        int val =0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            val += arr[i];
            count++;
            if(val >= sum){
                break;
            }
        }
        return count;
    }
}

/*
 * Test case: 
 *  r = 4
 *  units = 2
 *  n = 8
 *  arr = 2 8 3 5 7 4 1 2
 * 
 *  output: 4
 */
