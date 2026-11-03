import java.util.*;

public class q29 {
    static class SetToListConverter {
        public List<String> convert(Set<String> set) {
            return new ArrayList<>(set);
        }
    }

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> list = new SetToListConverter().convert(set);

        System.out.println("Iterating through the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " -> " + list.get(i));
        }
    }
}
