package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Carlos", 4000.0);
        Employee partTimeEmployee = new PartTimeEmployee("Jose", 30.5, 50.0);

        Employee.printEmployeeInfo(fullTimeEmployee);
        Employee.printEmployeeInfo(partTimeEmployee);

        System.out.println("Employee counter: " + Employee.getCounter());

        System.out.println(fullTimeEmployee.equals(partTimeEmployee));
        Employee e1 = new FullTimeEmployee("Carlos", 4000.0);
        System.out.println(fullTimeEmployee.equals(e1));
        Employee e2 = new FullTimeEmployee("Pepe", 40.40);
        System.out.println(fullTimeEmployee.equals(e2));
    }
}
