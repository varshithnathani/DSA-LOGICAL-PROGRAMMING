import java.util.*;
public class HashSetPractice {
    public static void main(String[] args) {
        // HashSet list = new HashSet(100);  // capacity =100, default loadfactor =0.75
        // HashSet list = new HashSet(100, (float)0.90) // cap =100, loadfactor = 0.90
        // HashSet<Integer> list = new HashSet();

        HashSet list = new HashSet();

        // add
        list.add("Hello");
        list.add(2024);
        list.add("Varshith");
        list.add(10.12);
        list.add('Z');

        System.out.println("Original HashSet : "+list);

        // remmove
        list.remove("Hello");
        System.out.println("After removing element : "+list);
        System.out.println();

        // addAll
        HashSet list2 = new HashSet();
        list2.addAll(list);
        System.out.println("2nd Hash set - addAll() : "+ list2);

        // remove all
        list2.removeAll(list);
        System.out.println("2nd Hash set - Remove all: "+list2);

        // contains
        System.out.println("Containd - Varshith in List: "+list.contains("Varshith"));

        // contains all
        list2.add("I am");
        list2.add("Varshith");
        list2.add(20);

        System.out.println();
        System.out.println("Hash set 1: "+list);
        System.out.println("Hash set 2 : "+list2);
        System.out.println("ContainsAll() :"+list.containsAll(list2));
        System.out.println();



        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("set-1 :"+set1);
        System.out.println("set-2 :"+set2);

        // Union 
        set1.addAll(set2);
        System.out.println("union- addAll :"+set2);

        // Intersection - retainAll
        // set1.retainAll(set2);
        // System.out.println("Intersection - retainAll() "+ set1);

        // Difference - removeAll
        // set1.removeAll(set2);
        // System.out.println("Difference - removeAll "+ set1);

        // subset -- containsAll()

        
        System.out.println("subset - containsAll  : "+set1.containsAll(set2));
        


    }
}
