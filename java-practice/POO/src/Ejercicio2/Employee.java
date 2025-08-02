package Ejercicio2;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public static void printEmployeeInfo(Employee e) {
        System.out.println(e.name);
        System.out.println(e.getSalary());
    }

    public abstract double getSalary();
}
