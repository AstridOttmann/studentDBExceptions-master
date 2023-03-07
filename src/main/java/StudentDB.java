import java.io.IOException;
import java.util.Arrays;

public class StudentDB {
    private static Student[] students;

    public StudentDB(Student[] students) {

        this.students = students;
    }

    public Student[] getAllStudents() {

        return students;
    }

    public Student randomStudent() {
        int random = (int)(Math.random() * students.length);
        return students[random];
    }

    public static Student findById(String id) throws IOException {


        for (int i = 0; i < students.length; i++) {

                if (students[i].getId() == (id))
                    return students[i];
            }
            throw new IOException("ID not found");
        }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

