import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.err.println(map);
        map.put("China", 200);
        System.err.println(map);

        // search
        if (map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));// key exist
        System.out.println(map.get("America"));// key does not exist

        int arr[] = { 12, 24, 56 };
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " ");
        }
        System.out.println();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // for remove pair
        map.remove("China");
        System.out.println(map);








        // implementation of hashing -> using array of linkedlist
        

    }



}