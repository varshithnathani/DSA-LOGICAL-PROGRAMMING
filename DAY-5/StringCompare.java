
public class StringCompare {
    public static void main(String[] args) {
        String S1 = "Varshith";
        String S2 = "Varshith";
        String S3 = new String("Varshith");

        if(S1 == S2){
            System.out.println("S1 & S2 Same");
        }else{
            System.out.println("S1 & S2 Not Same");
        }


        if(S1 == S3){ // it will print not same 
            System.out.println("S1 & S3 Same");
        }else{ 
            System.out.println("S1 & S3 Not Same");
        }


        if(S1.equals(S3)){ // It will print same
            System.out.println("S1 & S3 Same");
        }else{
            System.out.println("S1 & S3 Not Same");
        }


        if(S1.equals(S2)){ // Same
            System.out.println("S1 & S2 Same");
        }else{
            System.out.println("S1 & S2 Not Same");
        }
    }    
}
