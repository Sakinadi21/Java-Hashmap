package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void HashMapMethods() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        // Changing/updating value of a key in the HashMap
        mp.put("Akash", 25); // Akash -> 25
        System.out.println(mp.get("Akash"));

        // Removing a pair from the HashMap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Riya")); // null

        // Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); // will enter
        mp.putIfAbsent("Yash", 30); // will not enter

        // Get all keys in the HashMap
        System.out.println(mp.keySet());

        // Get all values in the HashMap
        System.out.println(mp.values());

        // Get all entries in the HashMap
        System.out.println(mp.entrySet());

        // Traversing all entries of HashMap - multiple methods
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
