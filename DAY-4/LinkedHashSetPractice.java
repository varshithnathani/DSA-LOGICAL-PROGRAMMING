import java.util.*;

public class LinkedHashSetPractice {
  public static void main(String[] args) {
    // The only difference b/w HashSet and LinkedHashSet is insertion order
    // In LinkedHashSet insertion order is followed 
    LinkedHashSet lset = new LinkedHashSet();
    //HashSet lset = new HashSet();
    lset.add(100);
    lset.add(200);
    lset.add(300);
    lset.add(400);
    lset.add(500);
    System.out.println(lset);
    
  }  
}
