public class AnonymousArray {
    public static void main(String[] args) {
        // creating Anonymous array -- in this it won't have any name so we can't call the array
        // but we can access the data inside the array.
        System.out.println("Display method values -- Anonymous");
        display(new int[] {1,2,3,4});
        int[] m = returnarray();
        System.out.println("Return Method values -- Anonymous");
        for(int k:m){
            System.out.print(k+ " ");
        }System.out.println();

    }
    public static void display(int[] m) {
        for(int k: m){
            System.out.print(k+" ");
        }System.out.println();
        
    }
    public static int[] returnarray(){
        return new int[] {5,6,7,8};
    }
}
