package com.pingwit.core.les_13.homework.task_2;

import java.util.Objects;

public class Computer extends Product {
    private String processor;
    private int ram;

    public Computer(String name, double price, int quantity, String processor, int ram) {
        super(name, price, quantity);
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "processor='" + processor + '\'' +
            ", ram=" + ram +
            "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, ram);
    }
}
