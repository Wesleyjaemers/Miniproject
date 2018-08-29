package be.wesleyjaemers.project1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shops {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name, location, email, phone;

    public Shops () {

    }

    public Long getId() {
        return id;
    }

    public Shops setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Shops setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Shops setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Shops setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Shops setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
