import java.util.TreeSet;

public class q17 {
    static class SortedIntegerSet {
        private final TreeSet<Integer> set = new TreeSet<>();

        public void add(int value) { set.add(value); }
        public void printAll() { System.out.println("Sorted set: " + set); }
    }

    public static void main(String[] args) {
        SortedIntegerSet numbers = new SortedIntegerSet();
        for (int n : new int[]{45, 12, 78, 3, 56, 21}) numbers.add(n);   // random order
        numbers.printAll();
    }
}
