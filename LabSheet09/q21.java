import java.util.PriorityQueue;

public class q21 {
    static class IntegerPriorityQueue {
        private final PriorityQueue<Integer> pq = new PriorityQueue<>();

        public void add(int value) { pq.add(value); }
        public void printQueue() {
            // Printing shows the internal heap order, not fully sorted order
            System.out.println("PriorityQueue: " + pq);
        }
    }

    public static void main(String[] args) {
        IntegerPriorityQueue queue = new IntegerPriorityQueue();
        for (int n : new int[]{50, 20, 40, 10, 30}) queue.add(n);
        queue.printQueue();
    }
}
