import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Creating of array list
        
        // ArrayList al = new ArrayList();
        // list al = new ArrayList();
        //ArrayList<Integer> al = new ArrayList<Integer>();
        // ArrayList<Integer> al = new ArrayList<>();

        ArrayList list = new ArrayList();

        // adding new data
        list.add("Give me ");
        list.add(100);
        list.add('$');
        list.add(11.4);
        list.add(1);

        System.out.println(list);
        System.out.println();

        // removing data from the Arraylist

        list.remove(1); // Here 1 means index
        list.remove("Welcome"); // Here it delete element
        System.out.println("After removing" + list);


        // to find the length of the list
        System.out.println("Length of the list "+list.size());
        System.out.println();


        // addAll & removeAll
        ArrayList dummy = new ArrayList();
        dummy.addAll(list);
        System.out.println("Before removeAll :"+dummy);
        dummy.removeAll(list);
        System.out.println("After RemovingAll :"+ dummy);
        System.out.println();

        // get 
        System.out.println("Printing second index value "+list.get(2));
        System.out.println();
        // set
        System.out.println("changing 2nd index value to 10 ");
        list.set(2, 10);
        System.out.println(list);
        System.out.println();


        // set and get together
        System.out.println("replacing the 1st index value with 3rd index value");
        list.set(0, list.get(3)); 
        System.out.println(list);
        System.out.println();

        // isEmpty()

        System.out.println("Checking wether list is empty = "+list.isEmpty());
        System.out.println();

        // contains

        System.out.println("Checking 100 is there in the list: "+list.contains(100));
        System.out.println();

        ArrayList list1 = new ArrayList();
        list1.add('D');
        list1.add('A');
        list1.add('Z');
        list1.add('T');
        list1.add('C');

        // sort
        System.out.println("Created New List for Sorting pupose");
        System.out.println("before sorting"+list1);
        Collections.sort(list1);
        System.out.println("After sorting"+ list1);
        System.out.println();


        // reverse odeer or sorting in decreasing order
        System.out.println("reverse odeer or sorting in decending order");
        
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        System.out.println();

        // shuffle
        Collections.shuffle(list1);
        System.out.println("After Shuffling ");
        System.out.println(list1);
        System.out.println();


        // to print all the elements in the list

        // syso(list);
        // for loop
        System.out.println("Printing all elements using for loop");
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        System.out.println("Peinting all the elements using iterator");
        Iterator it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
        System.out.println();


        // Array to ArrayList
        String[] arr = {"Varshith", "Ashok", "Ishwar"};
        System.out.println("Converting array to ArrayList using Arrays.asList()");
        ArrayList list2 = new ArrayList(Arrays.asList(arr));
        System.out.println(list2);

    }
}
