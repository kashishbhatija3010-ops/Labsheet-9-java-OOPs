import java.util.*;

public class q28 {
    static class ListToSetConverter {
        public Set<Integer> convert(List<Integer> list) {
            return new HashSet<>(list);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));
        System.out.println("List (with duplicates): " + list + "  size=" + list.size());

        Set<Integer> set = new ListToSetConverter().convert(list);
        System.out.println("Set  (duplicates gone): " + set + "  size=" + set.size());
    }
}
