import java.util.*;
public class MonotonicArrayList {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        int n=4; // Assuming the length for list will be 4
        for(int i=0; i<n; i++){
            list.add(SC.nextInt());
        }
        int first = list.get(0);
        int second = list.get(1);
        boolean b = false;
        if(first<second){

            for(int i=2; i<n; i++){
                if(list.get(i) - list.get(i-1) >=0){
                    b = true;
                }else{
                    b = false;
                    System.out.println(b);
                    break;
                }
            }
        }
        if(first>second){

            for(int i=2; i<n; i++){
                if(list.get(i-1) - list.get(i) >=0){
                    b = true;
                }else{
                    b = false;
                    System.out.println(b);
                    break;
                }
            }
        }
        if(b == true){
            System.out.println(b);
        }
        SC.close();
    }
}
