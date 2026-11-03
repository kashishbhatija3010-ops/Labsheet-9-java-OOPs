import java.util.LinkedList;

public class q10 {
    static class StringLinkedList {
        private final LinkedList<String> list = new LinkedList<>();

        public void add(String value) { list.add(value); }
        public void printAll() {
            for (String s : list) System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StringLinkedList cities = new StringLinkedList();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.printAll();
    }
}
