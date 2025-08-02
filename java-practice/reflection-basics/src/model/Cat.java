package model;

public class Cat extends Animal {
    private final boolean isIndoor;

    public Cat() {
        super("Cat");
        this.isIndoor = true;
    }

    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public void makeSound() {
        meow();
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', indoor=" + isIndoor + "}";
    }
}
