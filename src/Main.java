import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Carol", 21));
        studentList.add(new Student("David", 23));

        System.out.println("Lista degli studenti:");

        for (Student student : studentList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}