package be.wesleyjaemers.project1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name, type;
    private int stock;
    private double price;

    public Games () {

    }

    public Long getId() {
        return id;
    }

    public Games setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Games setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Games setType(String type) {
        this.type = type;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public Games setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Games setPrice(double price) {
        this.price = price;
        return this;
    }
}
