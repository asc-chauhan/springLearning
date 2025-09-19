package com.example.autowire.type;

public class Specification {
    private String make;
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
//        System.out.println("Setter called");
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
//        System.out.println("Setter 2 called");
        this.make = make;
    }
    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
