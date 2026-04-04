package L21_HashMaps_And_HashSets;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C5_MapsCollectionFramework {
    public static void main(String[] args) {

        // 🔹 Creating a HashMap (unordered, fast operations)
        HashMap<String , Integer> map = new HashMap<>();

        // 🔹 Inserting key-value pairs
        map.put("dhruvit",21);
        map.put("parth" , 20);
        map.put("ajay",19);
        map.put("gautam",18);

        // 🔹 Size of map (number of entries)
        System.out.println("Size: " + map.size());

        // 🔹 Printing whole map (order NOT guaranteed)
        System.out.println("Map: " + map);

        // 🔹 Removing a key (returns removed value)
        System.out.println("Removed value: " + map.remove("ajay"));

        // 🔹 Map after removal
        System.out.println("After removal: " + map);

        // 🔹 Get value by key
        System.out.println("Value of dhruvit: " + map.get("dhruvit"));

        // 🔹 Updating value (same key replaces old value)
        map.put("gautam",20);
        System.out.println("After update: " + map);

        // 🔹 Check if key exists
        System.out.println("Contains 'parth'? " + map.containsKey("parth"));

        // 🔹 Check if value exists
        System.out.println("Contains value 21? " + map.containsValue(21));

        // 🔹 Loop using keySet()
        System.out.println("\nIterating using keySet:");
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        // 🔹 Loop using entrySet() (BEST way - more efficient)
        System.out.println("\nIterating using entrySet:");
        for(Map.Entry<String , Integer> mapEntry : map.entrySet()){
            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());

            // ❌ Not allowed (Integer is immutable)
            // mapEntry.getValue() = mapEntry.getValue() + 2;
        }

        // 🔹 Safe way to update values during iteration
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            entry.setValue(entry.getValue() + 2);
        }
        System.out.println("After incrementing values: " + map);

        // 🔹 getOrDefault (avoid null issues)
        System.out.println("Value of 'unknown': " + map.getOrDefault("unknown", -1));

        // 🔹 putIfAbsent (only adds if key not present)
        map.putIfAbsent("dhruvit", 100); // won't change
        map.putIfAbsent("newUser", 25);  // will add
        System.out.println("After putIfAbsent: " + map);


        // =======================
        // 🌳 TREE MAP SECTION
        // =======================

        // 🔹 TreeMap (sorted by keys - ascending order)
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("dhruvit",21);
        treeMap.put("parth" , 20);
        treeMap.put("ajay",19);
        treeMap.put("gautam",18);

        // 🔹 Automatically sorted by key
        System.out.println("\nTreeMap (sorted): " + treeMap);

        // 🔹 First and Last key
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // 🔹 Higher / Lower keys
        System.out.println("Higher than 'dhruvit': " + treeMap.higherKey("dhruvit"));
        System.out.println("Lower than 'dhruvit': " + treeMap.lowerKey("dhruvit"));

        // 🔹 Iterate TreeMap
        System.out.println("\nIterating TreeMap:");
        for(Map.Entry<String , Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}