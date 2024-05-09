package com.gianna.demo3.carpentry_mis;

import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

@Entity
@Table(name ="carpenter")
public class Carpenters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private String address;

    public Carpenters() {

    }

    public Carpenters(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
