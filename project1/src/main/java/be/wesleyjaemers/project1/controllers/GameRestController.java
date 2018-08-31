package be.wesleyjaemers.project1.controllers;

import be.wesleyjaemers.project1.entities.Games;
import be.wesleyjaemers.project1.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@CrossOrigin (origins ="http://localhost:63342")
public class GameRestController {
    private final GameService gameService;

    @Autowired
    public GameRestController (GameService gameService){

        this.gameService = gameService;
    }

    @GetMapping("/(id)")
    public Games findGameById (@PathVariable Long id) {

        return gameService.findById(id);
    }

@GetMapping("/all")
    public List<Games> getAll() {
        return gameService.getGamesAll();
}
}
