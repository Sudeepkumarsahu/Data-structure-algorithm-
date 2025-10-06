//check in linked list cycle is present or not 
public class LLCYcle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; // slow
        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        LLCYcle cycleChecker = new LLCYcle();
        
        // Creating a linked list with a cycle
        ListNode head = cycleChecker.new ListNode(3);
        ListNode second = cycleChecker.new ListNode(2);
        ListNode third = cycleChecker.new ListNode(0);
        ListNode fourth = cycleChecker.new ListNode(-4);
        
        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        // Checking for a cycle
        boolean result = cycleChecker.hasCycle(head);
        System.out.println("Has Cycle: " + result); // Should print: Has Cycle: true

        // Creating a linked list without a cycle
        ListNode head2 = cycleChecker.new ListNode(1);
        ListNode second2 = cycleChecker.new ListNode(2);
        
        // Linking the nodes
        head2.next = second2;
        second2.next = null; // No cycle
        
        // Checking for a cycle
        boolean result2 = cycleChecker.hasCycle(head2);
        System.out.println("Has Cycle: " + result2); // Should print: Has Cycle: false
    
    }
}
