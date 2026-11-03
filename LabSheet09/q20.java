import java.util.*;

public class q20 {
    static class SetComparer {
        private final Set<String> hashSet = new HashSet<>();
        private final Set<String> linkedHashSet = new LinkedHashSet<>();
        private final Set<String> treeSet = new TreeSet<>();

        public void addAll(String... values) {
            for (String v : values) {
                hashSet.add(v);
                linkedHashSet.add(v);
                treeSet.add(v);
            }
        }

        public void printAll() {
            System.out.println("HashSet       (no guaranteed order): " + hashSet);
            System.out.println("LinkedHashSet (insertion order)    : " + linkedHashSet);
            System.out.println("TreeSet       (sorted order)       : " + treeSet);
        }
    }

    public static void main(String[] args) {
        SetComparer comparer = new SetComparer();
        comparer.addAll("Pear", "Apple", "Orange", "Banana", "Grape");
        comparer.printAll();
    }
}
