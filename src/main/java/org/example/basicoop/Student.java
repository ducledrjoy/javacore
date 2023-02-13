package org.example.basicoop;

public class Student {

    private int age;
    private String name;

    public Student(int age, String name) {

       this.age = age;
       this.name = name;
    }

    private int getAge() {
        return this.age;
    }

    private String getName() {
        return this.name;
    }

}
