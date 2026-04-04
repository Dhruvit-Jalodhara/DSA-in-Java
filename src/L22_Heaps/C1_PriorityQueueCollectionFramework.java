package L22_Heaps;

import java.util.*;

public class C1_PriorityQueueCollectionFramework {
    public static void main(String[] args) {

        /*      PRIORITY QUEUE (HEAP) BASICS

         ✔ Default in Java = MIN HEAP
         → Smallest element always stays at top (root)

         ✔ Internal structure = Complete Binary Tree
         → Implemented using array internally

         ✔ Heap Property:
         → Parent <= Children (Min Heap)
         → Parent >= Children (Max Heap)

         ✔ Important:
         → Printing PQ does NOT give sorted order!
         → Only guarantees that root is correct
        */

        // ===================== MIN HEAP ===========================
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        // add() → Insert element into heap , TC: O(log n) (because heap re-balancing happens)

        pq.add(10);
        pq.add(20);
        pq.add(-30);

        // peek() → Get smallest element (root) , TC: O(1)
        System.out.println("Min Heap peek: " + pq.peek()); // -30

        // Insert another element
        pq.add(-35); // TC: O(log n)
        System.out.println("Min Heap peek after adding -35: " + pq.peek()); // -35

        // Printing PQ: Not sorted order , Only heap structure
        System.out.println("Min Heap (internal structure): " + pq);

        // remove() → Removes root (smallest element) , TC: O(log n)
        System.out.println("Removed element: " + pq.remove()); // -35

        // After removal, heap reorganizes again



        // ===================== MAX HEAP ===========================
        /*
         Java does NOT provide max heap by default,
         but we can create one using comparator
        */

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        /*
         Now heap property becomes:
         Parent >= Children
        */

        maxHeap.add(10);  // O(log n)
        maxHeap.add(20);  // O(log n)
        maxHeap.add(-30); // O(log n)
        maxHeap.add(50);  // O(log n)

        System.out.println("\nMax Heap peek: " + maxHeap.peek()); // 50
        System.out.println("Max Heap (internal structure): " + maxHeap);
        System.out.println("Removed from Max Heap: " + maxHeap.remove()); // 50


        /*
         Operation        Time Complexity
         --------------------------------
         add()            O(log n)
         remove()         O(log n)
         peek()           O(1)
        */
    }
}