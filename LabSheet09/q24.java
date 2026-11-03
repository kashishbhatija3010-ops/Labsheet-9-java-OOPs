import java.util.LinkedList;
import java.util.Queue;

public class q24 {
    static class TaskQueue {
        // Queue interface reference -> LinkedList object
        private final Queue<String> queue = new LinkedList<>();

        public void add(String task) {
            queue.add(task);
            System.out.println("Added   : " + task);
        }

        public void remove() {
            System.out.println("Removed : " + queue.remove());
        }

        public void printAll() { System.out.println("Queue   : " + queue); }
    }

    public static void main(String[] args) {
        TaskQueue tasks = new TaskQueue();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.printAll();

        tasks.remove();
        tasks.remove();
        tasks.printAll();
    }
}
