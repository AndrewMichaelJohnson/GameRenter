package com.gravie.gamerenter.client;

import com.gravie.gamerenter.domain.SearchGameResult;
import com.gravie.gamerenter.domain.SingleGameResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GiantBombApiClient {

    @Value("${giant.bomb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<SearchGameResult> searchByName(String searchValue) {
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        System.out.println("Sending this request: " + String.format("https://www.giantbomb.com/api/search/?api_key=%s&format=json&limit=10&query=%s&resources=game", apiKey, searchValue));
            return restTemplate.exchange(String.format("https://www.giantbomb.com/api/search/?api_key=%s&format=json&limit=10&query=%s&resources=game", apiKey, searchValue), HttpMethod.GET, entity, SearchGameResult.class);
    }

    public ResponseEntity<SingleGameResponse> getGame(String gameID) {
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        System.out.println("Sending this request: " + String.format("https://www.giantbomb.com/api/game/%s/?api_key=%s&format=json&resources=game", gameID, apiKey ));
        return restTemplate.exchange(String.format("https://www.giantbomb.com/api/game/%s/?api_key=%s&format=json&resources=game", gameID, apiKey ), HttpMethod.GET, entity, SingleGameResponse.class);
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.set("user-agent", "Andrew Johnson Gravie project bot");
        return headers;
    }
}
