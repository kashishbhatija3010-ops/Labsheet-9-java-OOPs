import java.util.TreeSet;

public class q18 {
    static class SortedIntegerSet {
        private final TreeSet<Integer> set = new TreeSet<>();

        public void add(int value) { set.add(value); }
        public boolean contains(int value) { return set.contains(value); }
    }

    public static void main(String[] args) {
        SortedIntegerSet numbers = new SortedIntegerSet();
        for (int n : new int[]{5, 10, 15, 20}) numbers.add(n);

        System.out.println("Contains 15? " + numbers.contains(15));
        System.out.println("Contains 99? " + numbers.contains(99));
    }
}
