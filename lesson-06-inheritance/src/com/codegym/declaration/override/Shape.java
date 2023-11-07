package com.codegym.declaration.override;

public class Shape {
    private String name;
    public Shape (String name) {
        this.name = name;
    }
    protected void getName() {
        System.out.println("I am " +this.name);
    }
}
