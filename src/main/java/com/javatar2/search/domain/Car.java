package com.javatar2.search.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Esmaeil Sadeghi, 6/22/2020 11:39 AM
 */

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID = -3187480027431265380L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String color;

    private String model;

    @Column(name = "creationyear")
    private Integer creationyear;

    private String brand;

    private Integer price;

    @JoinColumn(name = "options_id")
    @OneToOne
    private Options options;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCreationyear() {
        return creationyear;
    }

    public void setCreationyear(Integer creationYear) {
        this.creationyear = creationYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Object getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }
}
