import java.util.ArrayList;

public class q2 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }
        public int size() { return list.size(); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.printAll();
        System.out.println("Size: " + numbers.size());
    }
}
