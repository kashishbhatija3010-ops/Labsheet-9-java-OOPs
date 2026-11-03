import java.util.HashSet;

public class q15 {
    static class IntegerSet {
        private final HashSet<Integer> set = new HashSet<>();

        public void add(int value) { set.add(value); }
        public boolean remove(int value) { return set.remove(value); }
        public void printAll() { System.out.println("Set: " + set); }
    }

    public static void main(String[] args) {
        IntegerSet numbers = new IntegerSet();
        for (int n : new int[]{1, 2, 3, 4, 5}) numbers.add(n);
        numbers.printAll();

        System.out.println("Removed 3? " + numbers.remove(3));
        System.out.println("Removed 99? " + numbers.remove(99));
        numbers.printAll();
    }
}
