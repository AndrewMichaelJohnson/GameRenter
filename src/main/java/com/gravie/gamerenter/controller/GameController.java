package com.gravie.gamerenter.controller;

import com.gravie.gamerenter.domain.Game;
import com.gravie.gamerenter.service.GiantBombService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1")
public class GameController {

    private GiantBombService service;

    @Autowired
    public GameController(GiantBombService service) {
        this.service = service;
    }

    @GetMapping(path = "/games/{gameId}",produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<Game> getGames(@PathVariable final String gameId) {
        return service.retrieveGame(gameId);
    }
}
