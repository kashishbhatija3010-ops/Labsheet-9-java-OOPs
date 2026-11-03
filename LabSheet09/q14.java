import java.util.HashSet;

public class q14 {
    static class IntegerSet {
        private final HashSet<Integer> set = new HashSet<>();

        public void add(int value) {
            boolean added = set.add(value);
            System.out.println("Adding " + value + " -> " + (added ? "added" : "duplicate, ignored"));
        }

        public void printAll() { System.out.println("Set: " + set); }
    }

    public static void main(String[] args) {
        IntegerSet numbers = new IntegerSet();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);   // duplicate
        numbers.add(30);
        numbers.add(20);   // duplicate
        numbers.printAll();
    }
}
