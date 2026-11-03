import java.util.ArrayList;
import java.util.Comparator;

public class q27 {
    static class Student {
        private final int rollNo;
        private final String name;
        private final double marks;

        public Student(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        public int getRollNo() { return rollNo; }
        public String getName() { return name; }
        public double getMarks() { return marks; }

        public void display() {
            System.out.println(rollNo + " | " + name + " | " + marks);
        }
    }

    // Comparator class: sort by marks (descending)
    static class MarksComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getMarks(), a.getMarks());
        }
    }

    static class StudentList {
        private final ArrayList<Student> students = new ArrayList<>();

        public void add(Student s) { students.add(s); }

        public void sortBy(Comparator<Student> comparator) { students.sort(comparator); }

        public void displayAll() { students.forEach(Student::display); }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student(1, "Neha", 78.5));
        list.add(new Student(2, "Karan", 91.0));
        list.add(new Student(3, "Pooja", 66.25));
        list.add(new Student(4, "Dev", 84.0));

        System.out.println("Sorted by marks (high to low):");
        list.sortBy(new MarksComparator());
        list.displayAll();

        System.out.println("\nSorted by name (using Comparator.comparing):");
        list.sortBy(Comparator.comparing(Student::getName));
        list.displayAll();
    }
}
