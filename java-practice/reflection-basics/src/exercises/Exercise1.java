package exercises;

import model.*;

public class Exercise1 {
    public static void main(String[] args) {
        Animal cat = new Cat("Mittens", true);
        Animal dog = new Dog("Rex", "Labrador");

        // Print actual runtime class names
        System.out.println("cat.getClass() = " + cat.getClass().getName()); // model.Cat
        System.out.println("dog.getClass() = " + dog.getClass().getName()); // model.Dog

        // Compare classes
        System.out.println("cat.getClass() == Dog.class → " + (cat.getClass() == Dog.class));       // false
        System.out.println("cat.getClass() == Cat.class → " + (cat.getClass() == Cat.class));       // true
        System.out.println("cat.getClass() == Animal.class → " + (cat.getClass() == Animal.class)); // false

        System.out.println("dog.getClass() == Dog.class → " + (dog.getClass() == Dog.class));       // true
        System.out.println("dog.getClass() == Animal.class → " + (dog.getClass() == Animal.class)); // false
    }
}
