package LinkedList;

public class LLKnowledge {

    Node head;
    Node Tail;
    private int size;

    LLKnowledge() {
        this.size = 0;
    }

    // Creating a Node
    class Node{
        String data;
        Node next;
        Node(String data){
            size++;
            this.data = data;
            next = null;
            
        }
    }

    // Add at First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add at Last

    public void addlast(String data){
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

    // add at index
    public void addIndex(int Idx,String data){
        if(Idx<0 || Idx > size){
            System.out.println("Not possible");
            return;
        }
        if(Idx==0){
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

    // delete at first
    public void deleteFirst(){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        size--;
        head = head.next;
    }

    // delete at last
    public void deleteLast(){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // delete at Index
    public void deleteIndex(int Idx){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        size--;
        if(Idx == 0){
            deleteFirst();
            return;
        }
        Node temp = head;
        int i =0;
        while(i<Idx-1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // display
    public void display(){
        if(head == null){
            System.out.println("Not a list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // size
    public void getsize(){
        System.out.println(size);
    }

    // iterator search
    public void itrSearch(String data){
        Node temp = head;
        int i=0;
        while(temp != null){
            if((temp.data).equals(data)){
                System.out.println("found at : "+i);
                return;
            }
            i++;
            temp = temp.next;
        }
        System.out.println("not found");
        return;

    }

    // searching using recursion
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

    // reverse the Linked list
    public void reverse(){
        Node prevNode = null;
        Node curNode = Tail = head;
        Node nextNode;
        while(curNode!= null){
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;

        } 
        head = prevNode;
    }

    public static void main(String[] args) {
        LLKnowledge list = new LLKnowledge();
        list.addFirst("Hello");
        list.addFirst("varshith");
        list.addlast("Hii");
        //list.deleteIndex(1);
        list.display();
        list.deleteIndex(1);
        list.display();
        list.getsize();
        list.itrSearch("Hii");
        list.recSearch("Hii");
        list.addFirst("Hello123");
        list.addlast("Who");
        list.addIndex(2, "Value");
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        //System.out.println();
        list.reverse();
        list.display();



        
    }
}
