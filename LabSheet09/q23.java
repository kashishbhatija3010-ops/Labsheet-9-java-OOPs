import java.util.PriorityQueue;

public class q23 {
    static class IntegerPriorityQueue {
        private final PriorityQueue<Integer> pq = new PriorityQueue<>();

        public void add(int value) { pq.add(value); }
        public Integer peek() { return pq.peek(); }
        public int size() { return pq.size(); }
    }

    public static void main(String[] args) {
        IntegerPriorityQueue queue = new IntegerPriorityQueue();
        for (int n : new int[]{35, 15, 25, 5}) queue.add(n);

        System.out.println("Head of queue (peek): " + queue.peek());
        System.out.println("Size after peek     : " + queue.size() + " (unchanged)");
    }
}
