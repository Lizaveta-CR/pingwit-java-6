package com.pingwit.core.les_26.classwork.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PingwitShorten {

    private String name;
    @JsonProperty("students")
    private List<PingwitStudent> studentsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PingwitStudent> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<PingwitStudent> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "PingwitShorten{" +
            "name='" + name + '\'' +
            ", studentsList=" + studentsList +
            '}';
    }
}
