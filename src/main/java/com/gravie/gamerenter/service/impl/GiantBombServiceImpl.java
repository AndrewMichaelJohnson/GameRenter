package com.gravie.gamerenter.service.impl;

import com.gravie.gamerenter.client.GiantBombApiClient;
import com.gravie.gamerenter.domain.SearchGameResult;
import com.gravie.gamerenter.domain.SingleGameResponse;
import com.gravie.gamerenter.service.GiantBombService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GiantBombServiceImpl implements GiantBombService {

    private final GiantBombApiClient client;

    @Autowired
    public GiantBombServiceImpl(GiantBombApiClient client) {
        this.client = client;
    }

    public ResponseEntity<SingleGameResponse> retrieveGame(String gameId) {
        return client.getGame(gameId);
    }

    public ResponseEntity<SearchGameResult> searchGame(String query) {
        return client.searchByName(query);
    }
}
