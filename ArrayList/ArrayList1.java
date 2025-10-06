// Array me primitive and objects ko store kar sakte hai
// Arr me only objects ko store kar sakte hai
// ArrayList heap memory ke andar banti hai
// function in collection framework
// add
// get
// modify
// delete/remove
// iterate/operation
    // collectionframework is a collection of classes and interfaces
import java.util.ArrayList;
import java.util.Collections; 
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Create an ArrayList
        list.add(1);  // Adding elements
        list.add(2);
        list.add(3);
        System.out.println(list);  // Printing the ArrayList

        //get elemet
        int element = list.get(0);
        System.out.println(element);

        //add element in between
         list.add(1,5);
         System.out.println(list);

         //set element
         list.set(0, 9);
         System.out.println(list);

         //delement element
         list.remove(2);
         System.out.println(list);

         //size
         int size = list.size();
         System.out.println(size);

         //loops
         for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
         }
         System.err.println();

         //sorting
         Collections.sort(list);
         System.out.println(list);
    }
}
