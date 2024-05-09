package com.gianna.demo3.customer;
import com.gianna.demo3.carpentry_mis.Carpenters;
import com.gianna.demo3.furniture.Furniture;
import jakarta.persistence.*;

@Entity
@Table(name ="customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @ManyToOne
    private Carpenters carpenter;

    @ManyToOne
    private Furniture furniture;

    public Customers() {

    }

    public Customers(String name, String location, Carpenters carpenter, Furniture furniture) {
        this.name = name;
        this.location = location;
        this.carpenter = carpenter;
        this.furniture = furniture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Carpenters getCarpenter() {
        return carpenter;
    }

    public void setCarpenter(Carpenters carpenter) {
        this.carpenter = carpenter;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }
}

