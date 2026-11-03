import java.util.LinkedList;

public class q13 {
    static class StringLinkedList {
        private final LinkedList<String> list = new LinkedList<>();

        public void add(String value) { list.add(value); }
        public String getFirst() { return list.getFirst(); }
        public String getLast() { return list.getLast(); }
    }

    public static void main(String[] args) {
        StringLinkedList items = new StringLinkedList();
        items.add("Red");
        items.add("Green");
        items.add("Blue");

        System.out.println("First element: " + items.getFirst());
        System.out.println("Last element : " + items.getLast());
    }
}
