package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Clients;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Clients findById (Long id);
    Clients findByFirstName (String firstName);
    Clients findByLastName (String lastName);
    void saveClient(Clients clients);
}
