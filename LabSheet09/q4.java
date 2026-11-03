import java.util.ArrayList;

public class q4 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }
        public void removeByIndex(int index) { list.remove(index); }
        public void removeByValue(int value) { list.remove(Integer.valueOf(value)); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        for (int n : new int[]{10, 20, 30, 40, 50}) numbers.add(n);
        numbers.printAll();

        numbers.removeByIndex(1);      // removes element at index 1 (20)
        System.out.println("After removing index 1:");
        numbers.printAll();

        numbers.removeByValue(40);     // removes the value 40
        System.out.println("After removing value 40:");
        numbers.printAll();
    }
}
