package be.wesleyjaemers.project1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String firstName, lastName;
    private LocalDate birthDay;

    public Clients() {
    }

    public Long getId() {
        return id;
    }

    public Clients setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Clients setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Clients setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Clients setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }
}

