import java.util.*;
public class LinkedListPractice {
    public static void main(String[] args) {
        // creation of linked list

        // LinkedList<Integer> list = new LinkedList<>();
        // LinkedList<Integer> list = new LinkedList();

        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add(2024);
        list.add('A');
        list.add(20.0);

        System.out.println(list);

        // removing a element from list
        list.remove(2);
        System.out.println("After Removing an element "+list);
        System.out.println();

        // Add All
        LinkedList dummy = new LinkedList();
        dummy.addAll(list);
        System.out.println("Add All to Dummy list: "+ dummy);
        // removeAll
        dummy.removeAll(list);
        System.err.println("After  removing all elements "+dummy);

        //list.clear();
        //System.out.println(list); o/p : []

        System.out.println("List linegth :"+list.size());
        System.out.println();

        System.out.println("Contains : 100 "+list.contains(100));
        System.out.println();

        // contains all
        LinkedList list2 = new LinkedList();
        list2.add("Alpha");
        list2.add("Delta");
        list2.add(10);
        System.out.println("To check contains all we need 2 lists");

        System.out.println("1st List: "+list);
        System.out.println("2nd List "+ list2);
        System.out.println("Contains All: "+ list.containsAll(list2));
        System.out.println();

        // sort
        LinkedList newList = new LinkedList();
        newList.add('D');
        newList.add('A');
        newList.add('Z');
        newList.add('Q');

        System.out.println();
        System.out.println("New List        : "+ newList);
        // sort
        Collections.sort(newList);
        System.out.println("Soreted List    : "+newList);
        // reverse sort / decending order
        Collections.sort(newList, Collections.reverseOrder());
        System.out.println("Reverse Order   : "+ newList);
        // shuffle
        Collections.shuffle(newList);
        System.out.println("Shuffle list    : "+ newList);
        System.out.println();
        System.out.println();


        // addFirst() & addLast()
       
        Collections.sort(newList);
        System.out.println("Original List       : "+newList);
        newList.addFirst('X');
        System.out.println("After Add First     : "+newList);
        newList.addLast('Y');
        System.out.println("After Add Last      : "+newList);

        // getFirst() & getLast()
        System.out.println();
        System.out.println("Orginal List        : "+ newList);
        System.out.println("getFirst()      : "+ newList.getFirst());
        System.out.println("getLast()       : "+ newList.getLast());
        System.out.println();


        // removeFirst() & removeLast()
        System.out.println("Original List :"+ newList);
        newList.removeFirst();
        System.out.println("After remvoing first element : "+ newList);
        newList.removeLast();
        System.out.println("After removing Last element : "+ newList);

        // retainAll()
        list.add('A');
        System.out.println(newList);
        System.out.println(list);
        newList.retainAll(list);
        System.out.println("After retain all : "+newList);






    }
}
