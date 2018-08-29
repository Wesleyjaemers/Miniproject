package be.wesleyjaemers.project1.services;

import be.wesleyjaemers.project1.entities.Games;
import org.springframework.stereotype.Service;

@Service
public interface GameService {

    Games findById (Long id);
    Games findByName(String name);
    Games findByType(String type);
}
