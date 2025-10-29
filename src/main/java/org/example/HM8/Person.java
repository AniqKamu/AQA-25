package org.example.HM8;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    public String getName() {
        if (gender.equals("Male")) {
            return "Mr. " + name + " , " + age;
        } else {
            return "Mrs. " + name + " , " + age;
        }

    }

    public static void main(String[] args) {
        Person p1 = new Person("Anna", 18, "Female");
        Person p2 = new Person("John", 20, "Male");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
