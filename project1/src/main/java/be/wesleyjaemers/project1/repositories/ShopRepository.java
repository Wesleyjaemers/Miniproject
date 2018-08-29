package be.wesleyjaemers.project1.repositories;

import be.wesleyjaemers.project1.entities.Shops;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends PagingAndSortingRepository<Shops, Long> {
    Shops findByName(String name);
    Shops findByLocation (String location);
    Shops findByPhone (int phone);
    Shops findByEmail (String email);

}
