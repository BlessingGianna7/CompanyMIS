package com.gianna.demo3.Store;
import com.gianna.demo3.carpentry_mis.Carpenters;
import jakarta.persistence.*;

@Entity
@Table(name ="store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private Integer size;

    @OneToOne
    private Carpenters manager;

    public Store() {

    }

    public Store(String location, Integer size, Carpenters manager) {
        this.location = location;
        this.size = size;
        this.manager = manager;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Carpenters getManager() {
        return manager;
    }

    public void setManager(Carpenters manager) {
        this.manager = manager;
    }
}

