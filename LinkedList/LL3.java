package LinkedList;
import java.util.*;
public class LL3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Hello");
        list.addFirst("hi,");
        list.addLast("Varshith");
        list.add("...");
        System.out.println(list.size());
        for(String str:list){
            System.out.print(str+" -> ");
        }
        System.out.print("Null");
    }
}
