package exercises;

import model.*;

public class Exercise2 {
    public static void main(String[] args) {
        Animal cat = new Cat("Mittens", true);
        Animal dog = new Dog("Rex", "Labrador");

        // Compare classes
        System.out.println("cat instanceof Dog → " + (cat instanceof Dog));       // false
        System.out.println("cat instanceof Cat → " + (cat instanceof Cat));       // true
        System.out.println("cat instanceof Animal → " + (cat instanceof Animal)); // true

        System.out.println("dog instanceof Dog → " + (dog instanceof Dog));       // true
        System.out.println("dog instanceof Animal → " + (dog instanceof Animal)); // true
    }
}
