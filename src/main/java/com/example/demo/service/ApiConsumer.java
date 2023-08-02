package com.example.demo.service;

import com.example.demo.model.Circuit;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ApiConsumer {

    WebClient webClient;

    public ApiConsumer() {
        this.webClient = WebClient.create("http://localhost:8080");;
    }

    public List<Circuit> findAll() {
        return webClient.get()
                .uri("/api/circuit")
                .retrieve()
                .bodyToFlux(Circuit.class)
                .collectList()
                .block();
    }

    public Mono<Circuit> findById(String id) {
        return webClient.get()
                .uri("/api/circuit/" + id)
                .retrieve()
                .bodyToMono(Circuit.class);
    }
}
