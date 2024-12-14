package com.gravie.gamerenter.controller;

import com.gravie.gamerenter.domain.SearchGameResult;
import com.gravie.gamerenter.domain.SingleGameResponse;
import com.gravie.gamerenter.service.GiantBombService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1")
public class GameController {

    private final GiantBombService service;

    @Autowired
    public GameController(GiantBombService service) {
        this.service = service;
    }

    @GetMapping(path = "/games/{gameId}",produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<SingleGameResponse> getGame(@PathVariable final String gameId) {
        return service.retrieveGame(gameId);
    }

    @GetMapping(path = "/games/searchbyname/{gameName}",produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<SearchGameResult> searchGames(@PathVariable final String gameName) {
        return service.searchGame(gameName);
    }

}
