import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();

        int n = str.length();
        String newStr = "";
        for(int i =0; i<n; i++){
            Integer count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+= str.charAt(i);
            if(count>1){
                newStr+= count.toString();
            }
        }

        System.out.println(newStr);
    }
}
