public class JaggedArray {
    public static void main(String[] args) {
        // jagged array -- memeber of the array can be different size

        int[][] matrix = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
        for(int [] k: matrix){
            for(int m: k){
                System.out.print(m+ " ");
            }System.out.println();
        }
        // sum of the rows: 
        sum(matrix);

        System.out.println("another way of creating the jagged array");
        int[][] matrix2 = new int[4][];
        matrix2[0] =new int[] {9,9,9,9};
        matrix2[1] = new int[] {8,8,8,8};
        matrix2[2] = new int[] {3,3};
        matrix2[3] = new int[] {1,1,1};
        for(int [] k: matrix2){
            for(int m: k){
                System.out.print(m+ " ");
            }System.out.println();
        }


    }
    public static void sum(int[][] matrix){
        int sumval =0;
        for(int[] k: matrix){
            for(int m: k){
                sumval+=m;
            }
            System.out.println("Sum of rows: "+ sumval);
            sumval = 0;
        }System.out.println();

    }
}
