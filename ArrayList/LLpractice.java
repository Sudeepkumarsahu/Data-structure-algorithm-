
public class LLpractice {
    // Definition for singly linked list
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to remove nth node from the end of the list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n == 1)) {
            return null;
        }

        // Find the size of the linked list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // If n equals the size of the list, remove the head
        if (n == size) {
            return head.next;
        }

        // Find the node just before the one to be removed
        int indexToSearch = size - n;
        ListNode prev = head;
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }

        // Delete the nth node from the end
        prev.next = prev.next.next;
        return head;
    }

    // Helper method to print the list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLpractice ll = new LLpractice();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = ll.new ListNode(1);
        head.next = ll.new ListNode(2);
        head.next.next = ll.new ListNode(3);
        head.next.next.next = ll.new ListNode(4);
        head.next.next.next.next = ll.new ListNode(5);

        System.out.print("Original List: ");
        ll.printList(head);

        // Remove the 3rd node from the end (i.e., remove node with value 3)
        head = ll.removeNthFromEnd(head, 3);

        System.out.print("Modified List: ");
        ll.printList(head);
    }
}
