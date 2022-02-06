package ru.platform.learning.databasehandler.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MainClient {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${main.base-url}")
    private String mainBaseUrl;

    public void startCleanRepo(){
        restTemplate.getForObject(mainBaseUrl, Void.class);
    }

}
