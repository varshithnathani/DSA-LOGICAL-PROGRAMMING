class ArrayCopy{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        //Type-1
        int[] arr2 = new int[arr1.length];
        arr2 = arr1;
        // in this if arr1 value changes arr2 value also changes.
        arr1[0]++;
        System.out.println("arr1 values");
        for(int k: arr1){
            System.out.print(k+" ");
        }System.out.println();

        System.out.println("arr2 values");
        for(int k: arr2){
            System.out.print(k+" ");
        }System.out.println();
        

        // Type - 2
       //  to avoid these we can use .clone() 
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = new int[arr3.length];
        arr4 = arr3.clone();
        System.out.println("arr3 values");
        for(int k: arr3){
            System.out.print(k+" ");
        }System.out.println();

        arr3[0]++;

        System.out.println("arr3 values");
        for(int k: arr3){
            System.out.print(k+" ");
        }System.out.println();


        System.out.println("arr4 values");
        for(int k: arr4){
            System.out.print(k+" ");
        }System.out.println();



        // Type -3
        // For copy specific index to index we can use .arraycopy
        int[] arr5 = {1,2,3,4,5};
        int [] arr6 = new int[arr5.length];
        System.arraycopy(arr5,2,arr6,0,3);
        System.out.println("arr6 values - copy indedx wise");
        for(int k: arr6){
            System.out.print(k+" ");
        }System.out.println();


    }
}