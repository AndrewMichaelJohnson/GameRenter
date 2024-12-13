package com.gravie.gamerenter.service;

import com.gravie.gamerenter.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GiantBombService {
    ResponseEntity<Game> retrieveGame(String gameId);
    //List<Game> retrieveMatchingGames();
}
