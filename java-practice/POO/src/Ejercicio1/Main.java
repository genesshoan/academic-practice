package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        try {
            person.setAge(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
