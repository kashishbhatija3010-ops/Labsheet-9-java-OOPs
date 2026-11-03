import java.util.ArrayList;

public class q1 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }

        public void printAll() {
            System.out.println("Elements: " + list);
        }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.printAll();
    }
}
