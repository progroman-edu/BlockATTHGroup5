import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Constructor
    public Employee(int employee_id, String employee_name, double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    // Getters and Setters
    public int getEmployeeId() { return employee_id; }
    public void setEmployeeId(int id) { this.employee_id = id; }

    public String getEmployeeName() { return employee_name; }
    public void setEmployeeName(String name) { this.employee_name = name; }

    // Salary Getter (formatted string)
    public String getFormattedSalary() {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(employee_salary);
    }

    // Display info
    public String toString() {
        return "Employee ID: " + employee_id +
                "\nName: " + employee_name +
                "\nSalary: " + getFormattedSalary();
    }
}

class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Additional Features 
    private String color;
    private String engineType;
    private boolean automatic; //Pardo
    private double fuelCapacity; //Pardo

    // Constructor
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    // Getters & Setters
    public String getCompanyName() { return company_name; }
    public void setCompanyName(String name) { this.company_name = name; }

    public String getModelName() { return model_name; }
    public void setModelName(String name) { this.model_name = name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // Mileage getter only
    public double getMileage() { return mileage; }

    // Extra features
    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    public void setEngineType(String type) { this.engineType = type; }
    public String getEngineType() { return engineType; }
    
    public void setAutomatic(boolean automatic) { this.automatic = automatic; } //Pardo
    public boolean isAutomatic() { return automatic; }

    public void setFuelCapacity(double fuelCapacity) { this.fuelCapacity = fuelCapacity; } //Pardo
    public double getFuelCapacity() { return fuelCapacity; }
    
    public String toString() {
        return "Car Company: " + company_name +
                "\nModel: " + model_name +
                "\nYear: " + year +
                "\nMileage: " + mileage +
                "\nColor: " + color +
                "\nEngine: " + engineType+
                "\nAutomatic: " + (automatic ? "Yes" : "No") + //Pardo
                "\nFuel Capacity: " + fuelCapacity + "L"; //Pardo
    }
}

public class MainProgram {
    public static void main(String[] args) {
        while (true) {
            String menu = JOptionPane.showInputDialog(
                    "Choose an option:\n"
                    + "1. Create & View Employee\n"
                    + "2. Create & View Car\n"
                    + "3. Exit"
            );

            if (menu == null || menu.equals("3")) {
                JOptionPane.showMessageDialog(null, "Program Ended.");
                break;
            }

            switch (menu) {
                case "1":
                    createEmployee();
                    break;

                case "2":
                    createCar();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
        }
    }

    // Employee Menu
    public static void createEmployee() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID:"));
        String name = JOptionPane.showInputDialog("Enter Employee Name:");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary:"));

        Employee emp = new Employee(id, name, salary);

        JOptionPane.showMessageDialog(null, emp.toString());
    }

    // Car Menu
    public static void createCar() {
        String company = JOptionPane.showInputDialog("Company Name:");
        String model = JOptionPane.showInputDialog("Model Name:");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Year:"));
        double mileage = Double.parseDouble(JOptionPane.showInputDialog("Mileage:"));

        Car car = new Car(company, model, year, mileage);

        car.setColor(JOptionPane.showInputDialog("Color:"));
        car.setEngineType(JOptionPane.showInputDialog("Engine Type:"));
        car.setAutomatic(JOptionPane.showConfirmDialog(null, "Automatic Transmission?") == 0); //Pardo
        car.setFuelCapacity(Double.parseDouble(JOptionPane.showInputDialog("Fuel Capacity (L):"))); //Pardo


        JOptionPane.showMessageDialog(null, car.toString());
    }
}

