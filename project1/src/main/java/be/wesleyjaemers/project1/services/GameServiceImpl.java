package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Games;
import be.wesleyjaemers.project1.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Games findById (Long id){

        return gameRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Games findByName(String name) {

        return gameRepository.findByName(name);
    }

    @Override
    public Games findByType (String type){

        return gameRepository.findByType(type);
    }


}
