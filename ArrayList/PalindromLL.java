// Time Complexity: O(n)
// Space Complexity: 𝑂(1)

public class PalindromLL {

    // Definition for singly-linked list.
    public class ListNode {
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

    // Function to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to find the middle of a linked list
    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // Function to check if a linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        ListNode middle = findMiddle(head);

        // Reverse the second half of the linked list
        ListNode secondHalfStart = reverse(middle.next);

        // Compare the first half and the reversed second half
        ListNode firstHalfStart = head;
        ListNode secondHalfCopy = secondHalfStart; // To restore the list later

        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        // Restore the original list
        middle.next = reverse(secondHalfCopy);

        return true;
    }
    public static void main(String[] args) {
        PalindromLL list = new PalindromLL();

        // Create a test linked list 1 -> 2 -> 2 -> 1
        PalindromLL.ListNode node1 = list.new ListNode(1);
        PalindromLL.ListNode node2 = list.new ListNode(2);
        PalindromLL.ListNode node3 = list.new ListNode(2);
        PalindromLL.ListNode node4 = list.new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Check if the linked list is a palindrome
        System.out.println(list.isPalindrome(node1)); // Output: true
    }
}
