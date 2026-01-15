import java.util.Scanner;

public class Employee {
    private String name;
    private double baseSalary=60000;
    private int id;

    public Employee(String name, double baseSalary, int id) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return  baseSalary;
    }
    public int getId() {
        return id;
    }
    Scanner sc = new Scanner(System.in);
    public void Details(){
        System.out.println("Employee's Name : "+sc.nextInt());
        System.out.println("Employee's ID : "+getId());

    }
}

