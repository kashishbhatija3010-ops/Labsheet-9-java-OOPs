import java.util.ArrayList;
import java.util.Collections;

public class q8 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }
        public void sortAscending() { Collections.sort(list); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        for (int n : new int[]{42, 7, 19, 3, 88, 25}) numbers.add(n);

        System.out.println("Before sorting:");
        numbers.printAll();

        numbers.sortAscending();
        System.out.println("After sorting (ascending):");
        numbers.printAll();
    }
}
