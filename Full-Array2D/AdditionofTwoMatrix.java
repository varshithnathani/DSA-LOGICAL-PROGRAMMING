public class AdditionofTwoMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] arr3 = new int[3][3];
        for(int i=0; i<arr3[0].length; i++){
            for(int j=0; j<arr3[1].length; j++){
                arr3[i][j] = arr[i][j]+arr2[i][j];
            }
        }
        for(int k[]:arr3){
            for(int m:k){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }   
}
