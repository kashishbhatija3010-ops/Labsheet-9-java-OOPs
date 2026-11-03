import java.util.ArrayList;

public class q6 {
    static class IntegerList {
        private final ArrayList<Integer> list = new ArrayList<>();

        public void add(int value) { list.add(value); }

        public void printUsingForEach() {
            for (Integer n : list) {
                System.out.println("Element: " + n);
            }
        }
    }

    public static void main(String[] args) {
        IntegerList numbers = new IntegerList();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.printUsingForEach();
    }
}
