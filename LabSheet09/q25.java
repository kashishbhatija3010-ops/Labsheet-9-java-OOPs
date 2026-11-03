import java.util.LinkedList;
import java.util.Queue;

public class q25 {
    static class CustomerQueue {
        private final Queue<String> queue = new LinkedList<>();

        public void enqueue(String name) {
            queue.offer(name);
            System.out.println("Added  : " + name);
        }

        public void dequeue() {
            System.out.println("Removed: " + queue.poll());
        }

        public void peek() {
            System.out.println("Front  : " + queue.peek());
        }

        public void printAll() { System.out.println("Queue  : " + queue); }
    }

    public static void main(String[] args) {
        CustomerQueue q = new CustomerQueue();
        q.enqueue("Asha");
        q.enqueue("Bilal");
        q.enqueue("Chitra");
        q.peek();
        q.dequeue();
        q.peek();
        q.printAll();
    }
}
