package Ejercicio2;

public class PartTimeEmployee extends Employee {

    double hoursWorked, hourlyRate;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }
}
