package L21_HashMaps_And_HashSets;

import java.util.HashSet;
import java.util.TreeSet;

public class C1_SetsCollectionsFramework {
    public static void main(String[] args) {

        // ===================== HASHSET =====================

        // HashSet is implemented using HashMap (internally uses hash table)
        // Average Time Complexity: O(1) for insert, delete, search
        // It does NOT maintain order (unorderd)
        // Allows only UNIQUE elements

        HashSet<Integer> set1 = new HashSet<>();

        // Adding elements
        set1.add(77); set1.add(65); set1.add(27); set1.add(92);
        set1.add(82); set1.add(11); set1.add(24); set1.add(117);

        System.out.println("HashSet Size: " + set1.size());         // Size of set
        System.out.println("Contains 65? " + set1.contains(65));    // Search element
        System.out.println("Removing 65: " + set1.remove(65));   // Remove element
        System.out.println("Contains 65? " + set1.contains(65));    // Check again after removal
        System.out.println("HashSet Size after removal: " + set1.size());   // Size after deletion

        set1.add(77);       // Adding duplicate element (ignored)
        System.out.println("Size after adding duplicate 77: " + set1.size());
        System.out.println("HashSet Elements: " + set1);        // Printing HashSet (unordered output)


        set1.add(null);          // EXTRA: HashSet allows one null value
        System.out.println("HashSet after adding null: " + set1);


        // ===================== TREESET =====================

        // TreeSet is implemented using Red-Black Tree (self-balancing BST)
        // Time Complexity: O(log n)
        // Maintains elements in SORTED order
        // Does NOT allow null values

        TreeSet<Integer> set2 = new TreeSet<>();

        // Adding elements
        set2.add(77); set2.add(65); set2.add(27); set2.add(92);
        set2.add(82); set2.add(11); set2.add(24); set2.add(117);


        System.out.println("\nTreeSet Size: " + set2.size());       // Size of set
        System.out.println("Contains 65? " + set2.contains(65));    // Search element
        System.out.println("Removing 65: " + set2.remove(65));   // Remove element
        System.out.println("Contains 65? " + set2.contains(65));    // Check again after removal
        System.out.println("TreeSet Size after removal: " + set2.size());   // Size after deletion

        set2.add(77);       // Adding duplicate element (ignored)
        System.out.println("Size after adding duplicate 77: " + set2.size());
        System.out.println("TreeSet Elements (Sorted): " + set2);       // Printing TreeSet (sorted output)

        // EXTRA: TreeSet useful methods
        System.out.println("First element: " + set2.first());   // smallest
        System.out.println("Last element: " + set2.last());     // largest

        // Uncommenting below will throw NullPointerException
        // set2.add(null);
    }
}