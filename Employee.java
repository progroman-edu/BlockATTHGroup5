
// JAVA PROGRAMMING PART 1; Private instance: class "Employee", using the variables employee_name, id and salary TO APPLY it base on the given problem
// FEATURED: CODE THAT CHECKS IF THE SALARY IS HIGH OR LOW

package employee;

import java.util.Scanner;

public class Employee {  
    
    
    // Private instance variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    // Getter and setter for employee_id
    public int getEmployeeID() {
        return employee_id;
    }

    public void setEmployeeID(int id) {
        this.employee_id = id;
    }

    // Getter and setter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    // Getter for salary
    public double getEmployeeSalary() {
        return employee_salary;
    }

    // Feature: Check if salary is high or low
    public void checkEmployeeSalary(double threshold) {
        if (employee_salary >= threshold) {
            System.out.println(employee_name + "'s salary is high!");
        } else {
            System.out.println(employee_name + "'s salary is low!");
        }
    }

    //  Scanner
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int id = in.nextInt();
        in.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = in.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = in.nextDouble();

        // Create Employee object using with input data
        Employee emp = new Employee(id, name, salary);

       
        
        // Display employee details for getters
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + emp.getEmployeeID());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("Salary: " + emp.getEmployeeSalary());

        //feature
        emp.checkEmployeeSalary(20000);
        

        in.close();
    }
}


