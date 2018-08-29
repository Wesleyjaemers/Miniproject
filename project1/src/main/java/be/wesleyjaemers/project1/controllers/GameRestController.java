package be.wesleyjaemers.project1.controllers;

import be.wesleyjaemers.project1.entities.Games;
import be.wesleyjaemers.project1.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
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


}
