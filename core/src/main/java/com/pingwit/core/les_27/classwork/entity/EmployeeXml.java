package com.pingwit.core.les_27.classwork.entity;

import java.util.Objects;

public class EmployeeXml {

    private String id;
    private String firstName;
    private String lastName;
    private String location;
    private int age;

    public EmployeeXml() {
    }

    public EmployeeXml(String id, String firstName, String lastName, String location, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeXml that = (EmployeeXml) o;
        return age == that.age && Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName,
            that.lastName) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, location, age);
    }

    @Override
    public String toString() {
        return "EmployeeXml{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", location='" + location + '\'' +
            ", age=" + age +
            '}';
    }
}
