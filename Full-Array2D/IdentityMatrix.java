import java.util.*;
public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        int[][] arr = new int[2][2];
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr[1].length; j++){
                arr[i][j] = SC.nextInt();
            }
        }
        // print the matrix
        for(int k[]: arr){
            for(int m:k){
                System.out.print(m +" ");
            }
            System.out.println();
        }

        
        boolean isIdentity = true;
        for(int i=0; i<arr[0].length; i++){
            for(int j =0; j<arr[1].length; j++){
                if((i==j && arr[i][j] != 1) || (i!=j && arr[i][j] !=0)){ // going with false case
                    isIdentity = false;
                    break;
                }
            }
            if(isIdentity == false)
                break;
        }
        if(isIdentity ==  false)
            System.out.println("Not Identical");
        else
            System.out.println("Identical");

    }
}
