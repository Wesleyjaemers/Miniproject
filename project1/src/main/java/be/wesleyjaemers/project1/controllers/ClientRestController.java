package be.wesleyjaemers.project1.controllers;

import be.wesleyjaemers.project1.entities.Clients;
import be.wesleyjaemers.project1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping ("/client")
    public class ClientRestController {
    private final ClientService clientService;

    @Autowired
    public ClientRestController (ClientService clientService){

        this.clientService = clientService;
    }

    @GetMapping ("/(id)")
    public Clients findClientById (@PathVariable Long id) {

        return clientService.findById(id);
    }




}
