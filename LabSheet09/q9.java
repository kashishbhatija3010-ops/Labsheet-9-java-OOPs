import java.util.ArrayList;
import java.util.Collections;

public class q9 {
    static class StringList {
        private final ArrayList<String> list = new ArrayList<>();

        public void add(String value) { list.add(value); }
        public void reverse() { Collections.reverse(list); }
        public void printAll() { System.out.println("Elements: " + list); }
    }

    public static void main(String[] args) {
        StringList names = new StringList();
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Mango");

        System.out.println("Original:");
        names.printAll();

        names.reverse();
        System.out.println("Reversed:");
        names.printAll();
    }
}
