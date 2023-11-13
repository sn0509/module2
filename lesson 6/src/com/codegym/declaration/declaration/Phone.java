package com.codegym.declaration.declaration;

public class Phone {
    private String colors;
    private String model;
    private long id;
    private double size;
    private double price;
    private int quantity;

    public Phone(String colors, String model, long id, double size, double price, int quantity) {
        this.colors = colors;
        this.model = model;
        this.id = id;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
