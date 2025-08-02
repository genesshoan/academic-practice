package model;

public class User {
    private final String name;
    private final String email;
    private final int age;

    public User() {
        this.name = "Default User";
        this.email = "default@example.com";
        this.age = 18;
    }

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + "!");
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', age=" + age + "}";
    }
}
