import java.util.ArrayList;

public class StudentPerformanceTracking {
    public static void main(String[] args) {
            ArrayList<String>availableCourses = new ArrayList<>();
            availableCourses.add("ICT");
            availableCourses.add("OOP");

            Student s1 = new Student("Ali",1,"OOOP","A");
            Student.TheoryStudents s2 = new Student.TheoryStudents("Saad",2,"ICT","A");
            Course c1= new Course("OOP");
            Course c2 = new Course("ICT");
            Course c3 = new Course("English");
            Course c4 = new Course("Data Science");
            c1.enrolledStudent(s1,availableCourses);
            c2.enrolledStudent(s2,availableCourses);
            c3.enrolledStudent(s1,availableCourses);

            c1.showStudents();
            c2.showStudents();


    }
}
