import java.util.ArrayList;

public class stackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(isEmpty());
        pop();
        peek();
        pop();
        pop();
        System.out.println(isEmpty());
        
    }
    public static void push(int data){
        list.add(data);
    }
    public static void pop(){
        System.out.println(list.get(list.size()-1));
        list.remove(list.get(list.size()-1));
    }
    public static void peek(){
        System.out.println(list.get(list.size()-1));
    }
    public static boolean isEmpty(){
        if(list.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
