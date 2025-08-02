package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Carlos", 4000.0);
        Employee partTimeEmployee = new PartTimeEmployee("Jose", 30.5, 50.0);

        Employee.printEmployeeInfo(fullTimeEmployee);
        Employee.printEmployeeInfo(partTimeEmployee);
    }
}
