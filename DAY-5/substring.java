public class substring {
    public static void main(String[] args) {
        String Str = "Varshith Nathani";
        // In-build
        System.out.println(Str.substring(0,8));

        // Our-own
        int si = 0;
        int ei = 8;
        subString(Str, si, ei);
    }
    public static void subString(String str, int si, int ei){
        String dummy ="";
        for(int i= si; i<ei; i++){
            dummy+= str.charAt(i);
        }
        System.out.println(dummy);
    }
}
