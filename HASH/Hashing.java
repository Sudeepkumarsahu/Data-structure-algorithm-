import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
public static void main(String[] args) {
    //creation 
    HashSet<Integer> set =  new HashSet<>();
    set.add(1); 
    set.add(2); 
    set.add(3); 
    set.add(1); 

    //size 
    System.out.println("size of list is : "+set.size());
    //print all element
    System.out.println(set);

    //iterator
    Iterator it = set.iterator();
    while (it.hasNext()) { // check there is next present or not return in true or false
        System.err.println(it.next()); //print value
    }
    //search
    if (set.contains(1)) {
        System.out.println("set contains 1");
    }if (!set.contains(6)) {
        System.out.println("does not contain 6");
    }

    //delete
    set.remove(1);
    if (!set.contains(1)) {
        System.out.println("set does not contains 1");
    }
}
}