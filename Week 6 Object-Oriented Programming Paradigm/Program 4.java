/*program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/


class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee instance
        Employee employee = new Employee(50000.0);
        System.out.println("Employee Salary: " + employee.getSalary());
        employee.work(); // Call the work() method of Employee class

        System.out.println();

        // Create an HRManager instance
        HRManager hrManager = new HRManager(80000.0);
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        hrManager.work(); // Call the overridden work() method of HRManager class
        hrManager.addEmployee(); // Call the specific method of HRManager class
    }
}
