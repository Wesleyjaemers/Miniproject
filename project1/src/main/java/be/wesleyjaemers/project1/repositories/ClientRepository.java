package be.wesleyjaemers.project1.repositories;

import be.wesleyjaemers.project1.entities.Clients;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<Clients, Long> {
    Clients findByFirstName(String firstName);
    Clients findByLastName(String firstName);

}
