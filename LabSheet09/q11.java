import java.util.LinkedList;

public class q11 {
    static class StringLinkedList {
        private final LinkedList<String> list = new LinkedList<>();

        public void addFirst(String value) { list.addFirst(value); }
        public void addLast(String value) { list.addLast(value); }
        public void printAll() { System.out.println("List: " + list); }
    }

    public static void main(String[] args) {
        StringLinkedList cities = new StringLinkedList();
        cities.addLast("Mumbai");
        cities.addFirst("Delhi");      // goes to the beginning
        cities.addLast("Kolkata");     // goes to the end
        cities.printAll();
    }
}
