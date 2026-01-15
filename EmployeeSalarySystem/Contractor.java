import java.util.Scanner;

public class Contractor extends Employee {
    public Contractor(String name,int id, double salary) {
        super(name,salary,id);
    }
    int  hourlyRate;
    double salary;
    int hoursWorked;
    public Contractor() {;
    }

    public void CalculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hourly rate for this employee : ");
        hourlyRate = sc.nextInt();
        System.out.println("Enter hours worked for this employee : ");
        hoursWorked = sc.nextInt();

        salary = hourlyRate*hoursWorked;
        System.out.println("Salary for Contractor "+getName()+"\n id - "+getId()+" is : " + salary);
    }

}
