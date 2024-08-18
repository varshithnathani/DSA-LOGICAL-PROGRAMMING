import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int temp =0;
        int[] arr3 = {10,20,30,40};
        System.out.println(Arrays.toString(arr3));
        for(int i=0; i<arr3.length/2; i++){
            temp = arr3[i];
            arr3[i] = arr3[arr3.length-i-1];
            arr3[arr3.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
