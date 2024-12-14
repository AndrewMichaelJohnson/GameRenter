package com.gravie.gamerenter.client;

import com.gravie.gamerenter.domain.SearchGameResult;
import com.gravie.gamerenter.domain.SingleGameResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class GiantBombApiClient {

    @Value("${giant.bomb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<SearchGameResult> searchByName(String gameName) {
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        return restTemplate.exchange(String.format("https://www.giantbomb.com/api/games/?api_key=%s&format=json&limit=10&name=%s", apiKey, gameName), HttpMethod.GET, entity, SearchGameResult.class);
    }

    public ResponseEntity<SingleGameResponse> getGame(String gameID) {
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        return restTemplate.exchange(String.format("https://www.giantbomb.com/api/game/%s/?api_key=%s&format=json", gameID, apiKey ), HttpMethod.GET, entity, SingleGameResponse.class);
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.set("user-agent", "Andrew Johnson Gravie project bot");
        return headers;
    }
}
