/*package be.wesleyjaemers.project1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private int orderNr;
    private Clients clients;
    private List <Games> games;
    private Shops shop;

    public Orders(){
    }

    public Long getId() {
        return id;
    }

    public Orders setId(Long id) {
        this.id = id;
        return this;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public Orders setOrderNr(int orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    public Clients getClients() {
        return clients;
    }

    public Orders setClients(Clients clients) {
        this.clients = clients;
        return this;
    }

    public List<Games> getGames() {
        return games;
    }

    public Orders setGames(List<Games> games) {
        this.games = games;
        return this;
    }

    public Shops getShop() {
        return shop;
    }

    public Orders setShop(Shops shop) {
        this.shop = shop;
        return this;
    }
} */
