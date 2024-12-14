package com.gravie.gamerenter.service;

import com.gravie.gamerenter.domain.SearchGameResult;
import com.gravie.gamerenter.domain.SingleGameResponse;
import org.springframework.http.ResponseEntity;

public interface GiantBombService {
    ResponseEntity<SingleGameResponse> retrieveGame(String gameId);
    ResponseEntity<SearchGameResult> searchGame(String query);
}
