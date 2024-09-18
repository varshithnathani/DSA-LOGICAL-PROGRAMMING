package LinkedList;
class LLPractice{

    Node head;

    private int size;
    LLPractice(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            size++;
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
        while(currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        if(head.next == null){
            size--;
            head = null;
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void reverseIter(){
        if(head == null || head.next == null) {
            System.out.println("Null");
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node nextNode = curNode.next;

            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }



    public void DeleteNthNodeFromLast(int n){
        int size1 = 0;
        Node currNode = head;
        while(currNode != null){
            size1++;
            currNode=currNode.next;
        }

        if(n == size1){
            head = head.next; // remove first
            return;
        }

        int i = 1;
        int idx = size1-n;
        Node presentNode = head;
        while (i<idx) {
            presentNode= presentNode.next;
            i++;
        }
        presentNode.next = presentNode.next.next;
        return;
    }


    // slow - fast approach
    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;  // +1
            fast = fast.next.next; // +2
        }
        return slow; // MidNode
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // finding mid node
        Node mid = FindMid(head);

        // reverse 2nd half
        Node prevNode = null;
        Node currNode = mid;
        Node nextNode;
        while(currNode != null){
            nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node right = prevNode; // right half head
        Node left = head; // left half head
        
        
        // right half and left half

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right= right.next;
            left = left.next;
        }
        return true;
    }


    public boolean isCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        LLPractice list = new LLPractice();
        // list.addFirst("A");
        // list.addFirst("B");
        // list.addFirst("C");
        // list.display();
        // list.addLast("D");
        // list.addLast("E");
        // list.display();
        // list.deleteFirst();
        // list.display();
        // list.deleteLast();
        // list.display();
        // System.out.println(list.size);

        // list.reverseIter();
        // list.display();
        // list.DeleteNthNodeFromLast(1);
        // list.display();

        // System.out.println(list.isPalindrome());
        // list.addLast("D");
        // list.display();
        // System.out.println(list.isPalindrome());
        

        list.head = list.new Node("A");
        list.head.next = list.new Node("B");
        list.head.next.next = list.new Node("C");
        list.head.next.next.next = list.head;

        System.out.println(list.isCycle());

    }
}