import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

class StudentView {
    public void printStudentDetails(String studentName, int studentRollNumber) {
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + studentRollNumber);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNumber(int rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public int getStudentRollNumber() {
        return model.getRollNumber();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNumber());
    }
}

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create the Model, View, and Controller
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Update student data through the controller
        controller.setStudentName("John");
        controller.setStudentRollNumber(101);

        // Display student details through the controller
        controller.updateView();

        // Update the model data directly
        model.setName("Alice");
        model.setRollNumber(102);

        // Display student details directly
        view.printStudentDetails(model.getName(), model.getRollNumber());
    }
}

