
public class reverseLL {
    Node head;
    private int size;

    reverseLL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null; // Correctly initialize next to null
            size++;
        }
    }

    // Add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data){
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

    // Print the list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;   
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Get size
    public int getSize(){
        return size;
    }

    // Reverse the linked list by iterative method
    public void reverseList() {
        if(head == null || head.next == null)
        {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

     // Reverse the linked list recursively
    public Node revereseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = revereseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // reverse the linked list in constant space complexity
    // iterative method
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
            
        }
        head.next = null;
        head = prevNode;
    }
    //using recursion reverse linked list
    public Node reverseRecursive(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        reverseLL list = new reverseLL(); // Correct class name
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> NULL

        list.reverseList(); // Reverse the list
        list.printList(); // Output: 4 -> 3 -> 2 -> 1 -> NULL
        list.head = list.revereseRecursive(list.head);
        list.printList();

        list.reverseIterate();
        list.printList();
        
     list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }
}
