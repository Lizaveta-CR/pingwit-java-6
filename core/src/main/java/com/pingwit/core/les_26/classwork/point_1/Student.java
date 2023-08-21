package com.pingwit.core.les_26.classwork.point_1;

import com.google.gson.annotations.SerializedName;

public class Student {
   private Long id;
   @SerializedName("firstName")
   private String name;
   private String course;

    public Student(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", course='" + course + '\'' +
            '}';
    }
}
