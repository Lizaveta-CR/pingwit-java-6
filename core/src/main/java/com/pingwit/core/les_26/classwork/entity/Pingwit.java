package com.pingwit.core.les_26.classwork.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pingwit {

    private String name;
    private double courseLength;
    private List<PingwitStudent> students;
    private Program program;

    public Pingwit() {
    }

    public Pingwit(String name, double courseLength, List<PingwitStudent> students, Program program) {
        this.name = name;
        this.courseLength = courseLength;
        this.students = students;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(double courseLength) {
        this.courseLength = courseLength;
    }

    public List<PingwitStudent> getStudents() {
        return students;
    }

    public void setStudents(List<PingwitStudent> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Pingwit{" +
            "name='" + name + '\'' +
            ", courseLength=" + courseLength +
            ", students=" + students +
            ", program=" + program +
            '}';
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
