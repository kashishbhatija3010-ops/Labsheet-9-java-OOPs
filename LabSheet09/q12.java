import java.util.LinkedList;

public class q12 {
    static class StringLinkedList {
        private final LinkedList<String> list = new LinkedList<>();

        public void add(String value) { list.add(value); }
        public void removeFirst() { list.removeFirst(); }
        public void removeLast() { list.removeLast(); }
        public void printAll() { System.out.println("List: " + list); }
    }

    public static void main(String[] args) {
        StringLinkedList items = new StringLinkedList();
        for (String s : new String[]{"A", "B", "C", "D", "E"}) items.add(s);
        items.printAll();

        items.removeFirst();
        System.out.println("After removing first:");
        items.printAll();

        items.removeLast();
        System.out.println("After removing last:");
        items.printAll();
    }
}
