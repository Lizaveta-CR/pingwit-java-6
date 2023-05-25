package com.pingwit.core.les_6.point_1;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        String surname = scanner.next();
//        int age = scanner.nextInt();
        Student egor = new Student("name", "surname", 77);
        Student.className = "STATIC";
        egor.displayInfo();
        Student student = new Student();
        student.displayInfo();
        egor.displayInfo();
        Student elizabet = new Student("Elizabet", 33);
        elizabet.displayInfo();
        System.out.println(egor);
        System.out.println(student);
        System.out.println(elizabet);
    }
}
