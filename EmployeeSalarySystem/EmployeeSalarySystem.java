import java.util.Scanner;

public class EmployeeSalarySystem {
    public String Type;
    public static void main(String[] args) {
        double baseSalary=60000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        String name = sc.next();
        System.out.println("Base Salary is : "+baseSalary);

        System.out.println("Enter Employee Type | Regular | Contractor| Manager : ");
        String type = sc.next();

        if(type.equalsIgnoreCase("Regular")){
            RegularEmployee r1 = new RegularEmployee(name, baseSalary,id);
            r1.CalculateSalary();
        }
        else if(type.equalsIgnoreCase("Contractor")){
            Contractor c1 = new Contractor(name,id,baseSalary);
            c1.CalculateSalary();
        }
        else if(type.equalsIgnoreCase("Manager")){
            Managers m1 = new Managers(name,id,baseSalary);
            m1.CalculateSalary();
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
