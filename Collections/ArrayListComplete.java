package Collections;
import java.util.*;

public class ArrayListComplete {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("I am ");
        list.add("Varshith");
        for(int i=0; i<list.size(); i++){
            String str = (String)list.get(i);
            System.out.println(str);
        }
        System.out.println();

        // add --index
        list.add(1,"How are u?");
        for(int i=0; i<list.size(); i++){
            String str = (String)list.get(i);
            System.out.println(str);
        }
        System.out.println();

        // remove 
        list.remove(1);
        for(int i=0; i<list.size(); i++){
            String str = (String)list.get(i);
            System.out.println(str);
        }
        System.out.println();

        // clear
        list.clear();
        System.out.println(list.size());

        //isEmpty()
        System.out.println(list.isEmpty());
        System.out.println();

        // contains
        list.add("VARSHITH");
        list.add("Alpha");
        list.add("Beta");

        System.out.println(list.contains("VARSHITH"));
        System.out.println(list.contains("VAMPIRE"));
        System.out.println();

        // indexOd(Object j);
        System.out.println(list.indexOf("VARSHITH"));
        System.out.println(list.indexOf("VAMPIRE")); // Not there so, -1
        System.out.println();

        // lastIndexOf(Object j); 
        System.out.println(list.lastIndexOf("Alpha"));
        System.out.println(list.lastIndexOf("VAMPIRE"));
        System.out.println();

        // clone() --> gives us shallow copy of the arraylist
        ArrayList<String> list2 = (ArrayList<String>) list.clone();
        System.out.println("Cloned data");
        System.out.println();
        for(int i=0; i<list2.size(); i++){
            String str = (String)list2.get(i);
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Enhanced For loop -- Print Data");
        for(String str : list2){
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Iterator for printing data");
        Iterator itr = list2.iterator();
        while(itr.hasNext()){
            String j = (String) itr.next();
            System.out.println(j);
        }
        System.out.println();

        System.out.println("ListIterator for printing data");
        ListIterator<String> itr1 = list2.listIterator();
        while(itr1.hasNext()){
            String j = (String) itr1.next();
            System.out.println(j);
        }
        System.out.println();

        System.out.println("Printing in Reverse Order using Iterator");
        ListIterator<String> itr2 = list2.listIterator(list2.size());
        while(itr2.hasPrevious()){
            String j = (String) itr2.previous();
            System.out.println(j);
        }
        System.out.println();


        System.out.println("Creating new ArrayList using previous");
        // first let me create a new arraylist
        System.out.println("list A");
        System.out.println();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ONE");
        lista.add("TWO");
        lista.add("THREE");
        for(String stra : lista){
            System.out.println(stra);
        }
        System.out.println();

        System.out.println("List B from list A");
        ArrayList<String> listb = new ArrayList<>(lista); // adding previous list name in the bracets
        ListIterator<String> itr4 = listb.listIterator();
        while(itr4.hasNext()){
            String j = (String) itr4.next();
            System.out.println(j);
        }
        System.out.println();

        System.out.println("clear --> listb");
        listb.clear();

        listb.add("TEST1");
        listb.add("TEST2");
        System.out.println("Added Two elements in list b");
        ListIterator<String> itr5 = listb.listIterator();
        while(itr5.hasNext()){
            String j = (String) itr5.next();
            System.out.println(j);
        }
        System.out.println();

        System.out.println("Now using addAll(lista)");
        listb.addAll(lista);
        ListIterator<String> itr6 = listb.listIterator();
        while(itr6.hasNext()){
            String j = (String) itr6.next();
            System.out.println(j);
        }
        System.out.println();

        System.out.println("removeAll(lista)"); // it will remove only lista elements
        listb.removeAll(lista);
        for(String str: listb){
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Curent Listb values");
        for(String str: listb){
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Lets add some more data");
        listb.addAll(lista);
        listb.add("Test4");
        for(String str: listb){
            System.out.println(str);
        }
        System.out.println();

        System.out.println("retainAll(lista)"); // it will stores the lista value, remaining all values will be deleted.
        listb.retainAll(lista);
        for(String str: listb){
            System.out.println(str);
        }
        System.out.println();

        
        System.out.println("Remaining values in listb");
        for(String str: listb){
            System.out.println(str);
        }
        System.out.println();
        

    }
    
}
