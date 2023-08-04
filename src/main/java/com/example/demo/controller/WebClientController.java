package com.example.demo.controller;

import com.example.demo.model.Circuit;
import com.example.demo.service.ApiConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/webclient")
public class WebClientController {

    private ApiConsumer apiConsumer;

    public WebClientController(ApiConsumer apiConsumer) {
        this.apiConsumer = apiConsumer;
    }

    @GetMapping
    public List<Circuit> findAllCircuits() {
        return apiConsumer.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Circuit> findCircuitById(@PathVariable String id) {
        return apiConsumer.findById(id);
    }
}
