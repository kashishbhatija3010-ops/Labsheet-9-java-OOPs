import java.util.ArrayList;

public class q3 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }
        public void insertAt(int index, int value) { list.add(index, value); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        System.out.println("Before insert:");
        numbers.printAll();

        numbers.insertAt(2, 30);   // insert 30 at index 2
        System.out.println("After inserting 30 at index 2:");
        numbers.printAll();
    }
}
