public class PassbyReference {
    public static void main(String[] args) {
        int[] m = {1,2,3};
        changevalue(m);
        for(int a: m){
            System.out.print(a+ " ");
        }System.out.println();
    }
    public static void changevalue(int[] k){
        k[1] = 99;

    }
}
