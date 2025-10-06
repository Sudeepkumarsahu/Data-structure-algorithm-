import java.util.HashMap;
import java.util.LinkedList;

public class HashMapeCode {
    static class HashMap<k,v> {
        private class Node{
            k key;
            v value;
            public Node(k key,v value){
                this.key = key;
                this.value= value;
            }
        }

        private int n; // nodes
        private int N; // buckets
        private LinkedList<Node> buckets[];// N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>(); // create empty linkedlist at each bucket
            }
        }
        public void put(k key,v value){
            
        }

    }
}
