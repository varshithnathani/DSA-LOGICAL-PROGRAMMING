import java.util.*;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String username = SC.nextLine().trim();
        System.out.println("Enter Password");
        String Password = SC.nextLine().trim();        
        System.out.println("Conform Password");
        String repass = SC.nextLine().trim();

        boolean valid = true;

        if(username.isEmpty()){
            System.out.println("Check user name");
            valid = false;
        }
        if(Password.isEmpty()){
            System.out.println("check password");
            valid = false;
        }
        if(repass.isEmpty()){
            System.out.println("check conform password");
            valid = false;
        }
        if(valid){
            if(Password.length()<8)
                System.out.println("Length must be = 8 or > 8");
            else if(Password.contains(username))
                System.out.println("Password should not contain username");
            else if(!Password.equals(repass))
                System.out.println("Conform password & password are different.");
            else
                System.out.println(" Perfect ")
                ;
        }
    }
}
