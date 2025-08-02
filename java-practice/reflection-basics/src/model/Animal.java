package model;

public class Animal {
    protected String name;

    public Animal() {
        this.name = "Unknown Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}
