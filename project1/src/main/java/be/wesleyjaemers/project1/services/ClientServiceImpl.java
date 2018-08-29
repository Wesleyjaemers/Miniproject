package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Clients;
import be.wesleyjaemers.project1.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Clients findById(Long id) {
        return clientRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Clients findByFirstName(String firstName) {
        return clientRepository.findByFirstName(firstName);
    }

    @Override
    public Clients findByLastName(String lastName) {
        return clientRepository.findByLastName(lastName);
    }

    @Override
    public void saveClient(Clients clients) {

        clientRepository.save(clients);

    }
}
