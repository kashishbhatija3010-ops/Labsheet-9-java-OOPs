import java.util.LinkedHashSet;

public class q19 {
    static class InsertionOrderSet {
        private final LinkedHashSet<String> set = new LinkedHashSet<>();

        public void add(String value) { set.add(value); }
        public void printAll() { System.out.println("Insertion order: " + set); }
    }

    public static void main(String[] args) {
        InsertionOrderSet fruits = new InsertionOrderSet();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");    // duplicate ignored
        fruits.add("Cherry");
        fruits.printAll();
    }
}
