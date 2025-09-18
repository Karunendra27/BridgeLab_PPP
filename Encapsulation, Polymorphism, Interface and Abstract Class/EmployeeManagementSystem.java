import java.util.*;

// Interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

   
    public abstract double calculateSalary();

    
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Subclass 
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); 
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Subclass 
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;

    public PartTimeEmployee(int id, String name, double baseSalary, int workHours) {
        super(id, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee f1 = new FullTimeEmployee(101, "Riya", 40000);
        f1.assignDepartment("IT");

        PartTimeEmployee p1 = new PartTimeEmployee(102, "Shreya", 500, 40);
        p1.assignDepartment("Support");

        employees.add(f1);
        employees.add(p1);

        // Polymorphism 
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Final Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            }
            
        }
    }
}
