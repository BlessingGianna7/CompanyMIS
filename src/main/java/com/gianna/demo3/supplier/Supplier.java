package com.gianna.demo3.supplier;

import jakarta.persistence.*;
import com.gianna.demo3.carpentry_mis.Carpenters;
import java.util.Date;

@Entity
@Table(name ="supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private Double price;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @ManyToOne
    private Carpenters carpenter;

    public Supplier() {

    }

    public Supplier(String location, Double price, Date startDate, Carpenters carpenter) {
        this.location = location;
        this.price = price;
        this.startDate = startDate;
        this.carpenter = carpenter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Carpenters getCarpenter() {
        return carpenter;
    }

    public void setCarpenter(Carpenters carpenter) {
        this.carpenter = carpenter;
    }
}


