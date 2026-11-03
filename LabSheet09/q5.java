import java.util.ArrayList;

public class q5 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }
        public void update(int index, int newValue) { list.set(index, newValue); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.printAll();

        numbers.update(1, 99);
        System.out.println("After updating index 1 to 99:");
        numbers.printAll();
    }
}
