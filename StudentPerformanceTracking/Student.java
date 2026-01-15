public class Student {
    private String Sname;
    private int Sid;
    protected String Course;
    protected String Grade;
    public Student(String Sname, int Sid, String Course, String Grade) {
        this.Sname = Sname;
        this.Sid = Sid;
        this.Course = Course;
        this.Grade = Grade;
    }
    public String getSname() {
        return Sname;

    }
    public int getSid() {
        return Sid;
    }
    public String getCourse() {
        return Course;
    }
    public String getGrade() {
        return Grade;
    }
    public void practicalMarks(double emarks,double fmarks,double Amarks,double Qmarks){
        fmarks = emarks*1+Amarks*0.5+Qmarks*0.4;
        System.out.println("Your final marks are :"+fmarks);
    }
    public static class TheoryStudents extends Student {
        public TheoryStudents(String Sname, int Sid, String Course, String Grade) {
            super(Sname, Sid, Course, Grade);
        }
        public void practicalMarks(double emarks,double fmarks,double Amarks,double Qmarks){
            fmarks=emarks*1+Amarks*1+Qmarks*0.5;
            System.out.println("Your final marks are :"+fmarks);
        }
    }


}
