package com.example.demo.models;

public class Computer {
    private int id;
    private String name;
    private double price; 
    private String comment;
    public Computer() {
    }
    public Computer(int id, String name, double price, String comment) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.comment = comment;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
