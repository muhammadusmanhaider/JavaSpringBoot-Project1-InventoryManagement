package com.springclassproject.springclassproject.Models;
import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory

{
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "description")
    private String Description;
    @Column(name = "price")
    private String Price;
    @Column(name = "color")
    private String Color;

    public Inventory()
    {

    }
    public Inventory(String Price, String Description, String id, String Color) {
        this.Description = Description;
        this.Price = Price;
        this.id = id;
        this.Color = Color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}