package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        System.out.println(map); // output: {orange=0.75, banana=0.25, apple=0.5}

        // Note: HashMap will overwrite duplicated keys, ex:
        map.put("orange", 1000.00);
        System.out.println(map); // output: {orange=1000.0, banana=0.25, apple=0.5}

        map.remove("orange");
        System.out.println(map); // output: {banana=0.25, apple=0.5, coconut=1.0}

        System.out.println(map.get("apple")); // output: 0.5
        System.out.println(map.containsKey("banana")); // output: true
        System.out.println(map.containsValue(1.00)); // output: true
        System.out.println(map.size()); // output: 3

        for(String key : map.keySet()){ // Analogi: for every key in keySet (keySet adalah method HashMap)
            System.out.println(key + " : $" + map.get(key));
        }

        // Output:
        // banana : $0.25
        // apple : $0.5
        // coconut : $1.0
    }
}
