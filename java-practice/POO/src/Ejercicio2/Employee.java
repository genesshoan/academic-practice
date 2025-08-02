package Ejercicio2;

public abstract class Employee {
    protected String name;
    public static int counter = 0;

    public Employee(String name) {
        this.name = name;
        counter++;
    }

    public static void printEmployeeInfo(Employee e) {
        System.out.println(e.name);
        System.out.println(e.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + '\'' + ", salary=" + getSalary() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null ||  getClass() != obj.getClass()) {
            return false;
        }
        Employee e = (Employee) obj;
        return this.name.equals(e.name);
    }

    public static int getCounter() {
        return counter;
    }

    public abstract double getSalary();
}
