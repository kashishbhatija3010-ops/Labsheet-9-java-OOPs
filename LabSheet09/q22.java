import java.util.PriorityQueue;

public class q22 {
    static class IntegerPriorityQueue {
        private final PriorityQueue<Integer> pq = new PriorityQueue<>();

        public void add(int value) { pq.add(value); }

        public void removeAllAndPrint() {
            while (!pq.isEmpty()) {
                System.out.println("Removed: " + pq.poll());   // always the smallest element
            }
        }
    }

    public static void main(String[] args) {
        IntegerPriorityQueue queue = new IntegerPriorityQueue();
        for (int n : new int[]{50, 20, 40, 10, 30}) queue.add(n);
        queue.removeAllAndPrint();   // comes out in ascending order
    }
}
