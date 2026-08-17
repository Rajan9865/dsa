package playground;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 8/4/2026
 */
public class Demo {
    static void main() {
//        Map<Student, String> map = new HashMap<Student, String>();
//        map.put(new Student(1, "rajan"), "developer");
//        map.put(new Student(1, "rajan"), "developer");
//        map.put(new Student(2, "rajani"), "software developer");
//        System.out.println(map);
        StudentTest studentTest = new StudentTest(101);
        StudentTest studentTest1 = new StudentTest(101);
        
        System.out.println(studentTest.equals(studentTest1));
        System.out.println(studentTest.hashCode());
        System.out.println(studentTest1.hashCode());
    }
}

class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return 1;
//    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

class StudentTest {
    int id;

    StudentTest(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        StudentTest s = (StudentTest) obj;
        return this.id == s.id;
    }
}