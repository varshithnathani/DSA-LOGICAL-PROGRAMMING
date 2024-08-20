import java.util.*;
public class KnowledgeStr {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // Enter no of strings in an array
        SC.nextLine();
        String[] names = new String[n];
        for(int i=0; i<n; i++){
            names[i] = SC.nextLine();
        }
        for( String am : names){
            System.out.print(am+" ");
        }
        System.out.println();

        //------------------------------ SORTING STRINGS -------------------------------------------//

        String temp = "";

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(names[j].compareTo(names[j+1]) >0){
                    temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        for(String am: names){
            System.out.print(am+" ");
        }
        System.out.println();

        // ----------------------------- REVERSE STRINGS -------------------------------------------//

        for(int i=0; i<n; i++){
            String temp2 = names[i];
            String dummy = "";
            for(int j=0; j<temp2.length(); j++){
                char ch = temp2.charAt(j);
                dummy = ch+dummy;

            }
            names[i] = dummy;
        }
        for(String am : names){
            System.out.print(am+" ");
        }
        System.out.println();

        
    }
}
