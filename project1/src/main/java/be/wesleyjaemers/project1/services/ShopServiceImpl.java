package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Shops;
import be.wesleyjaemers.project1.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shops findById(Long id) {
        return shopRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Shops findByName(String name) {

        return shopRepository.findByName(name);
    }

    @Override
    public Shops findByLocation(String location) {

        return shopRepository.findByLocation(location);
    }

    @Override
    public Shops findByEmail(String email) {

        return shopRepository.findByEmail(email);
    }
}
