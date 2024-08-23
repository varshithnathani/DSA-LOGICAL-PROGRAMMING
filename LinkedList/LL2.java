package LinkedList;
import java.util.*;
public class LL2 {

    private Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    } 

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }


    public void display(){
        if(head == null){
            System.out.println("List is not present");
            return;
        }
        Node currNode = head;
        while(currNode!= null ){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }


    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addFirst("I am");
        list.addFirst("Hello");
        list.addLast("Varshith");
        list.display();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.display();
    }

}
