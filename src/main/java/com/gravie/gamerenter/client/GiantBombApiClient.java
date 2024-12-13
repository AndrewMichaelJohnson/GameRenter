package com.gravie.gamerenter.client;

import com.gravie.gamerenter.domain.Game;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GiantBombApiClient {

    @Value("${giant.bomb.api.key}")
    private String apiKey;

    private RestTemplate restTemplate = new RestTemplate();
    private String apiSearchURL = "https://www.giantbomb.com/api/games/?api_key=%s&format=json&limit=10&name=%s";
    private String apiGameURL = "https://www.giantbomb.com/api/games/?api_key=%s&guid=%s&format=json";

    public List<Game> searchByNane(String gameName) {
        //ToDo I need to sanitize?
        return new ArrayList<>();
    }

    public ResponseEntity<Game> getGame(String gameID) {
        System.out.println(String.format(apiGameURL, apiKey, gameID));
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("user-agent", "Andrew Johnson Gravie project bot");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        //ResponseEntity<User[]> responseEntity = restTemplate.exchange("/users", HttpMethod.GET, entity, User[].class);


        return restTemplate.exchange(String.format(apiGameURL, apiKey, gameID), HttpMethod.GET, entity, Game.class);
        //return restTemplate.getForObject(String.format(apiGameURL, apiKey, gameID), Game.class);
    }
}
