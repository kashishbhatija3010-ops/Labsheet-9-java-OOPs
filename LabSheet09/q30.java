import java.util.*;

public class q30 {
    static class CollectionCleaner {
        public void clearAndReport(String name, Collection<?> collection) {
            System.out.println(name + " before clear: " + collection);
            collection.clear();
            System.out.println(name + " after clear : " + collection + "  (isEmpty=" + collection.isEmpty() + ")\n");
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Queue<String> queue = new LinkedList<>(Arrays.asList("x", "y", "z"));

        CollectionCleaner cleaner = new CollectionCleaner();
        cleaner.clearAndReport("List ", list);
        cleaner.clearAndReport("Set  ", set);
        cleaner.clearAndReport("Queue", queue);
    }
}
