import java.util.HashSet;
import java.util.Iterator;

public class q16 {
    static class IntegerSet {
        private final HashSet<Integer> set = new HashSet<>();

        public void add(int value) { set.add(value); }

        public void printUsingIterator() {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                System.out.println("Element: " + it.next());
            }
        }
    }

    public static void main(String[] args) {
        IntegerSet numbers = new IntegerSet();
        for (int n : new int[]{100, 200, 300, 400}) numbers.add(n);
        numbers.printUsingIterator();
    }
}
