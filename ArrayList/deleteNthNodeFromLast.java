// find nth node from last and also delete that node
// 1 -> 2 -> 3 -> 4 -> 5 -> null
// from begining (size-n+1) = from last is n

// deitance from start = size -n+1   => 5-2+1 =4
// deitance from start of previous node = size - n => 5-2 =3
// prev.next = prev.next.next  means prev ke next ko completely delete kar diya

public class deleteNthNodeFromLast {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) // If the linked list has only one element
        {
            return null;
        }

        // calculate the size of linkedlist
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If the first element needs to be deleted
        if (n == size) {
            return head.next;
        }

        // Find the previous node of the node to be deleted
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; // // Cut the nth node from the end
        return head;
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        deleteNthNodeFromLast solution = new deleteNthNodeFromLast();

        // Removing the 2nd node from the end
        head = solution.removeNthFromEnd(head, 2);

        // Printing the updated linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
