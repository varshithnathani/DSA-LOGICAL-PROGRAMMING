package LinkedList;

public class LL5 {

    Node head;
    private int size;

    LL5() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            size++;
            this.data = data;
            next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addIndex(int Ind, String data) {
        if (Ind < 0 || Ind > size) {
            System.out.println("Not possible");
            return;
        }
        if (Ind == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < Ind - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void getsize() {
        System.out.println(size);
    }

    public int itrsearch(String data) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data.equals(data)) {
                System.out.print("Found at : ");
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void recsearch(String data) {
        String result = helper(head, data);
        System.out.println(result);
    }

    public String helper(Node head, String data) {
        if (head == null) {
            return "Not Found"; 
        }
        if (head.data.equals(data)) {
            return "Found"; // Found the element
        }
        // Recursive call
        String result = helper(head.next, data);
        return result; // Propagate the result up the chain
    }

    public static void main(String[] args) {
        LL5 list = new LL5();

        list.addFirst("Hello");
        list.addFirst("Hii");
        list.addIndex(0, "Good Morning");
        list.addLast("varshith");
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.getsize();
        System.out.println(list.itrsearch("Hello"));
        list.recsearch("Hello");
    }
}
