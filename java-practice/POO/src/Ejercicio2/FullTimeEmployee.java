package Ejercicio2;

public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) throws IllegalArgumentException {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException();
        }
        this.monthlySalary = monthlySalary;
    }
}
