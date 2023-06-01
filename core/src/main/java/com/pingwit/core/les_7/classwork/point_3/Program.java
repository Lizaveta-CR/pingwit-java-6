package com.pingwit.core.les_7.classwork.point_3;

public class Program {

    public static void main(String[] args) {
        Student kolya = new Student("Kolya");
        System.out.println(kolya.getName());
        Program program = new Program();
        program.changeName(kolya);
        System.out.println(kolya.getName());
        program.changeStudent(kolya);
        System.out.println(kolya.getName());
    }

    void changeName(Student student) {
        student.setName("Alice");
    }

    void changeStudent(Student student) {
        student = new Student("Nastya");
        student.setName("Nastya");
    }
}
