public class ArrayUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        int j =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                j++;
                arr[j] = arr[i+1];
            }
        }
        for(int i=0; i<=j; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
