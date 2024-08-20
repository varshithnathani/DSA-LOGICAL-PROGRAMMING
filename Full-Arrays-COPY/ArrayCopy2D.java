public class ArrayCopy2D {
    public static void main(String[] args) {
        int[][] arr = {{1,1},{2,2}};
        int[][] arr2 = new int[arr[0].length][arr[1].length];
        arr2 = arr.clone();
        System.out.println("arr values");
        for(int[] k: arr){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
        System.out.println("arr2 values");
        for(int[] k: arr2){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        // now trying to change the value in arr
        // but it will replicate in b which is not possible in 1D array
        arr[0][0]++;
        arr[0][1]=3;
        System.out.println("arr values - after modification");
        for(int[] k: arr){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
        System.out.println("arr2 values");
        for(int[] k: arr2){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        // To make it possible we have to make DEEP COPY
        int[][] arr3 = {{1,1},{2,2}};
        int[][] arr4 = new int[arr[0].length][arr[1].length];

        for(int i=0; i<arr3.length;i++){
            for(int j=0; j<arr3[i].length;j++){
                arr4[i][j]  = arr3[i][j];
            }
        }
        System.out.println("arr3 values");
        for(int[] k: arr3){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        // modifying arr3 value
        arr3[0][0]++;
        System.out.println("arr3 values - after modification");
        for(int[] k: arr3){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        System.out.println("arr4 values");
        for(int[] k: arr4){
            for(int m: k){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
        
    }
}
