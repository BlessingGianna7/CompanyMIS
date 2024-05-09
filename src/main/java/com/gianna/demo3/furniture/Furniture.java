package com.gianna.demo3.furniture;

import jakarta.persistence.*;
import com.gianna.demo3.carpentry_mis.Carpenters;
import  com.gianna.demo3.Store.Store;
@Entity
@Table(name ="furniture")
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;
    private Double price;

    @ManyToOne
    private Carpenters carpenter;

    @ManyToOne
    private Store store;

    public Furniture() {

    }

    public Furniture(String color, Double price, Carpenters carpenter, Store store) {
        this.color = color;
        this.price = price;
        this.carpenter = carpenter;
        this.store = store;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Carpenters getCarpenter() {
        return carpenter;
    }

    public void setCarpenter(Carpenters carpenter) {
        this.carpenter = carpenter;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}

