import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturnArrayWithStudents() {
        //GIVEN
        Student max = new Student("123", "Max");
        Student[] testStudents = new Student[1];
        testStudents[0] = max;

        StudentDB studentDb = new StudentDB(testStudents);

        //WHEN
        Student[] actual = studentDb.getAllStudents();

        //THEN
        Student[] expected = {new Student("123", "Max")};
        assertArrayEquals(actual, expected);
    }

    @Test
    void studentIsFoundWhenIdMatches() throws IOException {
        //GIVEN
        String id = "123";
        Student[] allStudents = new Student[2];
        Student student1 = new Student("123", "Test");
        Student student2 = new Student("456", "Matthias");
        allStudents[0] = student1;
        allStudents[1] = student2;
        StudentDB studentDB = new StudentDB(allStudents);

      //WHEN
        Student expectedStudent = new Student("123", "Test");
        Student actual = studentDB.findById(id);
        //THEN
       assertEquals(expectedStudent, actual);
    }

   /* @Test
    void studentIsNotFoundWhenIdIsNotMatching() throws IOException {
        //GIVEN
        String id = "111";
        Student[] allStudents = new Student[2];
        Student student1 = new Student("123", "Test");
        Student student2 = new Student("456", "Matthias");
        allStudents[0] = student1;
        allStudents[1] = student2;
        StudentDB studentDB = new StudentDB(allStudents);

        //WHEN
      *//*  String excMessage = System.out.prinln("Not found");
        Student expectedStudent = new Student("123", "Test");*//*
        String actual = new IOException("ID notfound");
        //THEN
        assertEquals("No output becausejava.io.IOException: ID not found", actual);


    }*/
}
