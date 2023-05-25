package com.pingwit.core.les_6.point_1;

public class Student {

    static {
        counter = 2;
        System.out.println("Static init block");
    }

    static String className;
    static int counter;
    int counterNotStatic;
    String name;
    String surname;
    int age;

    public Student() {
        this.name = "DefaultEgorka";
        this.age = 33;
        this.counterNotStatic++;
//        counter++;
    }

    public Student(String stName, String stSurname, int age) {
        this.name = stName;
        this.surname = stSurname;
        this.age = age;
        this.counterNotStatic++;
//        counter++;
    }

    public Student(String stName, int age) {
        this.name = stName;
        this.surname = "Default";
        this.age = age;
        this.counterNotStatic++;
//        counter++;
    }

    @Override
    public String toString() {
        return "Student{" +
            " name ='" + name + '\'' +
            ", surname ='" + surname + '\'' +
            ", age =" + age +
            '}';
    }

    void displayInfo() {
        System.out.println("Name: " + name + ",surname = " + surname + ", age = " + age + ", className ="
            + className + ", counter = " + counter + ", counterNotStatic = " + counterNotStatic);
    }

    {
        counter++;
        System.out.println("init block");
    }
}
