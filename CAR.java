package car;
import java.util.Scanner;

public class CAR {
    // Private instance variables (encapsulation)
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Constructor
    public CAR(String company, String model, int year, double mileage) {
        this.company_name = company;
        this.model_name = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter and setter for company_name
    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    // Getter and setter for model_name
    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    // Getter and setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter only for mileage
    public double getMileage() {
        return mileage;
    }

    // Feature 1: Calculate car age
    public int getCarAge(int currentYear) {
        return currentYear - year;
    }

    // Feature 2: Check if car has high mileage
    public void checkHighMileage(double threshold) {
        if (mileage >= threshold) {
            System.out.println(model_name + " has high mileage!");
        } else {
            System.out.println(model_name + " has normal mileage.");
        }
    }

    // method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String company = sc.nextLine();

        System.out.print("Enter model name: ");
        String model = sc.nextLine();

        System.out.print("Enter manufacturing year: ");
        int year = sc.nextInt();

        System.out.print("Enter mileage: ");
        double mileage = sc.nextDouble();

        // Create Car object
        CAR car = new CAR(company, model, year, mileage);

        // Display car info using getters
        System.out.println("--- Car Details ---");
        System.out.println("Company: " + car.getCompanyName());
        System.out.println("Model: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage() + " km");

        // Use features
        System.out.println("Car age: " + car.getCarAge(2025) + " years"); // current year
        car.checkHighMileage(50000);

        sc.close();
    }
}