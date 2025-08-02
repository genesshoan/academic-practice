package Ejercicio1;

public class Person {
    int age;

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age:" + age);
        }
        this.age = age;
    }
}
