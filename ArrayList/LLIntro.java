
public class LLIntro {
    Node head;
    private int size;

    LLIntro() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deletelast
    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize() {
        return size;
    }

    public static void main(String[] args) {
        LLIntro list = new LLIntro();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());
        list.addLast("list");
        list.printList();
        System.out.println(list.getsize());
    }
}
