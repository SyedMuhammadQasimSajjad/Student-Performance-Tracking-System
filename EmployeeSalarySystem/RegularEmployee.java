public class RegularEmployee extends Employee {
    double salary;
    double baseSalary=60000;
    public RegularEmployee(String name, double baseSalary, int id) {
        super(name, baseSalary, id);
    }

    public void CalculateSalary() {
       
        salary = baseSalary;
        System.out.println("salary for  employee "+getName()+"\n id-"+getId()+" is : " +salary);

    }
}
