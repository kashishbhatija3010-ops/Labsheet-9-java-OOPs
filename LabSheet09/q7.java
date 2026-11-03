import java.util.ArrayList;
import java.util.Iterator;

public class q7 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }

        public void printUsingIterator() {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                System.out.println("Element: " + it.next());
            }
        }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(7);
        numbers.add(14);
        numbers.add(21);
        numbers.printUsingIterator();
    }
}
