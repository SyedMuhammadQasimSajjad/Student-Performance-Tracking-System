import java.util.ArrayList;

public class Course {
    public String Coursename;
    public ArrayList<Student> students= new ArrayList<>() ;
    public Course (String coursename){
        this.Coursename = coursename;

    }
    public void enrolledStudent(Student s,ArrayList<String>availableCourses ){
        if(availableCourses.contains(this.Coursename)) {
            students.add(s);
            System.out.println(s.getSname() +" is enrolled in : "+this.Coursename);

        }
        else{
            System.out.println(this.Coursename+" This course is not enrolled: ");
        }


    }
    public void showStudents(){
        System.out.println("Student in "+this.Coursename+" are:");
        for(Student s: students){
            System.out.println(s.getSname()+" - "+s.getGrade());

        }
    }
}
