package model;

public class Dog extends Animal {
    private final String breed;

    public Dog() {
        super("Dog");
        this.breed = "Mixed";
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        bark();
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "'}";
    }
}
