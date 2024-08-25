package LinkedList;

public class LLPalindrome {

    Node head;
    Node tail;

    private int size;
    LLPalindrome(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            size++;
            this.data = data;
            next = null;
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
        currNode.next= newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        size--;
        head = head.next;
    }

    public void delteLast(){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        size--;
        Node currNode = head.next;
        Node secondLast = head;
        while(currNode.next != null){
            currNode = currNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void addIndex(int Idx, String data){
        if(Idx<0 || Idx>size){
            System.out.println("out of bound Error");
            return;
        }
        if(Idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0; i<Idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteIndex(int Idx){
        if(Idx<0 || Idx>size){
            System.out.println("Out of bound error");
            return;
        }
        size--;
        if(Idx == 0){
            deleteFirst();
            return;
        }
        Node temp =head;
        for(int i=0; i<Idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void itrSearch(String data){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        int i=0;
        while(temp!= null){
            if(temp.data.equals(data)){
                System.out.println("Found at : "+i);
                return;
            }
            i++;
            temp = temp.next;
        }
        System.out.println("not found");
        return;
    }

    public void recSearch(String data){
        String result = helper(head, data);
        System.out.println(result);
    }
    public String helper(Node head, String data){
        if(head == null){
            return "Not Found";
        }
        if(head.data.equals(data)){
            return "Found";
        }
        String result = helper(head.next, data);
        return result;

    }

    public void display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void getsize(){
        System.out.println(size);
    }

    public void reverse(){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode;
        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        // step - 1: find mid
        Node mid = findMid(head);
        // step - 2: reverse
        Node currNode = mid;
        Node prevNode = null;
        Node nextNode;
        while(currNode!= null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node right  = prevNode; 
        Node left = head;

        // step - 3 check left half and right half
        while(right != null){
            if(right.data != (left.data)){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }
    public static void main(String[] args) {
        LLPalindrome list = new LLPalindrome();
        list.addFirst("CAT");
        list.addFirst("BAT");
        list.addFirst("ANT");
        list.addLast("DOG");
        list.display();
        list.delteLast();
        list.display();
        list.deleteFirst();
        list.display();
        list.getsize();
        list.addIndex(2, "ABCD");
        list.display();
        list.deleteIndex(1);
        list.display();
        list.reverse();
        list.display();
        System.out.println(list.isPalindrome());
        list.deleteIndex(1);
        list.display();
        list.addLast("ABCD");
        list.display();
        System.out.println(list.isPalindrome());
        list.addLast("ABCD");
        list.display();
        System.out.println(list.isPalindrome());
        
        
    }
}
