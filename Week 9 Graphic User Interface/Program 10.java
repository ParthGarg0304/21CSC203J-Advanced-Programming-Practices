public class Employee {
    private String name;
    private int employeeId;
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}

public class EmployeeView {
    public void printEmployeeDetails(String name, int employeeId) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getEmployeeId());
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeId(int employeeId) {
        model.setEmployeeId(employeeId);
    }
}

public class MVCEmployeeDemo {
    public static void main(String[] args) {
        // Create the Model, View, and Controller
        Employee employee = new Employee("John Doe", 101);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        // Display employee details
        controller.updateView();

        // Update employee data through the controller
        controller.setEmployeeName("Alice Smith");
        controller.setEmployeeId(102);

        // Display updated employee details
        controller.updateView();
    }
}
