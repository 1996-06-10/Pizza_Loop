package com.example.pizzaloop.model;

public class Pizza {

    int pizza_Id;
    String name;
    String description;
    double price;
    String image_url;

    public Pizza() {
    }

    public Pizza(int pizzaId, String name, String description, int price, String imageUrl) {
        this.pizza_Id = pizza_Id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image_url = image_url;
    }

    public int getPizza_Id() {
        return pizza_Id;
    }

    public void setPizza_Id(int pizza_Id) {
        this.pizza_Id = pizza_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
