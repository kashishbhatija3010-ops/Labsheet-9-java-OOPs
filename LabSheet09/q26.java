import java.util.ArrayList;
import java.util.Iterator;

public class q26 {
    static class Student {
        private final int rollNo;
        private final String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public int getRollNo() { return rollNo; }
        public String getName() { return name; }

        public void display() {
            System.out.println("Roll No: " + rollNo + ", Name: " + name);
        }
    }

    static class StudentList {
        private final ArrayList<Student> students = new ArrayList<>();

        public void add(Student s) { students.add(s); }

        public void displayAll() {
            Iterator<Student> it = students.iterator();
            while (it.hasNext()) {
                it.next().display();
            }
        }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student(1, "Neha"));
        list.add(new Student(2, "Karan"));
        list.add(new Student(3, "Pooja"));
        list.displayAll();
    }
}
