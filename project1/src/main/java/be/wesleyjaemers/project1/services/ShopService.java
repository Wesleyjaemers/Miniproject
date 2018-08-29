package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Shops;
import org.springframework.stereotype.Service;

@Service
public interface ShopService {

    Shops findById (Long id);
    Shops findByName (String name);
    Shops findByLocation (String location);
    Shops findByEmail (String email);
}