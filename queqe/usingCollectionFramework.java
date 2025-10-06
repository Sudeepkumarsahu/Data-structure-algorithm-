import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class usingCollectionFramework {
     public static void main(String[] args) {
        // Queue q = new Queue();
        // queue is a interface in java object class ka banta hai interface ka nahi  and queue class nahi hai
        //queue interface ko 2 classes implements karti hai 1.ArrayDeque 2.LinkedList
        // so here we use LinkedList for implement queue
        
        // Queue<Integer> q = new LinkedList<>();

        // so here we use ArrayDeque for implement queue
        Queue<Integer> q = new ArrayDeque<>();
       
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }}
