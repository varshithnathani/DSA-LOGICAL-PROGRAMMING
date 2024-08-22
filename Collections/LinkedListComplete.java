package Collections;
import java.util.*;
public class LinkedListComplete{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add(0,"Varshith");
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            String j = (String) itr.next();
            System.out.println(j);
        }
    }
}
// LINKED LIST & Array list both have same methods

