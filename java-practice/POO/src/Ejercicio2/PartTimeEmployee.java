package Ejercicio2;

public class PartTimeEmployee extends Employee {

    double hoursWorked, hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(double hoursWorked, double hourlyRate) {
        this("Unnamed",  hoursWorked, hourlyRate);
    }

    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }
}
